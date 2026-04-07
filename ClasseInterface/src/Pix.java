public class Pix implements IPagamento{
    private String chavePix;

    //Construtor;
    public Pix(String chavePix){
        this.chavePix = chavePix;
    }


    @Override
    public void autorizar(float valor) {
        System.out.println("Gerando o QR code para a chave " +  this.chavePix);
    System.out.println("Pagamento de R$ " + valor + "transferido de forma instantânea; ");

    }

    @Override
    public void exibirComprovante() {
        System.out.println("Comprovamente disponivel no app do banco; ");

    }
}
