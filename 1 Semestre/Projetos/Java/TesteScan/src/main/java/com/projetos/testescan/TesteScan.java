/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.projetos.testescan;

import java.util.Scanner;

/**
 *
 * @author whmar
 */
public class TesteScan {

    public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    String x;
    x = sc.next();
    System.out.println("você disse " + x);
    int y;
    y = sc.nextInt();
    System.out.println("seu número é " + y);
    double z;
    z = sc.nextDouble();
    System.out.println("seu número é " + z);
    char w;
    w = sc.next().charAt(0);
    System.out.println("sua letra é " + w);
    
    }
}
