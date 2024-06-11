package domain;
import java.util.Date;

public class ConsumoServico {
    private String id;
    private Servico servico;
    private Reserva reserva;
    private int quantidadeSolicitada;
    private Date dataServico;

    public ConsumoServico(String id, Servico servico, Reserva reserva, int quantidadeSolicitada, Date dataServico) {
        this.id = id;
        this.servico = servico;
        this.reserva = reserva;
        this.quantidadeSolicitada = quantidadeSolicitada;
        this.dataServico = dataServico;
    }

    public String getId() { return this.id; }
    public void setId(String id) { this.id = id; }

    public Servico getServico() { return this.servico; }
    public void setServico(Servico servico) { this.servico = servico; }

    public Reserva getReserva() { return this.reserva; }
    public void setReserva(Reserva reserva) { this.reserva = reserva; }

    public int getQuantidadeSolicitada() { return this.quantidadeSolicitada; }
    public void setQuantidadeSolicitada(int quantidadeSolicitada) { this.quantidadeSolicitada = quantidadeSolicitada; }

    public Date getDataServico() { return this.dataServico; }
    public void setDataServico(Date dataServico) { this.dataServico = dataServico; }

    @Override
    public String toString() {
        return id + "," + servico + "," + reserva + "," + quantidadeSolicitada + "," + dataServico;
    }

    public static ConsumoServico fromString(String str) {
        String[] parts = str.split(",");
        String id = parts[0];
        Servico servico = new Servico(parts[1]);
        Reserva reserva = new Reserva(parts[2]);
        int quantidadeSolicitada = Integer.parseInt(parts[3]);
        Date dataServico = new Date();
        return new ConsumoServico(id, servico, reserva, quantidadeSolicitada, dataServico);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        ConsumoServico consumoServico = (ConsumoServico) obj;
        return id.equals(consumoServico.id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }
}
