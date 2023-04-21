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
public class Serie20Pares {

    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        
        int numero;
        do{
            System.out.println("Ingrese un número entero impar");
            numero = scanner.nextInt();
        }while(numero % 2 == 0);
        
        numero++;
        for(int i = 1; i <= 20; i++){
            System.out.print(numero + ", ");
            numero += 2;
        }
    }
}