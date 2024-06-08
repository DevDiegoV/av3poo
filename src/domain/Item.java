package domain;
public class Item {
    private int id;
    private String descricao;
    private double valor;

    public Item(int id, String descricao, double valor) {
        this.id = id;
        this.descricao = descricao;
        this.valor = valor;
    }

    public int getId() {
        return this.id;
    }
    public void setId(int id) {
        this.id = id;
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
}
