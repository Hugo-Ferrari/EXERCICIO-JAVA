import java.util.ArrayList;

public class Venda {
    private Cliente cliente;
    private ArrayList<ItemVenda> itemVendas;

    public Venda(Cliente cliente) {
        this.cliente = cliente;
        itemVendas = new ArrayList<>();
    }
    public void adicionarProduto(Produto p, int quant){ // um no produto nas vendas;

        int id = itemVendas.size() + 1; // o id muda toda vez que é adicionado algo na lista;
        ItemVenda item= new ItemVenda( id, quant, p);
        itemVendas.add(item);


    }

    @Override
    public String toString() {
        return "Venda{" +
                "cliente=" + cliente +
                ", itemVendas=" + itemVendas +
                '}';
    }
}
