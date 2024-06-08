package domain;
public class Funcionario extends Pessoa {
    private String setor;

    public Funcionario(String cpf, String nome, String email, String setor) {
        super(cpf, nome, email);
        this.setor = setor;
    }

    public String getSetor(){ return this.setor; }
    public void setSetor(String setor) { this.setor = setor; }
}
