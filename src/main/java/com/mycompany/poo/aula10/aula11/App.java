package com.mycompany.poo.aula10.aula11;

public class App {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        
        // modificar o valor
        pessoa.setNome("mateus");
        pessoa.setIdade(26);

        // Acessar o valor
        System.out.printf("%s tem &d anos de idade\n",
        pessoa.getNome(), pessoa.getIdade());
    }
}
