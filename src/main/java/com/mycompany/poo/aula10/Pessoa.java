package com.mycompany.poo.aula10;

public class Pessoa {
    /*
     * Modificadores de Acesso
     * 
     * Quando trabalhamos com o conceito de POO, utilizamos modificadores de acesso 
     * para dar segurança para nossas classes.
     * 
     * Utilizamos elas como prefixo para:
     * - Classes
     * - interfaces
     * - Atributos
     * - Métodos 
     */
    public String nome; // Público, é visivel em qualquer classe.
    protected int idade; // Protegido, é visivel somente em classes filhas (Herança)
    private double salario; // Privado, é visivel somente dentro da própria classe.
    double altura; //Friendly ou Público, apesar de não estar explicitado, ele também é visivel.

    public void exibirDados() {
        System.out.println("---Dados da pessoa---");
        System.out.println("Nome: " + nome);
        System.out.println("idade: " + idade);
        System.out.println("Altura (m): " + altura);
    }
}
