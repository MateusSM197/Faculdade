/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.projetos.pesoideal;

/**
 *
 * @author whmar
 */

import javax.swing.JOptionPane;

public class PesoIdeal {

public static void main(String[] args) {
   
String alt;
double altura, selecionar;
      
alt = JOptionPane.showInputDialog(null, " Digite a sua altura");
altura = Double.parseDouble(alt);

String[] genero = {"Homem", "Mulher"};
selecionar = JOptionPane.showOptionDialog(null, "Selecione o seu genero", "Genero", 0, 3, null, genero, genero[0]);
if(selecionar==0){
    double contaH;
    contaH = ((72.7*altura)-58);
    JOptionPane.showMessageDialog(null, "o seu peso ideal é " + contaH);
    
}
else{
    double contaM;
    contaM = ((62.1*altura)-44.7);
    JOptionPane.showMessageDialog(null, "o seu peso ideal é " + contaM);
    
           
}

}
}


            
        
    

