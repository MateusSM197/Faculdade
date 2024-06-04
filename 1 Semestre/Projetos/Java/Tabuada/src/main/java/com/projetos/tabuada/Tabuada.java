/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.projetos.tabuada;

/**
 *
 * @author whmar
 */
import java.util.Scanner;

public class Tabuada {

    public static void main(String[] args) {
       
int i, resp, number;
Scanner ler = new Scanner(System.in);

System.out.println("Escolha o valor do número");
number = ler.nextInt();

for (i = 5; i <=10; i++ ){

resp = i*number;
System.out.println( " a sua tabuada é " +resp);
}
}
}
    

