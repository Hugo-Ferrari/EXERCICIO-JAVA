public class Main {
    public static void main(String[]args){
        IPagamento seletor; // objeto do tipo interface

        seletor = new CartaoCredito(111215);
        seletor.autorizar(600);
        seletor.exibirComprovante();

        System.out.println();

        seletor = new Pix("hugoferrari36@gmail.com");
        seletor.autorizar(900);
        seletor.exibirComprovante();

    }
}