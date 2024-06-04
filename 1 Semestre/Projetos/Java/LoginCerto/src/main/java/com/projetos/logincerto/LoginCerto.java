/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.projetos.logincerto;

/**
 *
 * @author whmar
 */
import javax.swing.JOptionPane;

public class LoginCerto {

    //Vou falar de novo por precaução, meu nome no teams está errado, é Mateus Simões Marques, mas o RA está certo
    public static void main(String[] args) {
        
    String user, login, passw;
    double password, usuario, senha;
    
    user = "Mateus";
    password = 12345;
    
    login = JOptionPane.showInputDialog(null, "login:");
    passw = JOptionPane.showInputDialog(null, "Senha:");
    senha = Double.parseDouble(passw);
    
    if(login.equals(user) && senha == password){
        JOptionPane.showMessageDialog(null, "Bem vindo");
    }
    else{
        JOptionPane.showMessageDialog(null, " Sua senha ou usurário está incorreta");
    }
    }   
        
    }

