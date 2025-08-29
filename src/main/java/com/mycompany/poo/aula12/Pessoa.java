package com.mycompany.poo.aula12;

public class Pessoa {
    /**
     * Construtores 
     * 
     *  Utilizamos o método construtor para inicializar nossas classes,
     * funcionando com uma configuração previa da mesma.
     * 
     * toda classe quando é criada, possui um método coNtrutor vazio
     * que é chamado no momento que instanciamos a mesma.
     * 
     * uma mesma classe pode conter mais de um contrutor,
     * porem cada construtor deve possuir quantidade
     * e tipos de parametros diferentes
     */
    private String nome;
    private int idade;
    private double altura;
    private double peso;

    // Contrutor padrao
    // Todo método construtor possui o mesmo nome da classe
    public Pessoa() {
        System.out.println("Chamando o construtor padrão");
    }

    prublic Pessoa(String nome) {
        this.nome = nome;
        System.out.println("Chamando construtor 2");
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }


}
