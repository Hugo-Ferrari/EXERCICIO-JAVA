public class Programador {
    private int id;
    private String nome, lingagemPrincipal;


    public Programador(int id, String nome, String lingagemPrincipal) {
        this.id = id;
        this.nome = nome;
        this.lingagemPrincipal = lingagemPrincipal;
    }

    @Override
    public String toString() {
        return "Programador{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", lingagemPrincipal='" + lingagemPrincipal + '\'' +
                '}';
    }
}
