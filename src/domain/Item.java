package domain;

public class Item {
    private String id;
    private String descricao;
    private double valor;

    public Item(String id, String descricao, double valor) {
        this.id = id;
        this.descricao = descricao;
        this.valor = valor;
    }

    public Item(String id) {
        this.id = id;
    }

    public String getId() { return this.id; }
    public void setId(String id) { this.id = id; }

    public String getDescricao() { return this.descricao; }
    public void setDescricao(String descricao) { this.descricao = descricao; }

    public double getValor() { return this.valor; }
    public void setValor(double valor) { this.valor = valor; }

    @Override
    public String toString() {
        return id + "," + descricao +  "," + valor;
    }

    public static Item fromString(String str) {
        String[] parts = str.split(",");
        String id = parts[0];
        String descricao = parts[1];
        double valor  = Double.parseDouble(parts[2]);
        return new Item(id, descricao, valor);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Item item = (Item) obj;
        return id.equals(item.id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }
}
