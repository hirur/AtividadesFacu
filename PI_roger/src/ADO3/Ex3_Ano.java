/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ADO3;

import java.util.Scanner;

/**
 *
 * @author roger
 */
public class Ex3_Ano {
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o ano: ");
        int ano = entrada.nextInt();
        
        if (ano % 400 == 0 || ano % 4 == 0 && ano / 100 !=0 ){
            System.out.print("O ano é bissexto");
            
        }
        else{
            System.out.print("O ano não é bissexto");
        }
    }
}
