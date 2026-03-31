public class Email extends CanalNoticiacoes{
    private String assunto;

    public Email(String destinario, String mensagem, String assunto) {
        super(destinario, mensagem);
        this.assunto = assunto;
    }

    public String getAssunto() {
        return assunto;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    @Override
    public String toString() {
        return "Email{" +
                super.toString() +
                "assunto='" + assunto + '\'' +
                '}';
    }
    @Override
    public void enviar(){
        System.out.println("Enviando E-mail para "+this.destinario + " com o assunto: " + this.assunto + this.mensagem);

    }
}
