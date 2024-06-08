package dao;
import java.util.ArrayList;

import domain.Hospede;

public class HospedeDAO {
    
    public boolean cadastrar(Hospede h) {
        return true;
    }

    public boolean editar(Hospede h) {
        return true;
    }

    public Hospede consultar(Hospede h) {
        return h;
    }

    public ArrayList<Hospede> listar(Hospede h) {
        ArrayList<Hospede> lista = new ArrayList<Hospede>();
        return lista;
    }
}
