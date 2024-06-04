/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.projetos.aula7;

/**
 *
 * @author whmar
 */
public class Aula7 {

    public static void main(String[] args) {
            Aluno aluno1 = new Aluno();
        Aluno aluno2 = new Aluno();
        
        aluno1.setNome("Ana");
        aluno1.setN1(10);
        aluno1.setN2(9);
        System.out.println("A média de "+aluno1.getNome()+" é: "+aluno1.media());
        
        aluno2.setNome("Beto");
        aluno2.setN1(9);
        aluno2.setN2(10);
        System.out.println("A média de "+aluno2.getNome()+" é: "+aluno2.media());
    }
}

    
