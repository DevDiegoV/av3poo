package dao;

import domain.ConsumoServico;

public class ConsumoServicoDAO extends GenericDAO<ConsumoServico> {
    
    public ConsumoServicoDAO(String filePath) {
        super(filePath);
    }

    @Override
    protected ConsumoServico fromString(String line) {
        return ConsumoServico.fromString(line);
    }

    @Override
    protected String toString(ConsumoServico consumo) {
        return consumo.toString();
    }
    
    @Override
    protected String getId(ConsumoServico consumo) {
        return consumo.getId();
    }
}
