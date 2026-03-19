import java.util.ArrayList;

public class Disciplina {
    private String id, nome, professor;
    ArrayList<Aluno> alunos = new ArrayList<>();
    ArrayList<Avalicao> avalicaoes = new ArrayList<>();



    public Disciplina(String id, String nome, String professor) {
        this.id = id;
        this.nome = nome;
        this.professor = professor;
    }

    public void matricularAluno(Aluno a){
            alunos.add(a);
    }

    public void criarAvaliacao(int id, String nome){
        Avalicao av = new Avalicao(id, nome);
        avalicaoes.add(av);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getProfessor() {
        return professor;
    }

    public void setProfessor(String professor) {
        this.professor = professor;
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(ArrayList<Aluno> alunos) {
        this.alunos = alunos;
    }

    public ArrayList<Avalicao> getAvalicaoes() {
        return avalicaoes;
    }

    public void setAvalicaoes(ArrayList<Avalicao> avalicaoes) {
        this.avalicaoes = avalicaoes;
    }

    @Override
    public String toString() {
        return "Disciplina{" +
                "id='" + id + '\'' +
                ", nome='" + nome + '\'' +
                ", professor='" + professor + '\'' +
                ", alunos=" + alunos +
                ", avalicaoes=" + avalicaoes +
                '}';
    }
}
