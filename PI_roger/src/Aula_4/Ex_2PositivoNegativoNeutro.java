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
public class Ex_2PositivoNegativoNeutro {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o número: ");
        int n = entrada.nextInt();
        
        if (n>=0){
           
            if(n>0)
                System.out.print(n + "  é positivo");
                
                else{
                System.out.print(n + "  é neutro");
                 }
            }      
            
       
        else{
            System.out.println(n + "  é negativo");
        }
    }
}
