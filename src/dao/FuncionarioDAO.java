package dao;

import domain.Funcionario;

public class FuncionarioDAO extends GenericDAO<Funcionario> {
    
    public FuncionarioDAO(String filePath) {
        super(filePath);
    }

    @Override
    protected Funcionario fromString(String line) {
        return Funcionario.fromString(line);
    }

    @Override
    protected String toString(Funcionario funcionario) {
        return funcionario.toString();
    }
    
    @Override
    protected String getId(Funcionario funcionario) {
        return funcionario.getId();
    }
}
