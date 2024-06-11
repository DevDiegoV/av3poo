package dao;

import domain.Servico;

public class ServicoDAO extends GenericDAO<Servico> {
    
    public ServicoDAO(String filePath) {
        super(filePath);
    }

    @Override
    protected Servico fromString(String line) {
        return Servico.fromString(line);
    }

    @Override
    protected String toString(Servico servico) {
        return servico.toString();
    }
    
    @Override
    protected String getId(Servico servico) {
        return servico.getId();
    }
}
