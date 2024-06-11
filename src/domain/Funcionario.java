package domain;

public class Funcionario extends Pessoa {
    private String id;
    private String setor;

    public Funcionario(String cpf, String nome, String email, String id, String setor) {
        super(cpf, nome, email);
        this.id = id;
        this.setor = setor;
    }

    public String getId() { return this.id; }
    public void setId(String id) { this.id = id; }

    public String getSetor(){ return this.setor; }
    public void setSetor(String setor) { this.setor = setor; }

    @Override
    public String toString() {
        return getCpf() + "," + getNome() + "," + getEmail() + "," + id + "," + setor;
    }

    public static Funcionario fromString(String str) {
        String[] parts = str.split(",");
        String cpf = parts[0];
        String nome = parts[1];
        String email = parts[2];
        String id = parts[3];
        String setor = parts[4];
        return new Funcionario(cpf, nome, email, id, setor);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Funcionario funcionario = (Funcionario) obj;
        return id.equals(funcionario.id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }
}
