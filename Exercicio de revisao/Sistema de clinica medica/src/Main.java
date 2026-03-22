import java.time.LocalDateTime;
import java.time.Month;

public class Main{
    public static void main(String[] args){
        Medico med1 = new Medico(1, "Carlos", "Cardiologista");
        Paciente pac1 = new Paciente(12, "Hugo ", "48371301863");
        LocalDateTime date = LocalDateTime.of(2026,5,20, 10,30);
    Consulta cons1 = new Consulta(date,25, med1, pac1);

        System.out.println(cons1.toString());
    }
}