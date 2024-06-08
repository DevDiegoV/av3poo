package domain;
import java.util.Date;

public class Consumo {
    private Item item;
    private Reserva reserva;
    private int quantidadeSolicitada;
    private Date dataConsumo;

    public Consumo(Item item, Reserva reserva, int quantidadeSolicitada, Date dataConsumo) {
        this.item = item;
        this.reserva = reserva;
        this.quantidadeSolicitada = quantidadeSolicitada;
        this.dataConsumo = dataConsumo;
    }

    public Item getItem(){ return this.item; }
    public void setItem(Item item){ this.item = item; }

    public Reserva getReserva(){ return this.reserva; }
    public void setReserva(Reserva reserva) { this.reserva = reserva; }

    public int getQuantidadeSolicitada(){ return this.quantidadeSolicitada; }
    public void setQuantidadeSolicitada(int quantidadeSolicitada){ this.quantidadeSolicitada = quantidadeSolicitada; }
 
    public Date getDataConsumo(){ return this.dataConsumo; }
    public void setDataConsumo(Date dataConsumo){ this.dataConsumo = dataConsumo; }
}
