/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.universidad.fundamentosdeprogramacion;

/**
 *
 * @author jorge
 */
import java.util.Scanner;
public class NumeroImpar {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese un número entero");
        int numero = sc.nextInt();
        
        if(numero%2 != 0){
            System.out.println("El número ingresdo es impar");
        } else{
            System.out.println("El número ingresado no es impar");
        }
    }
}
