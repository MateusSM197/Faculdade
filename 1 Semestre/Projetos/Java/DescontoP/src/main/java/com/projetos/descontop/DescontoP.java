/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.projetos.descontop;

/**
 *
 * @author whmar
 */
import javax.swing.JOptionPane;

public class DescontoP {

    public static void main(String[] args) {
   
    String preco;
    double precoP;
    
    preco = JOptionPane.showInputDialog(null, "Escreva o preço do produto");
    precoP = Double.parseDouble(preco);
    
    if(precoP> 10000){
        double desconto1;
        desconto1 = precoP*0.6;
        JOptionPane.showMessageDialog(null, " o seu preço é " + desconto1);
        }
    else if(precoP<= 10000 && precoP>5000){
        double desconto2;
        desconto2 = precoP*0.8;
          JOptionPane.showMessageDialog(null, " o seu preço é " + desconto2);
    }
    else if(precoP<=5000 && precoP>2500){
        double desconto3;
        desconto3 = precoP*0.9;
          JOptionPane.showMessageDialog(null, " o seu preço é " + desconto3);
    }
    else{
        double desconto4;
        desconto4 = precoP*0.95;
          JOptionPane.showMessageDialog(null, " o seu preço é " + desconto4);
    }
        
    
    
    
        
        
    }
}
