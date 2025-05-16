package com.mycompany;

import java.util.Scanner;

public class Aula06Condicional {
    public static void main(String[] args) {
        /**
         * Estrutura condicional simples (if, else)
         * 
         * pode ser lida como : SE, SENÃo
         * 
         * a condição verdadeira é executada dentro do if
         */
        int num = 3;

        // % é o resto da divisão
        // comparando com 0, significa que o número é par
        if (num % 2 == 0) {
            System.out.println(num + "é par !!");
        } else {
            System.out.println(num + " é impar !!");
        }

        /**
         * Estrutura condicional composta (if, elseif, else)
         * 
         * nesse tipo de estrutura podemos ter mais de uma
         * verificação caso o primeiro if não seja satisfeito
         * 
         * um exemplo prático pode ser a verificação do IMC
         */

        double imc = 24.0;

        if (imc < 18.5) {
            System.out.println("Está abaixo do peso");
        } else if (imc >= 18.5 && imc < 24.5) {
            System.out.println("Está com peso ideal");
        } else {
            System.out.println("Está com obesidade");
        }

        /**
         * Estrutura Switch/Case
         * 
         * é similar ao if/else com a diferença que ele considera valores predefinidos
         * que serao observaods em cada case (caso)
         * 
         * na suta estrutura ele analisa uma variavel e considera dentre suas opçoes
         * qual
         * considera
         * 
         * cada estrutura case deve conter um brake para encerrar a execução
         * 
         * o default (padrão) é executado caso nenhum case nenhum case tenha sido
         * executado
         * 
         * um exemplo seria uma pergunta de multiplas escolhas
         */

        // Digitando texto em mais de uma linha
        System.out.println(
                "1) Verde,  Amarelo e Azul, s]ao cores que fazem parte da bandeira de qual país?\n" + //
                        "\na) Argentina" + // \n é um caracter de scape usado para pula linha.
                        "\nb) Paraguai" +
                        "\nc) Brasil" +
                        "\nd) Alemanha" +
                        "\n\nDigite uma opção: ");

        Scanner scan = new Scanner(System.in);
        String opcao = scan.nextLine();
    }
}