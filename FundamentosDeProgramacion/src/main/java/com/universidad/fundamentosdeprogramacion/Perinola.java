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

public class Perinola {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String  snumPerinola = "";
        int numPerinola = 0;
        byte i;
        byte cantidadEstudiantes = 18;
        for(i = 1; i <= cantidadEstudiantes; i++){
            do{
                System.out.println("Estudiante " + i + ", Ingrese un número entero entre 1 y 6");
                snumPerinola = entrada.nextLine();
                if(snumPerinola.matches("\\d{1,2}")){
                   numPerinola = Integer.parseInt(snumPerinola);
                }
            } while(numPerinola < 1 || numPerinola > 6);
            switch(numPerinola){
                case 1: System.out.println("Pon 1");
                        break;
                case 2: System.out.println("Pon 2");
                        break;
                case 3: System.out.println("Toma 1");
                        break;
                case 4: System.out.println("Toma 2");
                        break;
                case 5: System.out.println("Pone todo");
                        break;
                case 6: System.out.println("Toma todo");
                        break;
                default: System.out.println("Opción inválida");
                         break;
            }
            numPerinola = 0;
        }
    }
}