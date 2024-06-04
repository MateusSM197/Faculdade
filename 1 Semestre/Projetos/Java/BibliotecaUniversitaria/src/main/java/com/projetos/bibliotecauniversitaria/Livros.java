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

public class Livros {
    Scanner scan = new Scanner(System.in);
    String nomeLivro, tipoLivro, tipoMaterial, idioma, autor, nacionalidadeAutor, editora, anoEdicao, livroSolicitado;
    int historicoEmprestimo = 0;
    boolean solicitoEmprestimo = false;
    
    void CadastroLivro(){
        System.out.println("______________________________");
        System.out.println("Ola! Bem-vindo ao cadastro de livros! Insira os seguintes dados: ");
        System.out.println("Nome do livro: ");
        nomeLivro = scan.next();
        System.out.println("Midia fisica ou virtual: ");
        tipoLivro = scan.next();
        System.out.println("Material do livro (genero ou conteudo):");
        tipoMaterial = scan.nextLine();
        System.out.println("Idioma: ");
        idioma = scan.next();
        System.out.println("Autor: ");
        autor = scan.next();
        System.out.println("Naconalidade do autor: ");
        nacionalidadeAutor = scan.next();
        System.out.println("Editora do livro: ");
        editora = scan.next();
        System.out.println("Ano da edicao: ");
        anoEdicao = scan.next();
        
        ExibirLivro();
    }
    
    void ExibirLivro(){
        System.out.println("______________________________");
        System.out.println("Ola! Bem-vindo a exibicao de livros! Os dados presente no sistema são: ");
        System.out.println("Nome do livro: " +nomeLivro);
        System.out.println("Midia fisica ou virtual: "+tipoLivro);
        System.out.println("Material do livro (genero ou conteudo):" +tipoMaterial);
        System.out.println("Idioma: " +idioma);
        System.out.println("Autor: " +autor);
        System.out.println("Naconalidade do autor: " +nacionalidadeAutor);
        System.out.println("Editora do livro: " +editora);
        System.out.println("Ano da edicao: " +anoEdicao);
        System.out.println("Essse livro ja foi emprestado para "+historicoEmprestimo+" pessoas.");
    }
    
    void SolicitarEmprestimo(){
        if(solicitoEmprestimo == true){
        System.out.println("______________________________");
        System.out.println("Livros disponiveis para emprestimo: ");
        System.out.println(nomeLivro);
        System.out.println("\nDigite o nome do livro que deseja solicitar o emprestimo: ");
        livroSolicitado = scan.next();
        if(livroSolicitado.equals(nomeLivro)){
            System.out.println("Solicitacao enviada! Retire-o na biblioteca. Voce tem 15 dias até ter que devolve-lo, apos a retirada.");
            historicoEmprestimo =+ historicoEmprestimo;
            }
        solicitoEmprestimo = false;
        }
    }
}

