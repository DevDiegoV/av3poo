import java.util.ArrayList;

public class Servico {
    private int codigo;
    private String descricao;
    private double valor;

    public Servico(int codigo, String descricao, double valor) {
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

    public boolean cadastrar(Servico s) {
        return true;
    }

    public boolean editar(Servico s) {
        return true;
    }

    public Servico consultar(Servico s) {
        return s;
    }

    public ArrayList<Servico> listar(Servico s) {
        ArrayList<Servico> list = new ArrayList<Servico>();
        return list;
    }
}
