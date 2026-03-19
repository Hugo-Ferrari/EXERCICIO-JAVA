public class Main {
    public static  void main(String[]args){
        Aluno aluno1 = new Aluno("Hugo","Engenharia de Software", 12, 1 );
        Aluno aluno2 = new Aluno("Sofia","Engenharia de Software ", 321,2  );

        Disciplina dis1 = new Disciplina("1", "Programação Orientada a Objetos", "Daniel");

        dis1.matricularAluno(aluno1);
        dis1.matricularAluno(aluno2);

        dis1.criarAvaliacao(1, "prova bimestral");

        Avalicao av1 = dis1.getAvalicaoes().get(0);
        av1.adicionarQuestao(1, "O que é POO?", 2.0f);
        av1.adicionarQuestao(2, "Explique encapsulamento", 3.0f);
        av1.adicionarQuestao(3, "Diferença entre herança e composição", 5.0f);


        System.out.println(dis1.toString());
    }

}