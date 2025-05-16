package com.mycompany;

public class Aula03Operadores {

     public static void main(String[] args) {
          /**
           * tipos de comentario
           */

          // Comentario de uma linha

          /**
           * Comentarios de
           * multiplas
           * linhas
           */

          /**
           * Comentários de
           * múltiplas
           * linhas
           * /
           * 
           * /**
           * Declaração de variáveis
           */

          String var1; // Toda variável declarada sem valor, automaticamente é null,
          String var2 = null; // variavel declarada com valor null
          String var3 = ""; // Variavel declarada com valor vazio (diferente de null)

          /**
           * operadores matematicos
           */

          int num1 = 10;
          int num2 = 2;

          // soma
          int soma = num1 + num2;
          System.out.println("A soma entre " + num1 + " e " + num2 + " é: " + soma);

          // Soma
          int subtracao = num1 + num2;
          System.out.println("A soma entre " + num1 + " e " + num2 + " é: " + soma);

          // subtração
          int subtração = num1 - num2;
          System.out.println("A subtração de " + num1 + " por " + num2 + " é: " + subtracao);

          // multiplicação
          int multiplicacao = num1 * num2;
          System.out.println("A multiplicacao de " + num1 + " por " + num2 + " é: " + multiplicacao);

          // divisão
          int divisao = num1 / num2;
          System.out.println("A divisao de " + num1 + " por " + num2 + " é: " + divisao);
     }
}