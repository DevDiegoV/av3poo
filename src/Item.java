import java.util.ArrayList;

public class Item {
    private int codigo;
    private String descricao;
    private double valor;

    public Item(int codigo, String descricao, double valor) {
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

    public boolean cadastrar(Item i) {
        return true;
    }

    public boolean editar(Item i) {
        return true;
    }

    public Item consultar(Item i) {
        return i;
    }

    public ArrayList<Item> listar(Item i) {
        ArrayList<Item> list = new ArrayList<Item>();
        return list;
    }
}
