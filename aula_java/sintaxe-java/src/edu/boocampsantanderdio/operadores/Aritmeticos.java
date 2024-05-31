package edu.boocampsantanderdio.operadores;

public class Aritmeticos {
    public static void main(String[] args) {
        //classe Operadores.java
        String nomeCompleto = "LINGUAGEM" + "JAVA";
                
        //qual o resultado das expressoes abaixo?
        String concatenacao ="?"; 

        concatenacao = 1+1+1+"1";
        System.out.println(concatenacao);
        // o resultado foi 31, pois somou 1+1+1 e concatenou 1 = 31

        concatenacao = 1+"1"+1+1;
        System.out.println(concatenacao);
        //o resultado deu 1111, pois ele somou o 1, encontrou uma string, portanto concatenou 
        // Entretanto, quando encontrou numero, ele não sabia mas identificar, portanto achou que era string e concatenou novamente

        concatenacao = 1+"1"+1+"1";
        System.out.println(concatenacao);
        //o resultado também deu 1111

        concatenacao = "1"+1+1+1;
        System.out.println(concatenacao);
        //o resultado também deu 1111

        concatenacao = "1"+(1+1+1);
        System.out.println(concatenacao);
        // o resultado deu 13, pois os numeros então em evidência, logo depois encotrou a string e concatenou
    }
}
