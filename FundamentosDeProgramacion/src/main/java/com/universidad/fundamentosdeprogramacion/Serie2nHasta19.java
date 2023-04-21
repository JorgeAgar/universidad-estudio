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
public class Serie2nHasta19 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int suma = 0, producto = 1;
        
        int numero;
        do{
            System.out.println("Ingrese un número entero impar entre 1 y 19");
            numero = scanner.nextInt();
        }while(numero<1 || numero>19 || (numero%2)==0);
        
        for(int i = 1; i <= numero; i+=2){
            suma += i;
            producto *= i;
        }
        System.out.println("Suma " + suma + ", Producto " + producto);
    }
}