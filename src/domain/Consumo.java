package domain;
import java.util.Date;

public class Consumo {
    private String id;
    private Item item;
    private Reserva reserva;
    private int quantidadeSolicitada;
    private Date dataConsumo;

    public Consumo(String id, Item item, Reserva reserva, int quantidadeSolicitada, Date dataConsumo) {
        this.id = id;
        this.item = item;
        this.reserva = reserva;
        this.quantidadeSolicitada = quantidadeSolicitada;
        this.dataConsumo = dataConsumo;
    }

    public String getId() { return this.id; }
    public void setId(String id) { this.id = id; }

    public Item getItem(){ return this.item; }
    public void setItem(Item item){ this.item = item; }

    public Reserva getReserva(){ return this.reserva; }
    public void setReserva(Reserva reserva) { this.reserva = reserva; }

    public int getQuantidadeSolicitada(){ return this.quantidadeSolicitada; }
    public void setQuantidadeSolicitada(int quantidadeSolicitada){ this.quantidadeSolicitada = quantidadeSolicitada; }
 
    public Date getDataConsumo(){ return this.dataConsumo; }
    public void setDataConsumo(Date dataConsumo){ this.dataConsumo = dataConsumo; }

    @Override
    public String toString() {
        return id + "," + item + "," + reserva + "," + quantidadeSolicitada + "," + dataConsumo;
    }

    public static Consumo fromString(String str) {
        String[] parts = str.split(",");
        String id = parts[0];
        Item item = new Item(parts[1]);
        Reserva reserva = new Reserva(parts[2]);
        int quantidadeSolicitada = Integer.parseInt(parts[3]);
        Date dataConsumo = new Date();
        return new Consumo(id, item, reserva, quantidadeSolicitada, dataConsumo);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Consumo consumo = (Consumo) obj;
        return id.equals(consumo.id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }
}
