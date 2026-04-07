public class CartaoCredito implements  IPagamento {
    private int nroCartao;

    //construtor;
    public CartaoCredito(int nroCartao) {
        this.nroCartao = nroCartao;
    }

    // colocamos os metodos da classe interface
    @Override
    public void autorizar(float valor) {
        System.out.println("Verificando limite do cartão " + this.nroCartao);
        System.out.println("Pagamento de " + valor + "autorizado ");

    }

    @Override
    public void exibirComprovante() {
        System.out.println("Comprovante enviado para o seu email; ");

    }
}
