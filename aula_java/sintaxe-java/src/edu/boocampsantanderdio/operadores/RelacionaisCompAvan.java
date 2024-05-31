package edu.boocampsantanderdio.operadores;

public class RelacionaisCompAvan {
    public static void main(String[] args) {
            // Comparação avançada
            // Comparação de texto ou objeto
            String nome1 = "JAVA";
            String nome2 = "JAVA";
            
            // retorna se é true ou false
            System.out.println(nome1 == nome2); //true
    
            String nome3 = new String("JAVA");
            
            // false, por esta se tratando de objeto
            System.out.println(nome1 == nome3); //false
    
            String nome4 = nome3;
    
            System.out.println(nome3 == nome4); //true
            
            //equals comparação de objetos 
            // equals compara conteúdo, portato ele compara se o conteúdo dos objetos são iguais
            System.out.println(nome1.equals(nome2)); //??
            System.out.println(nome2.equals(nome3)); //??
            System.out.println(nome3.equals(nome4)); //??
    }
}
