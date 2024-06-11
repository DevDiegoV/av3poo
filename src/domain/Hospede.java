package domain;

public class Hospede extends Pessoa {
    private String id;
    private String enderecoCompleto;

    public Hospede(String cpf, String nome, String email, String id, String enderecoCompleto){
        super(cpf, nome, email);
        this.id = id;
        this.enderecoCompleto = enderecoCompleto;
    }

    public String getId() { return this.id; }
    public void setId(String id) { this.id = id; }

    public String getEnderecoCompleto(){ return this.enderecoCompleto; }
    public void setEnderecoCompleto(String enderecoCompleto) { this.enderecoCompleto = enderecoCompleto; }

    @Override
    public String toString() {
        return getCpf() + "," + getNome() + "," + getEmail() + "," + id + "," + enderecoCompleto;
    }

    public static Hospede fromString(String str) {
        String[] parts = str.split(",");
        String cpf = parts[0];
        String nome = parts[1];
        String email = parts[2];
        String id = parts[3];
        String enderecoCompleto = parts[4];
        return new Hospede(cpf, nome, email, id, enderecoCompleto);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Hospede hospede = (Hospede) obj;
        return id.equals(hospede.id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }
}
