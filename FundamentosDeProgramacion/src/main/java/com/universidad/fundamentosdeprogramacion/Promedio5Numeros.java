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
public class Promedio5Numeros {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int sumatoria = 0;
        
        for(int i = 1; i <= 5; i++){
            System.out.println("Ingrese el " + i + "° número");
            sumatoria += scanner.nextInt();
        }
        
        double promedio = sumatoria/5d;
        System.out.println("El promedio es " + promedio);
    }
}