public class Main{
    public static void main(String[] args){
    Cliente cliente1 = new Cliente(1, "Hugo"); // criando o cliente
    Produto p1 =  new Produto(12, "Arroz", 10.2);// criando o produto
    Venda v1 = new Venda(cliente1); // criando a venda

    v1.adicionarProduto(p1, 2); // adicionando o item da venda na Venda
        System.out.println(v1.toString());
    }
}