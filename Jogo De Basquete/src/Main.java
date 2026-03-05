public class Main{
    public static void main(String[]args){
        Placar obj1 = new Placar("Franca", "Pinheiros");

        obj1.setregistrarPontos("casa", 2);
        obj1.proximoQuarto();
        obj1.setregistrarPontos("visitante", 3);
        obj1.proximoQuarto();

        obj1.setregistrarPontos("casa", 2);
        obj1.proximoQuarto();
        System.out.println(obj1.toSring());
    }
}
