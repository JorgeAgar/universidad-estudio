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
public class NumeroPrimo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese el número a verificar");
        int numero = scanner.nextInt();
        
        boolean primo = true;
        
        for(int i = 2; i < numero; i++){
            if(numero % i == 0){
                primo = false;
            }
        }
        if(primo){
            System.out.println("El número es primo");
        } else{
            System.out.println("El número es compuesto");
        }
    }
}