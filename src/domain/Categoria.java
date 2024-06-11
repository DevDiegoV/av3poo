package domain;
public class Categoria {
    private String id;
    private String descricao;
    private double valor;

    public Categoria(String id, String descricao, double valor) {
        this.id = id;
        this.descricao = descricao;
        this.valor = valor;
    }

    public Categoria(String id) {
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
        return id + "," + descricao + "," + valor;
    }

    public static Categoria fromString(String str) {
        String[] parts = str.split(",");
        return new Categoria(parts[0], parts[1], Double.parseDouble(parts[2]));
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Categoria categoria = (Categoria) obj;
        return id.equals(categoria.id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }
}
