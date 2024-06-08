package domain;
public class Hospede extends Pessoa {
    private String enderecoCompleto;

    public Hospede(String cpf, String nome, String email, String enderecoCompleto){
        super(cpf, nome, email);
        this.enderecoCompleto = enderecoCompleto;
    }

    public String getEnderecoCompleto(){
        return this.enderecoCompleto;
    }
    public void setEnderecoCompleto(String enderecoCompleto) {
        this.enderecoCompleto = enderecoCompleto;
    }

    public boolean cadastrar(Hospede h) {
        return true;
    }
}
