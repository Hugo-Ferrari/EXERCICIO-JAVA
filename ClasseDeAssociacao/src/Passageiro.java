public class Passageiro {
    private String Cpf;
    private String nome;
    // construtores com e sem parametros
    public Passageiro() {

    }

    public Passageiro(String cpf, String nome) {
        this.Cpf = cpf;
        this.nome = nome;
    }
    // getters e setters
    public String getCpf() {
        return Cpf;
    }

    public void setCpf(String cpf) {
        Cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Passageiro{" +
                "Cpf='" + Cpf + '\'' +
                ", nome='" + nome + '\'' +
                '}';
    }
}
