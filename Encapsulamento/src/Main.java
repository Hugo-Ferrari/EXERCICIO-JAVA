public class Main{
    public static void main(String[]args){
        SmartTv obj1 = new SmartTv(" iphone ", " 15pro " , 10);

        obj1.setVolume(120); // não vai dar certo
        obj1.setVolume(30); //vai dar certo
        System.out.println("volume" + obj1.getVolume());

        SmartTv obj2 = new SmartTv(" Sansung " , " Qled", 10);

        obj2.setVolume(40);

        obj2.setabrirYoutbe();

        obj2.setaumentarVolume(30);
        obj2.setdiminuirVolume(20);
        System.out.println(obj1.toString());
        System.out.println(obj2.toString());
    }
}