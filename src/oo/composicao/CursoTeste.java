package oo.composicao;

public class CursoTeste {

    public static void main(String[] args) {
        Aluno a1 = new Aluno("Aline");
        Aluno a2 = new Aluno("Clara");
        Aluno a3 = new Aluno("Mike");

        Curso c1 = new Curso("Java");
        Curso c2 = new Curso("WEB");
        Curso c3 = new Curso("Mobile");

        c1.adicionarAluno(a1);
        c1.adicionarAluno(a2);

        c2.adicionarAluno(a1);
        c2.adicionarAluno(a3);

        a1.adicionarCurso(c3);
        a2.adicionarCurso(c3);
        a3.adicionarCurso(c3);

        for(Aluno aluno: c3.alunos) {
            System.out.println("Estou matriculado no curso" + c3.nome);
            System.out.println("e meu nome é: " + aluno.nome +"...");
            System.out.println();
        }

        System.out.println(a1.cursos.get(0).alunos); // usando a toString

    }
}
