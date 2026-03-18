import javax.xml.crypto.Data;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class Reserva {
    private int cod;
    private LocalDateTime date;
    private int poltrona;
    private Voo voo;
    private Passageiro passageiro;


// construtores com e sem parametros
    public Reserva() {
    }

    public Reserva(int cod, LocalDateTime date, int poltrona, Voo voo, Passageiro passageiro) {
        this.cod = cod;
        this.date = date;
        this.poltrona = poltrona;
        this.voo = voo;
        this.passageiro = passageiro;
    }

    // getters e setters

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public LocalDateTime getData() {
        return date;
    }

    public void setData(LocalDateTime date) {
        this.date = date;
    }

    public int getPoltrona() {
        return poltrona;
    }

    public void setPoltrona(int poltrona) {
        this.poltrona = poltrona;
    }

    public Voo getVoo() {
        return voo;
    }

    public void setVoo(Voo voo) {
        this.voo = voo;
    }

    public Passageiro getPassageiro() {
        return passageiro;
    }

    public void setPassageiro(Passageiro passageiro) {
        this.passageiro = passageiro;
    }

    @Override
    public String toString() {
        DateTimeFormatter formatoBR = DateTimeFormatter.ofPattern("dd/MM/yyyy 'às' HH'h'mm");
        return "Reserva{" +
                "cod=" + cod +
                ", date=" + date.format(formatoBR) +
                ", poltrona=" + poltrona +
                ", voo=" + voo +
                ", passageiro=" + passageiro +
                '}';
    }
}
