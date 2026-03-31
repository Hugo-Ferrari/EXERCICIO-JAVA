import java.util.ArrayList;

public class Main2 {
    public static void main(String[]args){

        Junior jr1 = new Junior("Alice", "Java", 4000, "Hugo");
        Pleno pl1 = new Pleno("Hugo", "Java", 5000, 5);
        Senior sn1 = new Senior("Gustavo", "Java", 6000, 3000);

        ArrayList<Desenvolvedor> devs = new ArrayList<>(); // criando um arrays de desenvolvedor para adicionar os objetos;
        //adicionando os objetos no arrays devs
        devs.add(jr1);
        devs.add(pl1);
        devs.add(sn1);



        for(Desenvolvedor d : devs){
            d.Codar();
            d.calcularBonus();
            System.out.println(d.toString());

        }
    }
}
