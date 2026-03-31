public class Main{
    public static void exibir(Veiculo referencia){
        referencia.mover();
        referencia.abastecer();
    }

    public static  void main(String[] args){
        Veiculo v1 = new Aviao("Boeing", "737 MAX",350.75f,1200f);
        exibir(v1); // aqui ele é um avião e esta se movendo


        Veiculo carroEletrico = new CarroEletrico("BYD", " SUV Song Plus", 80.00f , 6);
        exibir(carroEletrico);

    }
}