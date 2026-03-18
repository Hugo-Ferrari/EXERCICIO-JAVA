import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Voo {
    private int numero;
    private String origem;
    private String destino;
    private LocalDateTime date;

    // construtores com e sem parametros

    public Voo() {
    }

    public Voo(int numero, String origem, String destino, LocalDateTime date) {
        this.numero = numero;
        this.origem = origem;
        this.destino = destino;
        this.date = date;
    }
    // getters e setters
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public LocalDateTime getLocalDateTime() {
        return date;
    }

    public void setLocalDateTime(LocalDateTime date) {
        this.date = date;
    }

    @Override
    public String toString() {
        // vamos formatar a data no brasil
        DateTimeFormatter formatoBR = DateTimeFormatter.ofPattern("dd/MM/yyyy 'às' HH'h'mm");
        return "Voo{" +
                "numero=" + numero +
                ", origem='" + origem + '\'' +
                ", destino='" + destino + '\'' +
                ", date=" + date.format(formatoBR) +
                '}';
    }
}
