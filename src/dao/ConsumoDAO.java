package dao;

import domain.Consumo;

public class ConsumoDAO extends GenericDAO<Consumo> {
    
    public ConsumoDAO(String filePath) {
        super(filePath);
    }

    @Override
    protected Consumo fromString(String line) {
        return Consumo.fromString(line);
    }

    @Override
    protected String toString(Consumo consumo) {
        return consumo.toString();
    }
    
    @Override
    protected String getId(Consumo consumo) {
        return consumo.getId();
    }
}
