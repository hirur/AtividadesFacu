/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ADO2;

import java.util.Scanner;

/**
 *
 * @author roger
 */
public class Ex1_ValorDoProduto {
     public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        
         System.out.print("Digite o primeiro número: ");
         double a = entrada.nextDouble();
         System.out.print("Digite o segundo número: ");
         double b = entrada.nextDouble();
         System.out.print("Digite o terceiro número: ");
         double c = entrada.nextDouble();
         
         System.out.print("O resultado é: " + a*b*c );
     }
        
    
}
