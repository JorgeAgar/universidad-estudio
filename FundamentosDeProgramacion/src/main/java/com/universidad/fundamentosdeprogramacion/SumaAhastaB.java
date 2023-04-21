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
public class SumaAhastaB {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        long resultado = 0L;
        long numA;
        long numB;
        
        System.out.println("Ingrese el 1er número");
        long num_A = scanner.nextLong();
        System.out.println("Ingrese el 2do número");
        long num_B = scanner.nextLong();
        
        if(num_A < num_B){
            numA = num_A;
            numB = num_B;
        } else{
            numB = num_A;
            numA = num_B;
        }
        
        for(long i = numA; i <= numB; i++){
            resultado = resultado + i;
        }
        System.out.println(resultado);
    }
}