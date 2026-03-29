public class Main2 {
    public static void main(String[]args){
        Desenvolvedor[] devs = new Desenvolvedor[4];
        devs[0] = new Junior("Sofia", "Python", 2000,"Arthur");
        devs[1] = new Pleno("Arthur", "TypeScript", 4500, 4 );
        devs[2] = new Senior("Hugo", "Java ", 8000, 2000);
        devs[3] = new Desenvolvedor("Generico" ," C#" , 1500); //não deveria ser possivel fazer isso, mas como não é uma classe abstrata, ela funciona;

        for(Desenvolvedor d : devs){
            d.Codar();
            d.calcularBonus();
            System.out.println(d.toString());

        }
    }
}
