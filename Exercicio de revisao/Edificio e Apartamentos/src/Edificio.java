import java.util.ArrayList;

public class Edificio {

    private String nome, endereco;
    private ArrayList<Apartamento> apartamentos;

    public Edificio(String nome, String endereco)  {
        this.nome = nome;
        this.endereco = endereco;
        this.apartamentos = new ArrayList<>();
    }

    public void construirApartamento(int num, int andar){
        Apartamento ap = new Apartamento(num,andar);
        apartamentos.add(ap);

    }

    @Override
    public String toString() {
        return "Edificio{" +
                "nome='" + nome + '\'' +
                ", endereco='" + endereco + '\'' +
                ", apartamentos=" + apartamentos +
                '}';
    }
}
