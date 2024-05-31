package edu.boocampsantanderdio.tiposvariaveis;

// Os oito tipos primitivos em Java são:
//int, byte, short, long, float, double, boolean e char – esses tipos não são 
//considerados objetos e portanto representam valores brutos. 
//Eles são armazenados diretamente na pilha de memória. (Memory stack)


public class TiposVariaveis{
    public static void main(String[] args) {
        // TiposEVariaveis.java
        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        // o código abaixo da erro devido a tipagem
        //short numeroCurto2 = numeroNormal;
        // para funcionar foi add o cast, pega um tipo mais abrangente(int) para uma mais especifico correspondente(short)
        short numeroCurto2 = (short) numeroNormal;

        // representação de variável
        int numero = 1;
        numero = 2;

        // constante, não pode ser modificado, o nome da variável por convenção tem que ser tudo maiúsculo.
        final float PI = 3.14f;

        // esse código abaixo não irá funcionar, pois é constante
        //PI = 3.12;
    }
}