/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.projetos.contabancaria;

/**
 *
 * @author whmar
 */
public class ContaBancaria {

    public static void main(String[] args) {
      
       conta conta1 = new conta(); 
        
     conta1.NumeroConta = 1344556;
     conta1.limite = 32000;
     conta1.saldo = 9500;
        
     
     conta1.saque();
     conta1.deposito();
     conta1.counsultaSaldo();
    }
}
