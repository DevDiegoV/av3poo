package dao;
import java.util.ArrayList;

import domain.Quarto;

public class QuartoDAO {
    
    public boolean cadastrar(Quarto q) {
        return true;
    }

    public boolean editar(Quarto q) {
        return true;
    }

    public Quarto consultar(Quarto q) {
        return q;
    }

    public ArrayList<Quarto> listar(Quarto q) {
        ArrayList<Quarto> lista = new ArrayList<Quarto>();
        return lista;
    }
}
