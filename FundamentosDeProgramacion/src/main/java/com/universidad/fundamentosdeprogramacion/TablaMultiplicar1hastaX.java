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
public class TablaMultiplicar1hastaX {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese un número entero positivo");
        int numero = scanner.nextInt();
        
        for(int i = 1; i <= numero; i++){
            System.out.println(numero + " x " + i + " = " + i*numero);
        }
    }
}