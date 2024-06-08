package domain;
public class Servico {
    private String id;
    private String descricao;
    private double valor;

    public Servico(String id, String descricao, double valor) {
        this.id = id;
        this.descricao = descricao;
        this.valor = valor;
    }

    public String getId() { return this.id; }
    public void setId(String id) { this.id = id; }

    public String getDescricao() { return this.descricao; }
    public void setDescricao(String descricao) { this.descricao = descricao; }

    public double getValor() { return this.valor; }
    public void setValor(double valor) { this.valor = valor; }
}
