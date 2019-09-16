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
public class Ex3_Tabuada {
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o primeiro número ");
        int n = entrada.nextInt();
        System.out.println("Tabuada do " + n);
        for (int i=1 ; i<=10 ; i++){
            System.out.print(i + "*" + n +" = ");
            System.out.println(n*i);
            
        }
    }
}
