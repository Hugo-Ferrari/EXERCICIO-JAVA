public class CarroEletrico extends Veiculo{
    private int autonomiaBateria;


    public CarroEletrico(String marca, String modelo, float velociadade, int autonomiaBateria) {
        super(marca, modelo, velociadade);
        this.autonomiaBateria = autonomiaBateria;
    }

    public int getAutonomiaBateria() {
        return autonomiaBateria;
    }

    public void setAutonomiaBateria(int autonomiaBateria) {
        this.autonomiaBateria = autonomiaBateria;
    }
    @Override
    public String mover(){
        System.out.println("Carro eletrico movendo-se silenciosamente");
        return " ";
    }
    @Override
    public String abastecer(){
        System.out.println("Recarregando bateria em posta de carga rapida");
        return "";
    }

    @Override
    public String toString() {
        return "CarroEletrico{" +
                super.toString() +
                "autonomiaBateria=" + autonomiaBateria +
                '}';
    }

}
