package org.example;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

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

        aluno1.setNome(nome);
        aluno1.setIdade(idade);
        aluno1.setDataNascimento(dataNascimento);
        aluno1.setRegistroGeral(rg);
        aluno1.setNumeroCpf(cpf);
        aluno1.setNomeMae(nomeMae);
        aluno1.setNomePai(nomePai);
        aluno1.setDataMatricula(dataMatricula);
        aluno1.setSerieMatriculado(serieMatriculado);


        for(int pos = 1; pos <= 4; pos++){
            String nomeDisciplina = JOptionPane.showInputDialog("Nome da disciplina " + pos + " ?");
            int notaDisciplina = Integer.parseInt(JOptionPane.showInputDialog("Nome da nota " + pos + " ?"));

            Disciplina disciplina = new Disciplina();
            disciplina.setDisciplina(nomeDisciplina);
            disciplina.setNota(notaDisciplina);

            aluno1.getDisciplina().add(disciplina);
        }


        System.out.println(aluno1.getNome() + " tem " + aluno1.getIdade() + " e esta no " + aluno1.getSerieMatriculado() + " ano do ensino medio!");
        System.out.println("A media de " + aluno1.getNome() + " Foi: " + aluno1.mediaNotas());
        System.out.println(aluno1.getNome() + " foi " + (aluno1.getAlunoAprovado() ? "Aprovada!" : "Reprovada!"));
        System.out.println(aluno1.toString());

    }
}