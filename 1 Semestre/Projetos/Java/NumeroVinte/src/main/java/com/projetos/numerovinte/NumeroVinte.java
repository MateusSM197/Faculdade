/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.projetos.numerovinte;

/**
 *
 * @author whmar
 */
import javax.swing.JOptionPane;
public class NumeroVinte {

    public static void main(String[] args){
        int n1 = Integer.parseInt(JOptionPane.showInputDialog(null, "digite o seu número:"));
        if(n1 > 20){
            JOptionPane.showMessageDialog(null, "Seu número é " +n1);
        }
    }
}


