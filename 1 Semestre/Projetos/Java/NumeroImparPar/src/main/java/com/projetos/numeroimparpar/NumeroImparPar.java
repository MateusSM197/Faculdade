/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.projetos.numeroimparpar;

/**
 *
 * @author whmar
 */

import javax.swing.JOptionPane;
public class NumeroImparPar {

     public static void main(String[] args){
    int n = Integer.parseInt(JOptionPane.showInputDialog(null, " Digite o número "));
    int resultado = n % 2;
    
    if (resultado == 0){
        JOptionPane.showMessageDialog(null, "seu número é par");
    }
    else {
    JOptionPane.showMessageDialog(null, "seu número é ímpar");
    }
}
}

