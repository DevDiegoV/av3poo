package domain;
public class Quarto {
    private int id;
    private Categoria categoria;
    private String status;

    public Quarto(int id, Categoria categoria, String status) {
        this.id = id;
        this.categoria = categoria;
        this.status = status;
    }

    public int getId() {
        return this.id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public Categoria getCategoria() {
        return this.categoria;
    }
    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public String getStatus() {
        return this.status;
    }
    public void setCategoria(String status) {
        this.status = status;
    }
}
