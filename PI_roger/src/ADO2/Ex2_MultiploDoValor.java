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
public class Ex2_MultiploDoValor {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite o número:");
        int n = entrada.nextInt();
           
        for (int i=1 ; i<=3 ; i++){
            System.out.println("Os multiplos são " + n*i);
    }
        
       
        
        
    }
}