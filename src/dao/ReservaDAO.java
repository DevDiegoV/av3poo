package dao;
import java.util.ArrayList;

import domain.Reserva;

public class ReservaDAO {
    
    public boolean cadastrar(Reserva r) {
        return true;
    }

    public boolean editar(Reserva r) {
        return true;
    }

    public Reserva consultar(Reserva r) {
        return r;
    }

    public ArrayList<Reserva> listar(Reserva r) {
        ArrayList<Reserva> lista = new ArrayList<Reserva>();
        return lista;
    }
}
