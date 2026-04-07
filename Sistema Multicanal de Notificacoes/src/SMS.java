public class SMS extends CanalNoticiacoes{
    private int numeroTelefone;

    public SMS(String destinario, String mensagem, int numeroTelefone) {
        super(destinario, mensagem);
        this.numeroTelefone = numeroTelefone;
    }

    public int getNumeroTelefone() {
        return numeroTelefone;
    }

    public void setNumeroTelefone(int numeroTelefone) {
        this.numeroTelefone = numeroTelefone;
    }

    @Override
    public String toString() {
        return "SMS{" +
                super.toString()+
                "numeroTelefone=" + numeroTelefone +
                '}';
    }
    @Override
    public void enviar(){
        System.out.println("Enviando SMS para o número " + this.numeroTelefone+ ":" + this.mensagem);
    }
}
