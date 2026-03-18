import java.util.ArrayList;
import java.util.Date;

public class Pedido {
    private int id;
    private Date data;
    private Cliente cliente; // associação todo-parte;
    private ArrayList<ItemPedido> itemPedidos; //

    public Pedido() {
        this.itemPedidos = new ArrayList(); // aloca espaço na memoria para o vetor
    }

    public Pedido(int id, Date data, Cliente cliente) {
        this.id = id;
        this.data = data;
        this.cliente = cliente; // agregação
        this.itemPedidos = new ArrayList(); // aloca espaço na memoria para o vetor
    }

    public void adicionaItemPedido(int id, int quant, Produto produto){
        ItemPedido aux = new ItemPedido(id, quant, produto);
        this.itemPedidos.add(aux);
        System.out.println("Item adicionado com sucesso");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    // calcular o total geral do pedido;



    @Override
    public String toString() {
        return "Pedido{" +
                "id=" + id +
                ", data=" + data +
                ", cliente=" + cliente +
                ", itemPedidos=" + itemPedidos +
                '}';
    }
}
