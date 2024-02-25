package cursojava.execao;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

import javax.swing.*;

public class ArrayVetor {
    public static void main(String[] args) {
        double[] notas = {8.8, 9.2, 10.0, 8.9};
        double[] notasProa = {9.8, 10, 10.0, 9.9};





        Aluno aluno = new Aluno();
        aluno.setNome("Anthony");
        aluno.setNomeEscola("JDEV Treinamento");

        Disciplina disciplina = new Disciplina();
        disciplina.setDisciplina("Curso de Java");
        disciplina.setNota(notas);

        aluno.getDisciplina().add(disciplina);

        Disciplina disciplina2 = new Disciplina();
        disciplina2.setDisciplina("Curso Proa");
        disciplina2.setNota(notasProa);

        aluno.getDisciplina().add(disciplina2);

        System.out.println("Nome do aluno = " + aluno.getNome() + "inscrito no curso : " + aluno.getNomeEscola());

        System.out.println("=-=-=-=-= Disciplina do aluno =-=-=-=-=");
        for (Disciplina dis : aluno.getDisciplina()){

            System.out.println("Disciplinas : " + dis.getDisciplina());
            System.out.println("As notas da disciplina são: ");

            for (int pos = 0; pos < dis.getNota().length; pos++){
                System.out.println("Nota " + (pos +1) + " é igual = " + dis.getNota()[pos]);
            }

            maiorNota(dis.getNota());
            menorNota(dis.getNota());
        }


    }
    public static void maiorNota(double[] nt) {
        double notaMax = nt[0];

        for (int pos = 0; pos < nt.length; pos++){
            if (nt[pos] > notaMax){
                notaMax = nt[pos];
            }
        }
        System.out.println("A maior nota da Disciplina foi = " + notaMax);
    }

    public static void menorNota(double[] nt) {
        double notaMin = nt[0];

        for (int pos = 0; pos < nt.length; pos++){
            if (nt[pos] < notaMin){
                notaMin = nt[pos];
            }
        }
        System.out.println("A menor nota da Disciplina foi = " + notaMin);
    }
}
