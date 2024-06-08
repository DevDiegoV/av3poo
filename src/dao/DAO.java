package dao;

import java.util.List;

public interface DAO<T> {
    public void save(T t) throws Exception;
    public void update(T t) throws Exception;
    public void delete(T t) throws Exception;
    public T findById(String id) throws Exception;
    public List<T> findAll() throws Exception;
}
