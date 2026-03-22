import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Sessao {
    private int id;
    private LocalDateTime horario;
    private int sala;
    private ArrayList<Ingresso> ingressos; // composição
    private Filme filme; // agregação

    public Sessao(int id, LocalDateTime horario, int sala) {
        this.id = id;
        this.horario = horario;
        this.sala = sala;
        this.ingressos = new ArrayList<>();

    }

    public void vincularFilme(Filme a ) {
        this.filme =a;
    }
    public void venderIngresso(int id, String assento, String tipo, float preco){

            Ingresso ingresso = new Ingresso(id, assento, tipo, preco);
            ingressos.add(ingresso);

    }

    @Override
    public String toString() {
        return "Sessao{" +
                "id=" + id +
                ", horario=" + horario +
                ", sala=" + sala +
                ", ingressos=" + ingressos +
                ", filme=" + filme +
                '}';
    }
}
