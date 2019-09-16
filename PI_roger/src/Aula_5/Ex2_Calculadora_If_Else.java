/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula_5;

import java.util.Scanner;

/**
 *
 * @author roger.kpbarreto
 */
public class Ex2_Calculadora_If_Else {
     public static void main(String[] args){
        double a, b;
        String operacaoStr;
        char operacao;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("<A>dição");
        System.out.println("<S>ubtração");
        System.out.println("<M>ultiplicação");
        System.out.println("<D>ivisão");
        System.out.println("Escolha a operação");
        
        //Nessa parte se converte a entrada que o usuário digita que é string para char
        
        operacaoStr = entrada.next();
        operacao = operacaoStr.charAt(0);
        //
        System.out.print ("1° Operando: ");
        a = entrada.nextDouble();
        System.out.print ("2° Operando: ");
        b = entrada.nextDouble();
        
        if(operacao=='A' || operacao=='a'){
                System.out.println("Soma = " + (a+b));
        }
        else{
            if(operacao=='S' || operacao=='s'){
                System.out.println("Subtração = " + (a-b));
            }
                
            else{
                if(operacao=='M' || operacao=='m')
                System.out.println("Multiplicação = " + (a*b));
            }
                if(operacao=='D' || operacao=='d'){
                System.out.println("Divisão = " + (a/b));
                }
                
                else{
                    System.out.println("A operação "+ operacao + "não é válida");    
            }
        
        
        }
    
    }
}     
