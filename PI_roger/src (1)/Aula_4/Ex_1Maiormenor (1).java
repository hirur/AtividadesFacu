/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula_4;

import java.util.Scanner;

/**
 *
 * @author roger.kpbarreto
 */
public class Ex_1Maiormenor {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o primeiro número ");
        int n1 = entrada.nextInt();
        
        System.out.print("Digite o segundo numero ");
        int n2 = entrada.nextInt();
        
      if(n1>n2){
          System.out.print(n1 + " é maior que " + n2);
      }
      
      else{
           System.out.print(n2 + " é maior que " + n1); 
    }
    }
}
