/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.projetos.q2;
import java.util.Scanner;
/**
 *
 * @author whmar
 */
public class Q2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //criando e declarando as variáveis:
        int numeroFatorial, resultado = 1;
        System.out.println("BEM VINDO A CALCULADORA DE FATORIAL");
        //pedindo o número para o usuário:
        System.out.println("Por favor insira o valor de um número inteiro e não negativo:");
        numeroFatorial = scan.nextInt();
        //caso o usuário não coloque um número inteiro ou um número negativo, o programa irá pedir para ele colocar outro número
         while (numeroFatorial < 0) {
         System.out.println("Insira um valor inteiro e positivo");  
         numeroFatorial = scan.nextInt();
         }
        //calculando o fatorial:
        for(int i = 1; i <= numeroFatorial; i++) {    
            resultado *= i;          
      }
        //resultado do fatorial:
        System.out.println("o fatorial do número é: " + resultado);   
  }
}


        
        
   
