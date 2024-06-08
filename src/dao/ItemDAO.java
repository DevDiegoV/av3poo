package dao;
import java.util.ArrayList;

import domain.Item;

public class ItemDAO {
    
    public boolean cadastrar(Item i) {
        return true;
    }

    public boolean editar(Item i) {
        return true;
    }

    public Item consultar(Item i) {
        return i;
    }

    public ArrayList<Item> listar(Item i) {
        ArrayList<Item> lista = new ArrayList<Item>();
        return lista;
    }
}
