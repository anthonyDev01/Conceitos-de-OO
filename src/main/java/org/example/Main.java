package org.example;

import cursojava.classes.Aluno;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();
        Aluno aluno2 = new Aluno("Jao", 32);

        String nome = JOptionPane.showInputDialog("Qual é o seu nome ? ");
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Qual é a sua idade ? "));
        String dataNascimento = JOptionPane.showInputDialog("Qual sua data de nascimento ? ");
        String rg = JOptionPane.showInputDialog("Qual é o seu RG? ");
        String cpf = JOptionPane.showInputDialog("Qual é o seu CPF? ");
        String nomeMae = JOptionPane.showInputDialog("Qual é o nome da sua mãe? ");
        String nomePai = JOptionPane.showInputDialog("Qual é o nome do seu pai? ");
        String dataMatricula = JOptionPane.showInputDialog("Qual foi a data da sua matricula? ");
        String serieMatriculado = JOptionPane.showInputDialog("Qual serie voce esta matriculado? ");
        String disciplina1 = JOptionPane.showInputDialog("Disciplina 1 ?");
        int nota1 = Integer.parseInt(JOptionPane.showInputDialog("nota 1 ?"));
        String disciplina2 = JOptionPane.showInputDialog("Disciplina 2 ?");
        int nota2 = Integer.parseInt(JOptionPane.showInputDialog("nota 2 ?"));
        String disciplina3 = JOptionPane.showInputDialog("Disciplina 3 ?");
        int nota3 = Integer.parseInt(JOptionPane.showInputDialog("nota 3 ?"));
        String disciplina4 = JOptionPane.showInputDialog("Disciplina 4 ?");
        int nota4 = Integer.parseInt(JOptionPane.showInputDialog("nota 4 ?"));

        aluno1.setNome(nome);
        aluno1.setIdade(idade);
        aluno1.setDataNascimento(dataNascimento);
        aluno1.setRegistroGeral(rg);
        aluno1.setNumeroCpf(cpf);
        aluno1.setNomeMae(nomeMae);
        aluno1.setNomePai(nomePai);
        aluno1.setDataMatricula(dataMatricula);
        aluno1.setSerieMatriculado(serieMatriculado);
        aluno1.getDisciplina().setDisciplina1(disciplina1);
        aluno1.getDisciplina().setNota1(nota1);
        aluno1.getDisciplina().setDisciplina2(disciplina2);
        aluno1.getDisciplina().setNota2(nota2);
        aluno1.getDisciplina().setDisciplina3(disciplina3);
        aluno1.getDisciplina().setNota3(nota3);
        aluno1.getDisciplina().setDisciplina4(disciplina4);
        aluno1.getDisciplina().setNota4(nota4);

        System.out.println(aluno1.getNome() + " tem " + aluno1.getIdade() + " e esta no " + aluno1.getSerieMatriculado() + " ano do ensino medio!");
        System.out.println("A media de " + aluno1.getNome() + " Foi: " + aluno1.mediaNotas());
        System.out.println(aluno1.getNome() + " foi " + (aluno1.getAlunoAprovado() ? "Aprovada!" : "Reprovada!"));
        System.out.println(aluno1.toString());

    }
}