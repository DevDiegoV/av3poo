package dao;

import domain.Reserva;

public class ReservaDAO extends GenericDAO<Reserva> {
    
    public ReservaDAO(String filePath) {
        super(filePath);
    }

    @Override
    protected Reserva fromString(String line) {
        return Reserva.fromString(line);
    }

    @Override
    protected String toString(Reserva reserva) {
        return reserva.toString();
    }
    
    @Override
    protected String getId(Reserva reserva) {
        return reserva.getId();
    }
}
