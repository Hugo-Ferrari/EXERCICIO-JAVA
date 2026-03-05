public class Streaming {
    private String usuario;
    private String plano;
    private float mensalidade;
    private boolean status;
    private String ultimoFilmeAssistido;

      public Streaming(String usuario, String plano ){
          this.usuario = usuario;
          this.plano = plano;

          if(plano.equalsIgnoreCase("Básico")){
              this.mensalidade = 25.90f;

          } else if (plano.equalsIgnoreCase("Premium")) {
              this.mensalidade = 45.90f;

          } else if (plano.equalsIgnoreCase("Familia")) {
              this.mensalidade = 60.90f;
          }

          this.status = true;
          this.ultimoFilmeAssistido = " ";
      }

      public void assistirFilme(String nomeFilme){
          if(status){
              this.ultimoFilmeAssistido = nomeFilme;
              System.out.println("Assistindo: "+ nomeFilme);

          }
          else {
              System.out.println("conteudo indisponivel, pague a fatura!!");
          }
      }
      public void cancelarAssinatura(){
          this.status = false;
      }
      public String toString(){
          return "Usuario: " +  this.usuario + " \nplano: " + this.plano + "\n Mensalidade: " + this.mensalidade + "\nstatus: " + (this.status? "Ativo " : "inativo ") + " \nultimo Filme Assistido: " +this.ultimoFilmeAssistido ;
      }
}
