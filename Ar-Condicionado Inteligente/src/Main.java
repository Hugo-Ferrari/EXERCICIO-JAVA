public class Main {
    public static void main(String[] args) {
        ArCondicionado obj1 = new ArCondicionado();

        obj1.ligarAr();
        obj1.setMarca("philips");
        obj1.setModelo("janela");
        obj1.setTemperatura(20);
        obj1.ativarModoTurbo();

        obj1.desligarAr();
        System.out.println(obj1);
    }

}