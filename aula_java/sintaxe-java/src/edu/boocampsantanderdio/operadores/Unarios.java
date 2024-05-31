package edu.boocampsantanderdio.operadores;

public class Unarios {
    public static void main(String[] args) {
        int numero = 5;
		
        //Imprimindo o numero negativo
        System.out.println(- numero); // -5

        // passar para positivo
        int numero2 = -7;
        numero2 = numero2 * -1;
        System.out.println(numero2); // 7
        
        //incrementando numero em mais 1 numero, imprime 6
        numero ++;
        System.out.println(numero); // 6

        //incrementando numero em mais 1 numero, imprime 7
        // ops algo de errado não está certo,está errado pois esta imprimindo 6, porém esta correto.
        // Já que ele fala para imprimir a variavel numero e depois incrementar mais 1. Portanto, o numero atualizado será na outra chamada de impressão
        System.out.println(numero ++);
        
        System.out.println(numero);// agora sim, numero virou 7
        // Porém se fosse:

        // System.out.println(++ numero);

        // Esse imprime o numero incrementado, pois ++ esta na frente da variavel numero, 
        //então incrementa antes e já imprime o valor atualizado


        //ordem de precedencia conta aqui
        System.out.println(++ numero);

        boolean verdadeiro = true;

        System.out.println("Inverteu " + !verdadeiro);

        // decrementar
        System.out.println(numero --);
        System.out.println(numero);

        System.out.println(-- numero);
        
    }
}
