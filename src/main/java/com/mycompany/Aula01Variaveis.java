package com.mycompany;

public class Aula01Variaveis {

    public static void main(String[] args) {
        //Variavel logica
      
        // Tipo primitivo
        boolean valorLogicoPrimitivo = true;
        // Exibe o valor
        System.out.println(valorLogicoPrimitivo);

        // Tipo abstrato
        Boolean valorLogicoAbstrato = false;
        // Exibe com texto
        System.out.println("O valor da varíavel valorLogicoAbstrato é: " + valorLogicoAbstrato);

        //variaveis inteiras

        //tipo primitivo
        int valorInteiro= 10; //32 bits
        long valorInteiroLongo= 10L; //64 bits

        System.out.println("O valor de valorInteiro é: " + valorInteiro + ", e o valor devalorInteiro é: " + valorInteiroLongo);
        //variaveis Decimais

        //tipo Primitivo
        float numeroFloat = 10.5f; //32 bits
        double numeroDouble = 10.5; //32 bits

        //tipo abstrato
        Float numeroFloatAbs = 10.5f; 
        double numeroDoubleAbs = 10.5; 

        System.out.println("O valor de numeroFloat é: " + numeroFloat + ", e o valor de numeroDouble é: "
        + numeroDouble);
    }
} 