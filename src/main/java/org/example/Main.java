package org.example;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Aluno> alunos = new ArrayList<>();

        for(int i = 1; i <= 2; i++){

        String nome = JOptionPane.showInputDialog("Qual é o nome do aluno " + i +" ?");
        /*int idade = Integer.parseInt(JOptionPane.showInputDialog("Qual é a sua idade ? "));
        String dataNascimento = JOptionPane.showInputDialog("Qual sua data de nascimento ? ");
        String rg = JOptionPane.showInputDialog("Qual é o seu RG? ");
        String cpf = JOptionPane.showInputDialog("Qual é o seu CPF? ");
        String nomeMae = JOptionPane.showInputDialog("Qual é o nome da sua mãe? ");
        String nomePai = JOptionPane.showInputDialog("Qual é o nome do seu pai? ");
        String dataMatricula = JOptionPane.showInputDialog("Qual foi a data da sua matricula? ");
        String serieMatriculado = JOptionPane.showInputDialog("Qual serie voce esta matriculado? ");*/

        Aluno aluno1 = new Aluno();

        aluno1.setNome(nome);
        /*aluno1.setIdade(idade);
        aluno1.setDataNascimento(dataNascimento);
        aluno1.setRegistroGeral(rg);
        aluno1.setNumeroCpf(cpf);
        aluno1.setNomeMae(nomeMae);
        aluno1.setNomePai(nomePai);
        aluno1.setDataMatricula(dataMatricula);
        aluno1.setSerieMatriculado(serieMatriculado);*/


        for(int pos = 1; pos <= 4; pos++){
            String nomeDisciplina = JOptionPane.showInputDialog("Nome da disciplina " + pos + " ?");
            int notaDisciplina = Integer.parseInt(JOptionPane.showInputDialog("Nome da nota " + pos + " ?"));

            Disciplina disciplina = new Disciplina();
            disciplina.setDisciplina(nomeDisciplina);
            disciplina.setNota(notaDisciplina);

            aluno1.getDisciplina().add(disciplina);
        }

        int escolha = JOptionPane.showConfirmDialog( null, "Deseja remover alguma disciplina? ");

        if(escolha == 0){
            int continuarRemovendo = 0;
            int posicao = 1;

            while (continuarRemovendo == 0){
                String disciplinaRemover = JOptionPane.showInputDialog("Qual a disciplina 1, 2, 3, ou 4 ?");
                aluno1.getDisciplina().remove(Integer.valueOf(disciplinaRemover).intValue() - posicao);
                posicao++;
                continuarRemovendo = JOptionPane.showConfirmDialog(null, "Deseja continuar removendo?");
            }

        }
            alunos.add(aluno1);
        }

        for(Aluno aluno: alunos){
            System.out.println(aluno.getNome() + " tem " + aluno.getIdade() + " e esta no " + aluno.getSerieMatriculado() + " ano do ensino medio!");

            for(Disciplina disciplina: aluno.getDisciplina()){
                System.out.println(disciplina.getDisciplina() + ": " + disciplina.getNota());
            }

            System.out.println("A media de " + aluno.getNome() + " Foi: " + aluno.mediaNotas());
            System.out.println(aluno.getAlunoAprovado());
            System.out.println("==================================================================================================");
        }

    }
}