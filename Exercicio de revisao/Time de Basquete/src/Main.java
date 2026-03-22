public class Main{
    public static  void main(String[] args){
    Atleta a1 = new Atleta(10, "Lucas Dias", "Pivo");
    Atleta a2 = new Atleta(9, "David Marcio", "Armador" );

    Time t1 = new Time(3, "Franca Basquete","helinho");

    t1.contratarAtleta(a1);
    t1.contratarAtleta(a2);

        System.out.println(t1.toString());

        t1 = null; // apagar o time;


        System.out.println(a1.toString());
        System.out.println(a2.toString());


    }
}