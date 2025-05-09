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

        for(int i = 0;i <= 10; i = i +2) {
        System.out.println(i);
        }

        // decremento
        System.out.println("contagem regressiva...");
        for (int i = 10; i > 0; i--) {
            Thread.sleep(1000L);
            System.out.println(i + "...");
        }
        System.out.println("booom !!");
    }
}