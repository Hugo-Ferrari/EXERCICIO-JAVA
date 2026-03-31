import java.util.ArrayList;

public class Main{
    public static void main(String[]args){
        ArrayList<CanalNoticiacoes> canais = new ArrayList<>();


        CanalNoticiacoes email1 = new Email("Hugo" , "POO" , "venha para a aula de programação");
        CanalNoticiacoes SMS1 = new SMS("arthur", "venha tomar vacina rapidamente" , 992809719);
        CanalNoticiacoes Whats1 = new WhatsApp("Yamim" , "venha para a Uni-Facef" ,"Enviado");

        canais.add(email1);
        canais.add(SMS1);
        canais.add(Whats1);

        for(CanalNoticiacoes c: canais){ //a variavel c vai receber o array canais e vai executar os metoos enviar e o toString;
            c.enviar();
            c.toString();
        }
    }
}