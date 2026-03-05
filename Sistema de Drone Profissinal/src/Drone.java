public class Drone {
    private String codigo;
    private float altura;
    private int bateria;
    private boolean emVoo;

    //metodo construtor
    public Drone() {
        setBateria(0);
        setAltura(0);
        this.emVoo = false;
    }

    public void setAltura(float a) {
        if (this.emVoo) {
            if ( a>0 && a<120){
                this.altura =a;
            } else if(a <= 0 ) {
                System.out.println("pouso automatico ");
                this.emVoo = false;
                this.altura = 0;
            } else {
                this.altura = 0;
                System.out.println("altura invalida..");
            }
        }
    }

    public void setBateria(int b) {
        if (b > 0 && b < 100) {
            this.bateria = b;
        }
    }

    public void decolar() {
        if (this.bateria > 20) {
            if (testarMotores()){
                this.emVoo = true;
            }
        }
    }

    private boolean testarMotores() {
        System.out.println("Testando helicies");
        System.out.println(" Calibrando GPS... ");

        int motores = (int) (Math.random() * 10);
        if (motores < 8) {
            return true;
        }
        return false;
    }
    public void subir(float x){
        setAltura(getAltura() +x);

    }
    public void descer(float x){
        setAltura(getAltura() -x);
    }
    public int getBateria(){
        return this.bateria;
    }
    public float getAltura(){
        return this.altura;
    }
    public String toString(){
        return "\nBateria " + getBateria()+"%" + "\nAltura: " + getAltura() + (this.emVoo ? " \n esta voando ": " \nnão esta em voo");
    }
}
