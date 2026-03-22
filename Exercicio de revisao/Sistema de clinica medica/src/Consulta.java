import java.time.LocalDateTime;

public class Consulta {
    private LocalDateTime date;
    private float ValorDaConsulta;
    private Medico medico;
    private Paciente paciente;

// classe associada ao medico e ao paciente;
    public Consulta(LocalDateTime date, float valorDaConsulta, Medico medico, Paciente paciente) {
        this.date = date;
        ValorDaConsulta = valorDaConsulta;
        this.medico = medico;
        this.paciente = paciente;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public float getValorDaConsulta() {
        return ValorDaConsulta;
    }

    public void setValorDaConsulta(float valorDaConsulta) {
        ValorDaConsulta = valorDaConsulta;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    @Override
    public String toString() {
        return "Consulta{" +
                "date=" + date +
                ", ValorDaConsulta=" + ValorDaConsulta +
                ", medico=" + medico +
                ", paciente=" + paciente +
                '}';
    }
}
