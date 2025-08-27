package com.mycompany.poo.aula11.ex05;

public class Time {
    //atributos
    private String nome;
    private String abreviacao;
    private int torcida; // Número de torcedores
    private String estado;
    private String cidade;

    // Construtor para inicializar os atributos
    public Time(String nome, String abreviacao, int torcida, String estado, String cidade) {
        this.nome = nome;
        this.abreviacao = abreviacao;
        this.torcida = torcida;
        this.estado = estado;
        this.cidade = cidade;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAbreviacao() {
        return abreviacao;
    }

    public void setAbreviacao(String abreviacao) {
        this.abreviacao = abreviacao;
    }

    public int getTorcida() {
        return torcida;
    }

    public void setTorcida(int torcida) {
        this.torcida = torcida;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    // Método para exibir informações do time
    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Abreviação: " + abreviacao);
        System.out.println("Torcida: " + torcida + " torcedores");
        System.out.println("Estado: " + estado);
        System.out.println("Cidade: " + cidade);
    }
}