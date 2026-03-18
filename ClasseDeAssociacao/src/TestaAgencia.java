import java.time.LocalDateTime;

public class TestaAgencia{
    public static void main(String[]args){
        Passageiro pas1 = new Passageiro("123","Fulano");
        System.out.println(pas1.toString());

        LocalDateTime date =LocalDateTime.of(2026, 7,14, 10,30);

        Voo vo1 = new Voo(999, "Guarulhos", "Salvador", date);
        System.out.println(vo1);

        Reserva re1 = new Reserva(1425, LocalDateTime.now(), 45, vo1, pas1);
        System.out.println(re1.toString());
    }
}