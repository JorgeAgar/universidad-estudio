/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.universidad.fundamentosdeprogramacion;

/**
 *
 * @author Jorge
 */
import java.util.Scanner;
public class Multiplicacion {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese el 1er número");
        int num1 = scanner.nextInt();
        System.out.println("Ingrese el 2do número");
        int num2 = scanner.nextInt();
        
        System.out.println("El producto de los 2 números es " + (num1*num2));
    }
}