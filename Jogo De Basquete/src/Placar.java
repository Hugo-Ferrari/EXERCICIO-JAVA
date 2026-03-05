public class Placar {
    private String nomeTimeCasa;
    private String nomeTimeVisitante;
    private int pontosCasa;
    private int pontosVisitante;
    private int periodoQuarto;

    public Placar(String nomeTimeCasa, String nomeTimeVisitante) {
        this.nomeTimeCasa = nomeTimeCasa;
        this.nomeTimeVisitante = nomeTimeVisitante;
        this.pontosCasa = 0;
        this.pontosVisitante = 0;
        this.periodoQuarto = 1;


    }

    public void setregistrarPontos(String time, int tipo) {
        if (time.equalsIgnoreCase("casa")) {
            if (tipo == 1) {
                System.out.println("Lance livre");
                this.pontosCasa += 1;

            } else if (tipo == 2) {
                System.out.println("cesta normal");
                this.pontosCasa+=2;

            }else if ( tipo == 3){
                System.out.println("cesta de tres");
                this.pontosCasa +=3;
            }
            else{
                System.out.println("cesta invalida!!");
            }

        } else if (time.equalsIgnoreCase("visitante")) {
            if (tipo == 1) {
                System.out.println("Lance livre");
                this.pontosVisitante += 1;

            } else if (tipo == 2) {
                System.out.println("cesta normal");
                this.pontosVisitante+=2;

            }else if ( tipo == 3){
                System.out.println("cesta de tres");
                this.pontosVisitante +=3;
            }
            else{
                System.out.println("cesta invalida!!");
            }

        }

    }

    public void proximoQuarto() {
        if (periodoQuarto >= 4) {
            System.out.println("O jogo terminou");
        } else {
            this.periodoQuarto += 1;
        }
    }

    public String toSring() {
        return "TIME A: " + this.pontosCasa + " pontos  " + "\n TIME B " + this.pontosVisitante +" pontos" + "\n Período:"  + this.periodoQuarto;
    }

}