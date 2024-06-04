import java.util.ArrayList;

public class Funcionario extends Pessoa {
    private String setor;

    public Funcionario(String cpf, String nome, String email, String setor) {
        super(cpf, nome, email);
        this.setor = setor;
    }

    public String getSetor(){
        return this.setor;
    }
    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean cadastrar(Funcionario f) {
        return true;
    }

    public boolean editar(Funcionario f) {
        return true;
    }

    public Funcionario consultar(Funcionario f) {
        return f;
    }

    public ArrayList<Funcionario> listar(Funcionario f) {
        ArrayList<Funcionario> list = new ArrayList<Funcionario>();
        return list;
    }
}
