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
public class Multiplos3y5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        byte multiplos3 = 0, multiplos5 = 0;
        
        for(int i = 1; i <= 10; i++){
            System.out.println("Ingrese un número entero");
            int numero = scanner.nextInt();
            
            if((numero % 3 == 0) && (numero != 0)){
                multiplos3 += 1;
            }
            if((numero % 5 == 0) && (numero != 0)){
                multiplos5 += 1;
            }
        }
        System.out.println("Múltiplos de 3: " + multiplos3);
        System.out.println("Múltiplos de 5: " + multiplos5);
    }
}