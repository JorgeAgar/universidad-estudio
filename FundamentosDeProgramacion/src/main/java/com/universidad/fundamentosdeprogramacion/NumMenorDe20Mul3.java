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
public class NumMenorDe20Mul3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese 20 números enteros");
        int num = sc.nextInt();
        
        for(int i = 1; i <= 19; i++){
            int entrada = sc.nextInt();
            if(entrada < num){
                num = entrada;
            }
        }
        if(num % 3 == 0){
            System.out.println("El menor de los números ingresados es " + num + ", y si es múltiplo de 3");
        } else{
            System.out.println("El menor de los números ingresados es " + num + ", y no es múltiplo de 3");
        }
    }
    
}
