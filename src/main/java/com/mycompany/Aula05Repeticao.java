package com.mycompany;

public class Aula05Repeticao {

    public static void main(String[] args) throws InterruptedException {
        /**
         * For (para)
         * 
         * Para cada elemento repita
         * 1 variavel de interacao
         * 2 condicao de parada
         * 3 incremento ou decremento
         */
        // incremento

        for (int i = 0; i <= 10; i = i + 2) {
            System.out.println(i);
        }

        // decremento
        System.out.println("contagem regressiva...");
        for (int i = 10; i > 0; i--) {
            Thread.sleep(1000L);
            System.out.println(i + "...");
        }
        System.out.println("booom !!");
        /**
         * 
         * É utilizada para ler valores do usuario inseridas pelo prompt
         */

        // Scanner scan = new Scanner(System.in);
        // System.out.println("digite um numero :");

        int numero = scan.nextint();
        // System.out.println("voce digitou " + numero + " !!");
        /**
         * Do While (execute, enquanto)
         * enquanto a condição for verdadera o codigo sera executado
         * diferente da proxima estrutura essa faz a validação antes da execução
         */

        int num1 = 1;

        while (num != 0) {
            Scanner scan = new Scanner(System.in);
            System.out.println("digite um numero : (0 para parar)");

            num1 = scan.nextint();

            System.out.println("voce digitou " + num1 + "!!");
        }

        System.out.println("execeução encerrada");
        /**
         * do while (execute, enquanto)
         * 
         * é executada uma estrutura de codigo e depois é validada a condição
         */

        int num2 = 1;

        do {
            Scanner scan = new Scanner(System.in);
            System.out.println("digite um numero para encerrar: (0 para sair)");

            num2 = scan.nextint();
        } while (num2 != 0);

        System.out.println("execução encerrada");
    }

}