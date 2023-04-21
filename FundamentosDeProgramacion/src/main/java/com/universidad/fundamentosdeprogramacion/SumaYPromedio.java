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
public class SumaYPromedio {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double suma = 0;
        
        for(int i = 1; i <= 10; i++){
            System.out.println("Ingrese un número");
            suma += scanner.nextInt();
        }
        System.out.println("La suma de los números ingresados es " + suma + ", y su promedio es " + suma/10);
    }
}