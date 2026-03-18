import java.util.Date;

public class Main {
    public static void main(String[]args){

        //cliente é independente do Pedido

        Cliente cliente1 = new Cliente(100, "fulano", "123", "Rua 10");

        Pedido pedido1 = new Pedido(123, new Date(), cliente1 );

        Produto produto1 = new Produto(1 , "Notebook potente " , "semi-novo", 1589.90f);
        Produto produto2 = new Produto(2 , "celular " , "novo", 2000f);
        ItemPedido itemPedido1 = new ItemPedido(12, 3, produto1);

        pedido1.adicionaItemPedido(1, 3, produto1);
        pedido1.adicionaItemPedido(4, 5, produto2);
        System.out.println(itemPedido1.toString());
    }
}