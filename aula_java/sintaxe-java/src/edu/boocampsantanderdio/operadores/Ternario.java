package edu.boocampsantanderdio.operadores;

public class Ternario {
    public static void main(String[] args) {
        int a, b;

        a = 5;
        b = 5;

        /* EXEMPLO DE CONDICIONAL UTILIZANDO UMA ESTRUTURA IF/ELSE
        if(a==b)
        resultado = "verdadeiro";
        else
        resultado = "falso";
        */

        //MESMA CONDICIONAL, MAS DESSA VEZ, UTILIZANDO O OPERADOR CONDICIONAL TERNÁRIO
        // ? = if, : = else
        // Se o tipo da variável for string, o valor a ser retornado terá que ser string
        String resultado = (a==b) ? "verdadeiro" : "false";

        System.out.println(resultado);
    }
}
