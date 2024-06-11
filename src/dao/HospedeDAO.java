package dao;

import domain.Hospede;

public class HospedeDAO extends GenericDAO<Hospede> {
    
    public HospedeDAO(String filePath) {
        super(filePath);
    }

    @Override
    protected Hospede fromString(String line) {
        return Hospede.fromString(line);
    }

    @Override
    protected String toString(Hospede hospede) {
        return hospede.toString();
    }
    
    @Override
    protected String getId(Hospede hospede) {
        return hospede.getId();
    }
}
