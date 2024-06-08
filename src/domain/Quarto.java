package domain;

public class Quarto {
    private String id;
    private String categoria;
    private String status;

    public Quarto(String id, String categoria, String status) {
        this.id = id;
        this.categoria = categoria;
        this.status = status;
    }

    public String getId() { return id; }
    public String getCategoria() { return categoria; }

    public void setId(String id) { this.id = id; }
    public void setCategoria(String categoria) { this.categoria = categoria; }

    public String getStatus() { return this.status; }
    public void setStatus(String status) { this.status = status; }

    @Override
    public String toString() {
        return id + "," + categoria + "," + status;
    }

    public static Quarto fromString(String str) {
        String[] parts = str.split(",");
        return new Quarto(parts[0], parts[1], parts[2]);
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
