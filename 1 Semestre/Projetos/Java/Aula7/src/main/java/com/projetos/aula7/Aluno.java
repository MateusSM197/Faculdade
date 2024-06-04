/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.projetos.aula7;

/**
 *
 * @author whmar
 */
public class Aluno {
        private String nome;
    private double n1, n2;
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getN1() {
        return n1;
    }
    public void setN1(int n1) {
        this.n1 = n1;
    }
    public double getN2() {
        return n2;
    }
    public void setN2(int n2) {
        this.n2 = n2;
    }
    
    public double media(){
        return (getN1() + getN2()) / 2;
    }
}


