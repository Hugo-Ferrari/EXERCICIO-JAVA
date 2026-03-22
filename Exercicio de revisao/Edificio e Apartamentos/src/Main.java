public class Main{
    public static void main(String[] args){
    Edificio e = new Edificio("Residencial Ecovile", "Rua B");

    e.construirApartamento(101,10);
    e.construirApartamento(102,10);
    e.construirApartamento(103,10);
    e.construirApartamento(104,10);
    e.construirApartamento(105,10);


        System.out.println(e.toString());
    }
}