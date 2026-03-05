import static java.lang.Character.charCount;
import static java.lang.Character.isUpperCase;

public class SmartTv {
    private int volume;
    private String modelo, marca;
    private boolean conectadoInternet;


    // metodo construtor
    public SmartTv(String marca, String modelo, int volume) {  // objeto com passagem de parametros.
        //para adicionar o valor tem que ser acessado a partir dos metodos setters!!
        this.setMarca(marca);
        this.setModelo(modelo);
        this.setVolume(volume);
        this.conectadoInternet = false;
    }

    //setters e getters
    public void setVolume(int volume) {
        if (volume < 0 || volume > 100) {
            System.out.println("Volume inválido");
        } else this.volume = volume;
    }

    // get serve para listar o objeto;
    public int getVolume() {
        return this.volume;
    }

    public String getModelo() {
        return this.modelo;
    }

    public String getMarca() {
        return this.marca;
    }


    // set serve para adicionar o valor da variavel;
    public void setMarca(String marca) {
        char aux = marca.charAt(0); // detecta a primeira letra da palavra (metodo de instancia)
        boolean resp = Character.isUpperCase(aux); // detecta se a primeira letra é maiuscula (metodo de classe)
        if (resp) {
            this.marca = marca;
        }
        else{
            System.out.println("marca invalida ");
        }

    }

    public void setModelo(String modelo) {
        if (modelo.length() <= 30) {
            this.modelo = modelo;
        } else System.out.println("modelo errado");
    }

    public void setabrirYoutbe(){
        if(this.setconectaInternet()){
            System.out.println("Abrindo youtube ");

        }
        else {
            System.out.println("sem intenet para abrir o youtube ");
        }
    }
    private boolean setconectaInternet(){ //só pode ser usado dentro da classe
        System.out.println("buscando sinal de wifi ");
        System.out.println("verificando credenciais ");
        System.out.println("Autenticando IP no rotiador ");
        int randow = (int)(Math.random() * 10); //pega um numero aleatorio
        if (randow < 5){
            this.conectadoInternet =true;
            return true;
        }
        else{
            this.conectadoInternet = false;
            return false;
        }

    }

    public void setaumentarVolume(int x){
        this.setVolume(this.volume += x);

    }
    public void setdiminuirVolume(int x){
        this.setVolume(this.volume -=x);
    }
    public String toString() {
        return "\nvolume:" + getVolume() + "\nmarca " + getMarca() + "\nmodelo " + getModelo() + "\n Conectado a internet: " + (this.conectadoInternet ? "simm " :"nãoo ");
    }
}
