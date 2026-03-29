public class Veiculo {
    protected String marca, modelo;
    protected float velociadade;

    public Veiculo() {
    }

    public Veiculo(String marca, String modelo, float velociadade) {
        this.marca = marca;
        this.modelo = modelo;
        this.velociadade = velociadade;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getVelociadade() {
        return velociadade;
    }

    public void setVelociadade(float velociadade) {
        this.velociadade = velociadade;
    }


    public String mover(){
        return "veiculo se movendo";
    }
    public String abastecer(){
        return "Veiculo abastecendo";
    }

    @Override
    public String toString() {
        return "Veiculo{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", velociadade=" + velociadade +
                '}';
    }
}
