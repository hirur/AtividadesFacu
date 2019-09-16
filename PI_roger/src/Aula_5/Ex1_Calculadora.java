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
public class Ex1_Calculadora {
    public static void main(String[] args){
        //Variáveis
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
        
        switch(operacao){
            case 'A':
            case 'a':
                System.out.println("Soma = " + (a+b));
                break;
            case 'S':
            case 's':
                System.out.println("Subtração = " + (a-b));
                break;
            case 'M':
            case 'm':
                System.out.println("Multiplicação = " + (a*b));
                break;
            case 'D':
            case 'd':
                System.out.println("Divisão = " + (a/b));
                break;
                
            default:
                    System.out.println("A operação "+ operacao + "não é válida");    
        }
        
        
    }
    
}
