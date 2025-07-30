package com.mycompany;

public class Aula09Objetos {

    public static void main(String[] args) {
        /*
         * Em java, toda classe ou tipo abstrato é um objeto, pois possuem
         * características
         * e funcionalidades.
         * Eles herdam funções da classe mãe java.lang.Object, é correto afirmar que
         * java.lang.Object é uma super classe
         * de qualquer outra classe ou tipo abstrato.
         */
        Integer numero = 10;
        int numero2 = 10;

        // Restorna se a variavel/classe é uma instancia de outra classe
        System.out.println(numero instanceof Object);

        // Metodo compareTo pertence ao tipo abstrato integer
        numero.compareTo(numero2);

        Carro carro = new Carro("chevrolet", "celta")
        carro.andar(60);
    }

    /*
     * criando uma classe dentro de outra classe
     * 
     * é necessario utilizar a instituição static
     * entre public e class
     */
    public static class Carro {
        // atributos da classe
        String modelo;
        String marca;
        int ano;
        int quilometragem = 0;
        
        /**
         * Método construtor
         * 
         * ele é chamado quando criamos uma nova instância
         * da classe.
         */
        public Carro(String modelo, String marca) {
            this.modelo = modelo;
            this.marca = marca;
        }

        // Ações da classe
        void andar(int km) {
            this.quilometragem += km;
            System.out.println("O carro está percorrendo " + km + "km");
        }
    }
}