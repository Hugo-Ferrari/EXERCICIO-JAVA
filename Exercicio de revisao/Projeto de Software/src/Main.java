public class Main{
    public static void main(String[]args){
    Programador prog1 = new Programador(10, "Hugo Ferrari", "Java");
    Programador prog2 = new Programador(12, "Arthur", "Python");

    Projeto proj1 = new Projeto(1 ,"Forum-Facef");

    proj1.SetAdd(prog1);
    proj1.SetAdd(prog2);


        System.out.println(proj1.toString());
    }
}