package cursojava.classes;

import java.util.Objects;

public class Disciplina {
    private double[] nota = new double[4];
    private String disciplina;

    public double getMedia(){
        double somaNotas = 0.0;
        for (int pos = 0; pos < nota.length; pos++){
            somaNotas += nota[pos];
        }
        return somaNotas / 4;
    }

    public double[] getNota() {
        return nota;
    }

    public void setNota(double[] nota) {
        this.nota = nota;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Disciplina that = (Disciplina) o;
        return nota == that.nota && Objects.equals(disciplina, that.disciplina);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nota, disciplina);
    }

    @Override
    public String toString() {
        return "Disciplina{" +
                "nota=" + nota +
                ", disciplina='" + disciplina + '\'' +
                '}';
    }
}
