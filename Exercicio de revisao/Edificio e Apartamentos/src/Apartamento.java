public class Apartamento {
    private int andar, numero;

    public Apartamento(int andar, int numero) {
        this.andar = andar;
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Apartamento{" +
                "andar=" + andar +
                ", numero=" + numero +
                '}';
    }
}
