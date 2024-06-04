/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.projetos.contabancaria;

/**
 *
 * @author whmar
 */
public class conta {
    
    int NumeroConta, saldo, limite;
    
    public void deposito(){
        int dep;
        dep = 8000;
        System.out.println("você depositou " + dep);
    }
    
    public void saque(){
        int saq;
        saq = 5000;
        System.out.println("você sacou " + saq);
    }
    public void counsultaSaldo(){
        double consSaldo;
        consSaldo = saldo; 
        System.out.println("o seu saldo atual é " + consSaldo);
    }
        
}
