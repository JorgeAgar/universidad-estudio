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
public class Capicua5Cifras {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        /*
        String snumero;
        
        do{
            System.out.println("Ingrese un número entero de 5 cifras");
            int numero = scanner.nextInt();
            snumero = Integer.toString(numero); //numero como string en snumero
        } while(snumero.length() != 5);
        
        StringBuilder sbnumero = new StringBuilder(snumero); //sbnumero es snumero pero como StringBuilder
        StringBuilder reverso = sbnumero.reverse(); //reverso es un StringBuilder que es el reverso de sbnumero
        String snumeroReverso = reverso.toString(); //snumeroReverso es reverso en string
        
        System.out.println("El inverso del número ingresado es " + snumeroReverso);
        */
        
        int numero;
        do{
            System.out.println("Ingrese un número de 5 dígitos");
            numero = scanner.nextInt();
        } while(numero < 10000 || numero > 99999);
        
        int reverso=0;
        for(int i = 1; i <= 5; i++){
            reverso *= 10;
            reverso += numero % 10;
            numero /= 10;
        }
        
        System.out.println("El reverso del número ingresado es " + reverso);
    }
    
}
