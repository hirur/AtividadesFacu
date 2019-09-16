/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ADO4;

import java.util.Scanner;

/**
 *
 * @author roger
 */
public class Ex2_Questão {
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Qual é a diferença entre float e double: ");
            
        System.out.println("A: Float é para um caracter e double não  ");
        System.out.println("B: Double é usando para o dobro e float para caracter");
        System.out.println("C: É o numero de casas decimais que ele consegue suportar");
        System.out.println("D: Float é usando em string e double para némero");
        
        String respostaStr;
        char respostaChar;
        
        respostaStr = entrada.next();
        respostaChar = respostaStr.charAt(0);
                
        switch(respostaChar){
            case 'A':
            case 'a':    
                System.out.println("Resposta incorreta ");
                break;
            case 'B':
            case 'b':    
                System.out.println("Resposta incorreta");
                break;
            case 'C':
            case 'c':    
                System.out.println("Resposta correta");
                break;
            case 'D':
            case 'd':    
                System.out.println("Resposta incorreta");
                break;
                
            default:
                    System.out.println("A resposta digitada " +respostaChar + " não existe" );  
    }
    }
        
}
