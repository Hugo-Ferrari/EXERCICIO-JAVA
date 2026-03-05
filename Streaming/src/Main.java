public class Main{
    public static void main(String[] args){
        Streaming obj1 = new Streaming("Hugo" , "Básico");


        obj1.assistirFilme("Homem de ferro");
        obj1.cancelarAssinatura();
        System.out.println(obj1.toString()); //não precisa necessariamente colocar o toString, pois vai chamar ele automaticamente

    }
}