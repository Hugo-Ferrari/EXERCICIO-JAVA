public class Questao {
    private float valor;
    private float numero;
    private String enunciado;

    public Questao() {
    }

    public Questao(float valor, float numero, String enunciado) {
        this.valor = valor;
        this.numero = numero;
        this.enunciado = enunciado;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public float getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getEnunciado() {
        return enunciado;
    }

    public void setEnunciado(String enunciado) {
        this.enunciado = enunciado;
    }

    @Override
    public String toString() {
        return "Questao{" +
                "valor=" + valor +
                ", numero=" + numero +
                ", enunciado='" + enunciado + '\'' +
                '}';
    }
}
