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
public class Ex4_NumeroString {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite uma palavra: ");
        
        String palavra = entrada.next();
        int n = palavra.length();
        System.out.println("A palavra contém: "+n+ " letras." );
        
        
       
        
    }
}
