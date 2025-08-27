package com.mycompany.poo.aula10.aula11;

public class Pessoa {
    /*
     * Encapsulamento (Métodos acessores/modificadores)
     * 
     * Em projetos em grande escala, para mantermos a segurança de nossas classes
     * utilizamos os modificadores de acesso privado, com uma maior frequencia.
     * situaçoes precissamos buscar e alterar uma ou mais informaçoes
     * e é nesse cenario que utilizamos os metodos:
     * - Getter: Acessar/Buscar
     * - Setter: Modificar/Alterar
     */
    private String nome;
    private int idade;
    private double salario;
    private double altura;

    // Declaramos sempre após a declaração dos atributos

    // Método acessor , sempre começa com get
    public String getnome() {
        return nome;
    }

    // Método modificador, sempre começa com get
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura() {
        this.altura = altura;
    }
}
