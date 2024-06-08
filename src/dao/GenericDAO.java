package dao;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public abstract class GenericDAO<T> implements DAO<T> {
    private final String filePath;

    public GenericDAO(String filePath) {
        this.filePath = filePath;
    }

    protected abstract T fromString(String line);
    protected abstract String toString(T t);
    protected abstract String getId(T t);

    @Override
    public void save(T t) throws Exception {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))) {
            writer.write(toString(t));
            writer.newLine();
        }
    }

    @Override
    public void update(T t) throws Exception {
        List<T> items = findAll();
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            for (T item : items) {
                if (item.equals(t)) {
                    writer.write(toString(t));
                } else {
                    writer.write(toString(item));
                }
                writer.newLine();
            }
        }
    }

    @Override
    public void delete(T t) throws Exception {
        List<T> items = findAll();
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            for (T item : items) {
                if (!item.equals(t)) {
                    writer.write(toString(item));
                    writer.newLine();
                }
            }
        }
    }

    @Override
    public T findById(String id) throws Exception {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                T item = fromString(line);
                if (getId(item).equals(id)) {
                    return item;
                }
            }
        }
        return null;
    }

    @Override
    public List<T> findAll() throws Exception {
        List<T> items = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                items.add(fromString(line));
            }
        }
        return items;
    }
}
