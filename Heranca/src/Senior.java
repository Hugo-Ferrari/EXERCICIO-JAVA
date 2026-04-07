public class Senior extends Desenvolvedor {
    private float verbaLideranca;

    public Senior() {
        super(); // chamando construtor da classe pai;
    }


    public Senior(String nome, String linguagem, float salarioBase, float verbaLideranca) {
        super(nome, linguagem, salarioBase); // chamando construtor da classe pai;
        this.verbaLideranca = verbaLideranca;
    }


    public float getVerbaLiderança() {
        return verbaLideranca;
    }

    public void setVerbaLiderança(float verbaLideranca) {
        this.verbaLideranca = verbaLideranca;
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
                "verbaLideranca=" + this.verbaLideranca +
                '}';
    }
}
