/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.universidad.pruebas;

/**
 *
 * @author Jorge
 */
import java.util.Scanner;

public class Pruebas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long num = 0L;
        boolean numero;

            System.out.println("Ingrese un número no mayor a 9.223.372.036.854.775.807");
            numero = scanner.hasNextLong();
            if(numero){
                num = scanner.nextLong();
            }
            scanner.close();
            System.out.println(num);
            
            String smenos1 = "-1";
            int menos1 = Integer.parseInt(smenos1);
            System.out.println(menos1);
        }
    }

