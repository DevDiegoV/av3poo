package dao;
import java.util.ArrayList;

import domain.Servico;

public class ServicoDAO {
    
    public boolean cadastrar(Servico s) {
        return true;
    }

    public boolean editar(Servico s) {
        return true;
    }

    public Servico consultar(Servico s) {
        return s;
    }

    public ArrayList<Servico> listar(Servico s) {
        ArrayList<Servico> lista = new ArrayList<Servico>();
        return lista;
    }
}
