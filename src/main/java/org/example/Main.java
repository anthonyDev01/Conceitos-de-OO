package org.example;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;
import cursojava.constantes.StatusAluno;

import javax.swing.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String login = JOptionPane.showInputDialog("Informe o login:");
        String senha = JOptionPane.showInputDialog("Informe a senha:");

        if (login.equalsIgnoreCase("admin") && senha.equalsIgnoreCase("admin")) {


            List<Aluno> alunos = new ArrayList<>();
            HashMap<String, List<Aluno>> maps = new HashMap<String, List<Aluno>>();

            for (int i = 1; i <= 2; i++) {

                String nome = JOptionPane.showInputDialog("Qual é o nome do aluno " + i + " ?");
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


                for (int pos = 1; pos <= 4; pos++) {
                    String nomeDisciplina = JOptionPane.showInputDialog("Nome da disciplina " + pos + " ?");
                    int notaDisciplina = Integer.parseInt(JOptionPane.showInputDialog("Nome da nota " + pos + " ?"));

                    Disciplina disciplina = new Disciplina();
                    disciplina.setDisciplina(nomeDisciplina);
                    disciplina.setNota(notaDisciplina);

                    aluno1.getDisciplina().add(disciplina);
                }

                int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina? ");

                if (escolha == 0) {
                    int continuarRemovendo = 0;
                    int posicao = 1;

                    while (continuarRemovendo == 0) {
                        String disciplinaRemover = JOptionPane.showInputDialog("Qual a disciplina 1, 2, 3, ou 4 ?");
                        aluno1.getDisciplina().remove(Integer.valueOf(disciplinaRemover).intValue() - posicao);
                        posicao++;
                        continuarRemovendo = JOptionPane.showConfirmDialog(null, "Deseja continuar removendo?");
                    }

                }
                alunos.add(aluno1);
            }

            maps.put(StatusAluno.APROVADO, new ArrayList<Aluno>());
            maps.put(StatusAluno.RECUPERACAO, new ArrayList<Aluno>());
            maps.put(StatusAluno.REPROVADO, new ArrayList<Aluno>());

            for (Aluno aluno : alunos) {

                if (aluno.getAlunoAprovado().equalsIgnoreCase(StatusAluno.APROVADO))
                    maps.get(StatusAluno.APROVADO);

                if (aluno.getAlunoAprovado().equalsIgnoreCase(StatusAluno.REPROVADO))
                    maps.get(StatusAluno.REPROVADO);

                else
                    maps.get(StatusAluno.RECUPERACAO);


                System.out.println("======================ALunos Aprovados======================");
                for (Aluno alunoAprovado : maps.get(StatusAluno.APROVADO)) {
                    System.out.println(alunoAprovado.getNome() + "Foi " + alunoAprovado.getAlunoAprovado() + "com media " + alunoAprovado.mediaNotas());
                }


                System.out.println("======================ALunos Reprovados======================");
                for (Aluno alunoReprovado : maps.get(StatusAluno.REPROVADO)) {
                    System.out.println(alunoReprovado.getNome() + "Foi " + alunoReprovado.getAlunoAprovado() + "com media " + alunoReprovado.mediaNotas());
                }

                System.out.println("======================ALunos de Recuperaçao======================");
                for (Aluno alunoRecuperacao : maps.get(StatusAluno.RECUPERACAO)) {
                    System.out.println(alunoRecuperacao.getNome() + "Foi " + alunoRecuperacao.getAlunoAprovado() + "com media " + alunoRecuperacao.mediaNotas());
                }

            }

        }
    }
}