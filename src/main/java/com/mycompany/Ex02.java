package com.mycompany;

import java.util.Scanner;

public class Ex02 {
         public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);
        
        // Solicita ao usuário que insira um número
        System.out.print("Digite um número para ver sua tabuada: ");
        int numero = scanner.nextInt();
        
        // Exibe a tabuada do número
        System.out.println("Tabuada do " + numero + ":");
        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }
        
        // Fecha o scanner
        scanner.close();
    }
}
