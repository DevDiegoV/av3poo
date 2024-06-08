package dao;
import java.util.ArrayList;

import domain.Funcionario;

public class FuncionarioDAO {
    
    public boolean cadastrar(Funcionario f) {
        return true;
    }

    public boolean editar(Funcionario f)  {
        return true;
    }

    public Funcionario consultar(Funcionario f) {
        return f;
    }

    public ArrayList<Funcionario> listar(Funcionario f) {
        ArrayList<Funcionario> lista = new ArrayList<Funcionario>();
        return lista;
    }
}
