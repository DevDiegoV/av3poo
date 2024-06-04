import java.util.ArrayList;

public class Quarto {
    private int codigo;
    private Categoria categoria;
    private String status;

    public Quarto(int codigo, Categoria categoria, String status) {
        this.codigo = codigo;
        this.categoria = categoria;
        this.status = status;
    }

    public int getCodigo() {
        return this.codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
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

    public boolean cadastrar(Quarto q) {
        return true;
    }

    public boolean editar(Quarto q) {
        return true;
    }

    public Quarto consultar(Quarto q) {
        return q;
    }

    public ArrayList<Quarto> listar(Quarto q) {
        ArrayList<Quarto> list = new ArrayList<Quarto>();
        return list;
    }
}
