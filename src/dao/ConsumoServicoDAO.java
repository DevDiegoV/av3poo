package dao;
import java.util.ArrayList;

import domain.ConsumoServico;

public class ConsumoServicoDAO {
    
    public boolean cadastrar(ConsumoServico cs) {
        return true;
    }

    public boolean editar(ConsumoServico cs) {
        return true;
    }

    public ConsumoServico consultar(ConsumoServico cs) {
        return cs;
    }

    public ArrayList<ConsumoServico> listar(ConsumoServico cs) {
        ArrayList<ConsumoServico> lista = new ArrayList<ConsumoServico>();
        return lista;
    }
}
