public class Main {
    public static void exibir(Desenvolvedor camaleao){
        //polimorfismo
        camaleao.Codar();
        //polimorfismo
        System.out.println(camaleao.toString() + "Bônus" + camaleao.calcularBonus());
    }

    public static void main(String[] args){
        //criar um objeto Desenvolvedor

        Desenvolvedor dev1 = new Desenvolvedor();

        //criar um junior
        Junior jr1 = new Junior("Alice", "Java", 4000, "Hugo");
        exibir(jr1);

        //criar um pleno
        Pleno pl1 = new Pleno("Hugo", "Java", 5000, 5);
        exibir(pl1);

        //criar um senior
        Senior sn1 = new Senior("Gustavo", "Java", 6000, 3000);
        exibir(sn1);
    }
}