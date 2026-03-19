import java.util.ArrayList;

public class Avalicao {
    private  int id;
    private String nome;
    ArrayList<Questao> questoes = new ArrayList<>();

    public Avalicao(int id, String nome) {
        this.id = id;
        this.nome = nome;
        this.questoes = new ArrayList<>();
    }

    public void adicionarQuestao(int num, String texto, float peso){
        Questao q = new Questao(num,peso, texto);
        questoes.add(q);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Questao> getQuestoes() {
        return questoes;
    }

    public void setQuestoes(ArrayList<Questao> questoes) {
        this.questoes = questoes;
    }

    @Override
    public String toString() {
        return "Avalicao{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", questoes=" + questoes +
                '}';
    }
}
