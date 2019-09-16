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
public class Ex1_Desconto {
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o valor da compra: ");
        
        double valorProduto = entrada.nextDouble();
        
        if(valorProduto>=300){
            double desconto =(valorProduto * 20) /100;
            valorProduto = valorProduto - desconto;
            System.out.print("O desconto é de: " + desconto + "%");
            System.out.print(" Valor final é de: " + valorProduto);
            
        }
        else{
            double desconto =(valorProduto * 15) /100;
            valorProduto = valorProduto - desconto;
            System.out.print("O desconto é de: " + desconto + "%");
            System.out.print(" Valor final é de: " + valorProduto);
    }
    }
}
