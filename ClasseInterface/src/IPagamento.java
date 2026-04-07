public interface IPagamento { //normalmente começa a classe interface com I
    //contrato: que implemeneta essa interface, deve implementar esses métodos;

    void autorizar(float valor); //não necessita do public pois se colocarmos apenas o void, ele se torna public por definição;

    void exibirComprovante();

}
