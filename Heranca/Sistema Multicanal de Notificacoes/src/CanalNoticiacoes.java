public abstract class CanalNoticiacoes {
    protected String destinario;
    protected String mensagem;

    public CanalNoticiacoes(String destinario, String mensagem) {
        this.destinario = destinario;
        this.mensagem = mensagem;
    }

    public String getDestinario() {
        return destinario;
    }

    public void setDestinario(String destinario) {
        this.destinario = destinario;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    @Override
    public String toString() {
        return "CanalNoticiacoes{" +
                "destinario='" + destinario + '\'' +
                ", mensagem='" + mensagem + '\'' +
                '}';
    }
    public abstract void enviar();
}
