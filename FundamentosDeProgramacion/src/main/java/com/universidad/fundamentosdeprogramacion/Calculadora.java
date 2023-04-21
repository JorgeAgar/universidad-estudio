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
public class Calculadora {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int operacion;
        
        System.out.println("Ingrese el 1er número");
        int num1 = scanner.nextInt();
        System.out.println("Ingrese el 2do número");
        int num2 = scanner.nextInt();
        do{
            System.out.println("Ingrese la operación a realizar:\n1 para suma, 2 para resta, 3 para multiplicacion y 4 para division");
            operacion = scanner.nextInt();
        } while(operacion < 1 || operacion > 4);
        
        switch(operacion){
            case 1:
                System.out.println("La suma de los 2 números es " + (num1+num2));
                break;
            case 2:
                System.out.println("La resta de los 2 números es " + (num1-num2));
                break;
            case 3:
                System.out.println("El producto de los 2 números es " + (num1*num2));
                break;
            case 4:
                double cociente = (double)num1/num2;
                System.out.println("El cociente de los 2 números es " + cociente);
                break;
        }
    }
}
