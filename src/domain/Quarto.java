package domain;

public class Quarto {
    private String id;
    private Categoria categoria;
    private String status;

    public Quarto(String id, Categoria categoria, String status) {
        this.id = id;
        this.categoria = categoria;
        this.status = status;
    }

    public Quarto(String id) {
        this.id = id;
    }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public Categoria getCategoria() { return categoria; }
    public void setCategoria(Categoria categoria) { this.categoria = categoria; }

    public String getStatus() { return this.status; }
    public void setStatus(String status) { this.status = status; }

    @Override
    public String toString() {
        return id + "," + categoria + "," + status;
    }

    public static Quarto fromString(String str) {
        String[] parts = str.split(",");
        String id = parts[0];
        Categoria categoria = new Categoria(parts[1]);
        String status = parts[2];
        return new Quarto(id, categoria, status);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Quarto quarto = (Quarto) obj;
        return id.equals(quarto.id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }
}
