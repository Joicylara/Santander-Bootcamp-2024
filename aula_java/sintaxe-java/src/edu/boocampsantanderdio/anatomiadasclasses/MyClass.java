package edu.boocampsantanderdio.anatomiadasclasses;

public class MyClass{

    public static void main(String [] args){
       // System.out.println("Hello, world");

    // quando a informação na variavel não altera usa-se a nomenclatura 
    //com todas as letras maiúscula, e para garantir, utiiza o final para não ser alteravel
        final String BR = "Brasil";
       //Br = "Brazil" isso não pode ser feito;
       String teste = "Aula Java - classe 3";
       int numerico = 1234;
       boolean logico = true;
       numerico = 234;

       // estrutura métodos
       //Tipo de retorno nome do objetivo no infinitivo e parametro(sendo do mesmo tipo ou tipos diferentes)
    
       String primeiroNome = "Jasmin";
       String segundoNome = "Washington";
       String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.println(nomeCompleto);
    }
    
    //
    public static String nomeCompleto (String primeiroNome, String segundoNome){
        // duas formas de concatenar: + e concat(" ")
        return "Resultado do método " + primeiroNome.concat(" ").concat(segundoNome);
    }

}