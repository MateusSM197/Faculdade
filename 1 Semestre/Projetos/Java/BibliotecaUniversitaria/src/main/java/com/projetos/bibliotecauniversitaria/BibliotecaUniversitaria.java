/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.projetos.bibliotecauniversitaria;

/**
 *
 * @author whmar
 */
public class BibliotecaUniversitaria {

    public static void main(String[] args) {
         Usuario user = new Usuario();
        Livros book = new Livros();
        
        user.CadastroUser();
        if(user.tipoUsuario.equals("funcionario")){
            book.CadastroLivro();
        }
        else if (user.tipoUsuario.equals("professor") || user.tipoUsuario.equals("aluno")){
            user.UserSelection();
        }
    }
}
    

