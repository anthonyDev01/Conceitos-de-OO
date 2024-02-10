package cursojava.classes;

import java.util.ArrayList;

public class Aluno {
    private String nome;
    private int idade;
    private String dataNascimento;
    private String registroGeral;
    private String numeroCpf;
    private String nomeMae;
    private String nomePai;
    private String dataMatricula;
    private String nomeEscola;
    private String serieMatriculado;

    private ArrayList<Integer> notas = new ArrayList<Integer>();


    //==============>Contrutores<==============
    public Aluno(){

    }
    public  Aluno(String nomePadrao){
        nome = nomePadrao;
    }

    public  Aluno(String nomePadrao, int idadePadrao){
        nome = nomePadrao;
        idade = idadePadrao;
    }

    //==============>Metodos<==============

    public void adicionarNotas(int... notas){
        for(int nota : notas){
            this.notas.add(nota);
        }
    }

    public double mediaNotas(){
        int total = 0;

        for( int nota: notas){
            total += nota;
        }

        return (double) total / notas.size();
    }

    public boolean getAlunoAprovado(){
        return mediaNotas() >= 5;
    }


    //==============>Getter and Setters<==============

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
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

    public ArrayList<Integer> getNotas() {
        return notas;
    }

    public void setNotas(ArrayList<Integer> notas) {
        this.notas = notas;
    }
}
