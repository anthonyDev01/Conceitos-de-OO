package org.example;

import cursojava.classes.Aluno;

public class Main {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();
        Aluno aluno2 = new Aluno("Jao", 32);

        aluno1.setNome("Isabela");
        aluno1.setIdade(20);
        aluno1.setDataNascimento("19/03/2003");
        aluno1.setRegistroGeral("23111.43213.2313");
        aluno1.setNumeroCpf("928.283.961-4");
        aluno1.setNomeMae("Rosani");
        aluno1.setNomePai("Afonso");
        aluno1.setDataMatricula("10/01/2018");
        aluno1.setSerieMatriculado("1");
        aluno1.adicionarNotas(10,9,8,10);

        System.out.println(aluno1.getNome() + " tem " + aluno1.getIdade() + " e esta no " + aluno1.getSerieMatriculado() + " ano do ensino medio!");
        System.out.println("A media de " + aluno1.getNome() + " Foi: " + aluno1.mediaNotas());
        System.out.println(aluno1.getNome() + " foi " + (aluno1.getAlunoAprovado() ? "Aprovada!" : "Reprovada!"));

    }
}