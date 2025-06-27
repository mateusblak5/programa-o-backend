package com.mycompany;

public class Aula09Objetos {

    public static void main(String[] args) {
    /*
     * Em java, toda classe ou tipo abstrato é um objeto, pois possuem características  
     *  e funcionalidades.
     * Eles herdam funções da classe mãe java.lang.Object, é correto afirmar que java.lang.Object é uma super classe
     * de qualquer outra classe ou tipo abstrato.
     */
     Integer numero = 10;
     int numero2 = 10;

     // Restorna se a variavel/classe é uma instancia de outra classe
     System.out.println(numero instanceof Object);

     // Metodo compareTo pertence ao tipo abstrato integer
     numero.compareTo(numero2);
    }
}