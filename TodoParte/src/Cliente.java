// objeto Parte

public class Cliente {
    private int id;
    private String cpf ,nome, endereco;

// construtor sem parametro;
    public Cliente() {
    }
// construtor com parametro
    public Cliente(int id, String cpf, String nome, String endereco) {
        this.id = id;
        this.cpf = cpf;
        this.nome = nome;
        this.endereco = endereco;
    }

    // criando os setters e os getters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ", cpf='" + cpf + '\'' +
                ", nome='" + nome + '\'' +
                ", endereco='" + endereco + '\'' +
                '}';
    }
}
