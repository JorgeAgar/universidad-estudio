/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.dado;

/**
 *
 * @author Jorge
 */
import java.util.Random;
import java.util.Scanner;
public class Dado {
    public static void main(String[] args){
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        
        byte seguir = 1;
        
        while(seguir == 1){
            System.out.println("Cayó " + (random.nextInt(6)+1));
            
            do{
                System.out.println("¿Desea continuar?\n1. Sí     2. No");
                seguir = scanner.nextByte(); 
            } while(seguir < 1 || seguir > 2);
        }
    }
}
