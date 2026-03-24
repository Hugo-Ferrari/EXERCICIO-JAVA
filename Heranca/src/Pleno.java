public class Pleno extends Desenvolvedor{
    private int ProjetosEntregados; // quantidade de projetos entregados;

    public Pleno() {
    }

    public Pleno(String nome, String linguagem, float salarioBase, int projetosEntregados) {
        super(nome, linguagem, salarioBase); //chamando os dados da classe pai;
        ProjetosEntregados = projetosEntregados;
    }

    public int getProjetosEntregados() {
        return ProjetosEntregados;
    }

    public void setProjetosEntregados(int projetosEntregados) {
        ProjetosEntregados = projetosEntregados;
    }

    @Override
    public String toString() {
        return "Pleno{" +
                super.toString()+ // puxando o toString do pai;
                "Projetos Entregados=" + ProjetosEntregados +
                '}';
    }
    @Override
    public void Codar(){
        System.out.println("Pleno desenvolvendo código e fazendo Code Review;");
    }
    @Override
    public float calcularBonus(){
        return super.calcularBonus() + 2000; // adicionado um bonus maior (salario de desenvolvedor mais 2000 reais)
    }
}
