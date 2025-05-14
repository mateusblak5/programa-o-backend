package com.mycompany;

import java.util.Locale;
import java.util.Scanner;

public class Aula03 {
    public static void main(String[] args) {
        // Configura o Scanner para aceitar vírgula como separador decimal
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.forLanguageTag("pt-BR"));

        // Solicita a altura e o peso do aluno
        System.out.print("Digite a altura (em metros): ");
        double altura = scanner.nextDouble();

        System.out.print("Digite o peso (em kg): ");
        double peso = scanner.nextDouble();

        // Calcula o IMC
        double imc = peso / (altura * altura);

        // Exibe o IMC
        System.out.printf("Seu IMC é: %.2f kg/m²%n", imc);

        // Classificação do IMC
        if (imc < 16) {
            System.out.println("Classificação: Magreza grau III");
        } else if (imc >= 16 && imc < 17) {
            System.out.println("Classificação: Magreza grau II");
        } else if (imc >= 17 && imc < 18.5) {
            System.out.println("Classificação: Magreza grau I");
        } else if (imc >= 18.5 && imc < 25) {
            System.out.println("Classificação: Eutrofia");
        } else if (imc >= 25 && imc < 30) {
            System.out.println("Classificação: Pré-obesidade");
        } else if (imc >= 30 && imc < 35) {
            System.out.println("Classificação: Obesidade moderada (grau I)");
        } else if (imc >= 35 && imc < 40) {
            System.out.println("Classificação: Obesidade severa (grau II)");
        } else {
            System.out.println("Classificação: Obesidade muito severa (grau III)");
        }

        // Fecha o scanner
        scanner.close();
    }
}
