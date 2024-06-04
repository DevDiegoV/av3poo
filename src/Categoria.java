import java.util.ArrayList;

public class Categoria {
    private int codigo;
    private String descricao;
    private double valor;

    public Categoria(int codigo, String descricao, double valor) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.valor = valor;
    }

    public int getCodigo() {
        return this.codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return this.descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return this.valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }

    public boolean cadastrar(Categoria c) {
        return true;
    }

    public boolean editar(Categoria c) {
        return true;
    }

    public Categoria consultar(Categoria c) {
        return c;
    }

    public ArrayList<Categoria> listar(Categoria c) {
        ArrayList<Categoria> list = new ArrayList<Categoria>();
        return list;
    }
}
