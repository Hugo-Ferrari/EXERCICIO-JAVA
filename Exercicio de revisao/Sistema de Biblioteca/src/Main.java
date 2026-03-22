import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        Livro li1 = new Livro(12, "O Principe", "Nicolau Maquiavel");
        Leitor le1 = new Leitor(10,"Hugo Ferrari Pires ");

        LocalDateTime Dataemprestimo = LocalDateTime.now();
        LocalDateTime DataDevolucaoPrevista = LocalDateTime.of(2026,6,10,12,10);
        Emprestimo emp1 = new Emprestimo(Dataemprestimo,DataDevolucaoPrevista,le1, li1);

        System.out.println(emp1.toString());
    }
}