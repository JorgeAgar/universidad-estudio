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
public class Multiplos8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de múltiplos de 8 a imprimir");
        int cantidad = scanner.nextInt();
        
        for(int i = 1; i <= cantidad; i++){
            System.out.println("8 x " + i + " = " + i*8);
        }
    }
}