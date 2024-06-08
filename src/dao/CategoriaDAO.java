package dao;
import java.util.ArrayList;

import domain.Categoria;

public class CategoriaDAO {
  
    public boolean cadastrar(Categoria c) {
        return true;
    }  

    public boolean editar(Categoria c) {
        return true;
    } 

    public Categoria consultar(Categoria c) {
        return c;
    }

    public ArrayList<Categoria> listar(Categoria c) {
        ArrayList<Categoria> lista = new ArrayList<Categoria>();
        return lista;
    }
}
