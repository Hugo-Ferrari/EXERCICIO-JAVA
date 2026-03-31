public class WhatsApp extends CanalNoticiacoes{
    private String statusLeitura;

    public WhatsApp(String destinario, String mensagem, String statusLeitura) {
        super(destinario, mensagem);
        this.statusLeitura = statusLeitura;
    }

    public String getStatusLeitura() {
        return statusLeitura;
    }

    public void setStatusLeitura(String statusLeitura) {
        this.statusLeitura = statusLeitura;
    }

    @Override
    public String toString() {
        return "WhatsApp{" +
                super.toString() +
                "statusLeitura='" + statusLeitura + '\'' +
                '}';
    }

    @Override
    public void enviar() {
        System.out.println("Enviando Zap para " + this.destinario + "... Mensagem: " +  this.mensagem+ "Enviando Zap para" + this.destinario +"... Mensagem: " + this.mensagem);
    }
}
