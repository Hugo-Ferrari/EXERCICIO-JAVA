public class Aluno {
    private String  nome, curso;
    private int ra, id;

    public Aluno() {
    }

    public Aluno(String nome, String curso, int ra, int id) {
        this.nome = nome;
        this.curso = curso;
        this.ra = ra;
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getRa() {
        return ra;
    }

    public void setRa(int ra) {
        this.ra = ra;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", curso='" + curso + '\'' +
                ", ra=" + ra +
                ", id=" + id +
                '}';
    }
}
