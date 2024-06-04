/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.projetos.bibliotecauniversitaria;

/**
 *
 * @author whmar
 */

    
    import java.util.Scanner;

public class Usuario {

    Livros book = new Livros();
    Scanner scan = new Scanner(System.in);
    String tipoUsuario, nome, endereco, departamento;
    int ra, userSelection;

    void CadastroUser() {
        System.out.println("Ola! Bem-vindo a Biblioteca da USJT. Qual seu tipo de usuario (aluno, professor ou funcioario)?");
        tipoUsuario = scan.next();
        if (tipoUsuario.equals("aluno")) {
            System.out.println("Digite o seu nome: ");
            nome = scan.next();
            System.out.println("Digite o seu ra: ");
            ra = scan.nextInt();
            System.out.println("Digite o seu endereco: ");
            endereco = scan.nextLine();
            System.out.println("Cadastro concluido. Bem-vindo!");
        } else if (tipoUsuario.equals("professor")) {
            System.out.println("Digite o seu nome: ");
            nome = scan.next();
            System.out.println("Digite o seu departamento: ");
            departamento = scan.next();
            System.out.println("Digite o seu endereco: ");
            endereco = scan.nextLine();
            System.out.println("Cadastro concluido. Bem-vindo!");
        } else if (tipoUsuario.equals("funcionario")) {
            System.out.println("Digite o seu nome: ");
            nome = scan.next();
            System.out.println("Digite o seu departamento: ");
            departamento = scan.next();
            System.out.println("Digite o seu endereco: ");
            endereco = scan.nextLine();
            System.out.println("Cadastro concluido. Bem-vindo!");
        }
    }
    
    void UserSelection(){
        System.out.println("Você deseja solicitar o emprestimo de um livro ou ver os livros disponiveis?");
        System.out.println("1 - Solicitar emprestimo. / 2 - Ver livros disponiveis.");
        userSelection = scan.nextInt();
        
        switch(userSelection){
            case 1:
                book.solicitoEmprestimo = true;
                book.SolicitarEmprestimo();
                break;
                
            case 2:
                book.ExibirLivro();
                break;
        }
    }
}

