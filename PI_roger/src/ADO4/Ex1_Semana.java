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
public class Ex1_Semana {
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite o numero de 1 a 7: ");
        Integer numero = entrada.nextInt();
        String numeroStr = Integer.toString(numero);
            
        
        switch(numeroStr){
            case "1":
                System.out.println("Domingo ");
                break;
            case "2":
                System.out.println("Segunda");
                break;
            case "3":
                System.out.println("Terça");
                break;
            case "4":
                System.out.println("Quarta");
                break;
            case "5":
                System.out.println("Quinta");
                break;
            case "6":
                System.out.println("Sexta");
                break;
            case "7":
                System.out.println("Sábado");      
                break;
                
            default:
                    System.out.println("Não é válido");  
    }
}
}