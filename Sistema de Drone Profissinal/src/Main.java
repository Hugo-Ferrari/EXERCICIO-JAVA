public class Main {
    public static void main(String[]args){
        Drone obj1 = new Drone();

        obj1.setBateria(30);
        obj1.decolar();
        obj1.setAltura(20);
        obj1.subir(40);
       obj1.descer(10);


        System.out.println(obj1);

    }
}