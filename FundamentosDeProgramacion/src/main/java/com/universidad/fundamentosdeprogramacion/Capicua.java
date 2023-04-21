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
public class Capicua {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese un número entero");
        long numero = scanner.nextLong();
        String snumero = Long.toString(numero); //numero como string en snumero
        StringBuilder sbnumero = new StringBuilder(snumero); //sbnumero es snumero pero como StringBuilder
        StringBuilder reverso = sbnumero.reverse(); //reverso es un StringBuilder que es el reverso de sbnumero
        String snumeroReverso = reverso.toString(); //snumeroReverso es reverso en string
        
        if(snumero.equals(snumeroReverso)){
            System.out.println("Sí es capicúa");
        } else{
            System.out.println("No es capicúa");
        }
        
    }
}
