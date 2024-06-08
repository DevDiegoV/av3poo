package dao;
import java.util.ArrayList;

import domain.CategoriaItem;

public class CategoriaItemDAO {
    
    public boolean cadastrar(CategoriaItem ci) {
        return true;
    }

    public boolean editar(CategoriaItem ci) {
        return true;
    }

    public CategoriaItem consultar(CategoriaItem ci) {
        return ci;
    }

    public ArrayList<CategoriaItem> listar(CategoriaItem ci) {
        ArrayList<CategoriaItem> lista = new ArrayList<CategoriaItem>();
        return lista;
    }
}
