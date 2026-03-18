public class ItemPedido {
    private int id;
    private int quant;
    private Produto produto; // agregação da classe produto;

    public ItemPedido() {
    }

    public ItemPedido(int id, int quant, Produto produto) {
        this.id = id;
        this.quant = quant;
        this.produto = produto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQuant() {
        return quant;
    }

    public void setQuant(int quant) {
        this.quant = quant;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    @Override
    public String toString() {
        return "ItemPedido{" +
                "id=" + id +
                ", quant=" + quant +
                ", produto= \n" + produto +
                '}';
    }
}
