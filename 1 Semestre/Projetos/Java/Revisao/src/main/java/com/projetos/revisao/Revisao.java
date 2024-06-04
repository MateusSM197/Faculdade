/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.projetos.revisao;
import java.util.Scanner;
/**
 *
 * @author whmar
 */
public class Revisao {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double despesaFixa, despesaExtra;
        System.out.println("Digite o valor da dispesa fixa");
        despesaFixa = scan.nextDouble();
        System.out.println("Digite agora o valor da dispesa extra");
        despesaExtra = scan.nextDouble();
        int numeroPessoasFamilia;
        System.out.print("Digite o número de pessoas da familia: "); 
        numeroPessoasFamilia = scan.nextInt(); 
        for (int i = 0; i < numeroPessoasFamilia; i++) {  
        double mediaGastoFixa = despesaFixa/numeroPessoasFamilia;
        System.out.println("A média de gasto fixo é " + mediaGastoFixa);

} 
        for (int i = 0; i < numeroPessoasFamilia; i++) {  
        double mediaGastoExtra = despesaFixa/numeroPessoasFamilia;
        System.out.println("A média de gasto extra é " + mediaGastoExtra);
        }
    }
}

