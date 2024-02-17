package cursojava.classes;

import cursojava.constantes.StatusAluno;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Aluno extends Pessoa{

    private String dataMatricula;
    private String nomeEscola;
    private String serieMatriculado;

    private List<Disciplina> disciplinas = new ArrayList<>();


    //==============>Contrutores<==============
    public Aluno() {

    }

    public Aluno(String nomePadrao) {
        nome = nomePadrao;
    }

    public Aluno(String nomePadrao, int idadePadrao) {
        nome = nomePadrao;
        idade = idadePadrao;
    }

    //==============>Metodos<==============


    public double mediaNotas() {
        double somaNotas = 0.0;
        for(Disciplina disciplina : disciplinas){

            somaNotas  += disciplina.getNota();
        }

        return somaNotas / disciplinas.size();
    }

    public String getAlunoAprovado() {
        if(mediaNotas() >= 5){
            if(mediaNotas() >= 7){
                return StatusAluno.APROVADO;
            }
            else {
                return StatusAluno.RECUPERACAO;
            }
        }
        else {
            return  StatusAluno.REPROVADO;
        }
    }

    @Override
    public boolean pessoaMaiorIdade() {
        return idade >= 21;
    }

    @Override
    public double salario() {
        return 1532.23;
    }

    public String msgMaiorIdade(){
        return this.pessoaMaiorIdade() ? "Aluno é maior de idade" : "aluno não é maior de idade";
    }


    //==============>Getter and Setters<==============

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }


    public int getIdade() {
        return idade;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getRegistroGeral() {
        return registroGeral;
    }

    public void setRegistroGeral(String registroGeral) {
        this.registroGeral = registroGeral;
    }

    public String getNomeMae() {
        return nomeMae;
    }

    public void setNomeMae(String nomeMae) {
        this.nomeMae = nomeMae;
    }

    public String getDataMatricula() {
        return dataMatricula;
    }

    public void setDataMatricula(String dataMatricula) {
        this.dataMatricula = dataMatricula;
    }

    public String getSerieMatriculado() {
        return serieMatriculado;
    }

    public void setSerieMatriculado(String serieMatriculado) {
        this.serieMatriculado = serieMatriculado;
    }

    public String getNomeEscola() {
        return nomeEscola;
    }

    public void setNomeEscola(String nomeEscola) {
        this.nomeEscola = nomeEscola;
    }

    public String getNumeroCpf() {
        return numeroCpf;
    }

    public void setNumeroCpf(String numeroCpf) {
        this.numeroCpf = numeroCpf;
    }

    public String getNomePai() {
        return nomePai;
    }

    public void setNomePai(String nomePai) {
        this.nomePai = nomePai;
    }

    public List<Disciplina> getDisciplina() {
        return disciplinas;
    }

    public void setDisciplina(List<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }


    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", dataNascimento='" + dataNascimento + '\'' +
                ", registroGeral='" + registroGeral + '\'' +
                ", numeroCpf='" + numeroCpf + '\'' +
                ", nomeMae='" + nomeMae + '\'' +
                ", nomePai='" + nomePai + '\'' +
                ", dataMatricula='" + dataMatricula + '\'' +
                ", nomeEscola='" + nomeEscola + '\'' +
                ", serieMatriculado='" + serieMatriculado + '\'' +
                ", disciplinas=" + disciplinas +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return Objects.equals(numeroCpf, aluno.numeroCpf);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numeroCpf);
    }
}
