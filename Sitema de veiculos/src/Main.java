public class Main{
    public static  void main(String[] args){
        Veiculo v1 = new Aviao("Boeing", "737 MAX",350.75f,1200f);
        v1.mover(); // aqui ele é um avião e esta se movendo

        v1 = new CarroEletrico("BYD", " SUV Song Plus", 80.00f , 6);
        v1.mover(); // aqui tranformamos a variavel em um carroEletrico, e ele esta movendo silenciosamente
        System.out.println(v1.toString());
    }
}