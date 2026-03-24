public class Senior extends Desenvolvedor {
    private float verbaLiderança;

    public Senior() {
        super(); // chamando construtor da classe pai;
    }


    public Senior(String nome, String linguagem, float salarioBase, float verbaLiderança) {
        super(nome, linguagem, salarioBase); // chamando construtor da classe pai;
        this.verbaLiderança = verbaLiderança;
    }


    public float getVerbaLiderança() {
        return verbaLiderança;
    }

    public void setVerbaLiderança(float verbaLiderança) {
        this.verbaLiderança = verbaLiderança;
    }

   @Override
    public void Codar(){
       System.out.println("Senior desenhando a arquitetura e orientando equipe");

   }
   @Override
   public float calcularBonus(){
        return super.calcularBonus() + 4000;
   }

    @Override
    public String toString() {
        return "Senior{" +
                super.toString()+
                "verbaLiderança=" + verbaLiderança +
                '}';
    }
}
