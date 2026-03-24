public class Junior extends Desenvolvedor{ // herdando a classe pai (Desenvolvedor)
   private String mentor;

   public Junior(){

       super(); // chama o construtor da superClasse
   }

   public Junior( String nome, String linguagem, float salarioBase ,String mentor){
       super(nome, linguagem, salarioBase);
       this.mentor = mentor;
   }

    public String getMentor() {
        return mentor;
    }

    public void setMentor(String mentor) {
        this.mentor = mentor;
    }

    @Override // anulação do metodo herdado
    public String toString() {
        return "Junior{" +
                super.toString() + // chama o toString do pai;
                "mentor='" + mentor;

    }
    @Override
    public void Codar(){
        System.out.println(" Junior desenvolvendo codigo com sob a mentoria de " + this.mentor);
    }

}
