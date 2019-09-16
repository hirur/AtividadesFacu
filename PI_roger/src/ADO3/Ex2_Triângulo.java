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
public class Ex2_Triângulo {
       public static void main(String[] args){
        double a,b,c;
 
        Scanner entrada = new Scanner(System.in);
      
        System.out.print ("Digite o lado a: ");
        a=entrada.nextInt();
        System.out.print ("Digite o lado b: ");
        b=entrada.nextInt();
        System.out.print ("Digite o lado c: ");
        c=entrada.nextInt();
        
        if(a<b+c && b<a+c && c<a+b){
            System.out.println("Formam triângulo");
            if((a==b && b==c)){
                System.out.println("Triângulo equilátero");
            }
            else {
                if((a==b || b==c)){
                    System.out.println("Triângulo isosceles");
                }
                else {
                    System.out.println("Triângulo escaleno ");
                }
            }
        }
        else {
            System.out.println("NAO formam triângulo");
        }
    }   
}
