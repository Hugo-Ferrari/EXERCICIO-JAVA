import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        Filme f1 = new Filme(4, "Batman", "Ação", 120);
        Filme f2 = new Filme(6, "Duna", "Ação", 135);

        LocalDateTime hora = LocalDateTime.of(2026, 7, 20, 20, 0);
        Sessao se1 = new Sessao(1, hora, 6);


        se1.vincularFilme(f1);

        se1.venderIngresso(1, "A1", "Inteira", 20);
        se1.venderIngresso(2, "A2", "Meia", 10);
        se1.venderIngresso(3, "A3", "Inteira", 20);


        System.out.println(se1.toString());


    }
}