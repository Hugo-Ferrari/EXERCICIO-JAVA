public class Aviao extends Veiculo{
    private float altitudeMax;

    public Aviao(String marca, String modelo, float velociadade, float altitudeMax) {
        super(marca, modelo, velociadade);
        this.altitudeMax = altitudeMax;
    }

    public float getAltitudeMax() {
        return altitudeMax;
    }

    public void setAltitudeMax(float altitudeMax) {
        this.altitudeMax = altitudeMax;
    }
    @Override
    public String mover(){
        System.out.println("Avião voando a " + this.velociadade + "km/h e " + this.altitudeMax + "metros");
        return "";
    }
    @Override
    public String abastecer(){
        System.out.println("Abastecendo com querosene de aviação");
        return " ";
    }

    @Override
    public String toString() {
        return "Aviao{" +
                super.toString() +
                "altitudeMax=" + altitudeMax +
                '}';
    }
}
