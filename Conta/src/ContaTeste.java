public class ContaTeste {
    public static void main(String[]args){
        Conta c1 = new Conta(123, 4152, "João Silva");
        Conta c2 = new Conta(321, 2514, "Maria Souza");

        c1.depositar(500);
        c1.sacar(200);

        c2.sacar(50);
        System.out.println(c2.toString());

        c1.sacar(300);
        c1.encerrarConta();
        System.out.println(c1.toString());
    }
}
