package dao;
import java.util.ArrayList;

import domain.Consumo;

public class ConsumoDAO {
    
    public boolean cadastrar(Consumo c) {
        return true;
    }

    public boolean editar(Consumo c) {
        return true;
    }

    public Consumo consultar(Consumo c) {
        return c;
    }

    public ArrayList<Consumo> listar(Consumo c) {
        ArrayList<Consumo> lista = new ArrayList<Consumo>();
        return lista;
    }
}
