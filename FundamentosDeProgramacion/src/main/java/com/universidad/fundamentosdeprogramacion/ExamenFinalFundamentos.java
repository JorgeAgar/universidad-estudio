/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.universidad.fundamentosdeprogramacion;

/**
 *
 * @author Jorge Andrés Reyes Serrano 1152355
 */
import java.util.Scanner;
public class ExamenFinalFundamentos {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        final int PREVIO_1 = 0, PREVIO_2 = 1, QUIZ_1 = 2, QUIZ_2 = 3, TALLER_INDIVIDUAL = 4, TALLER_GRUPAL = 5, EXAMEN_FINAL = 6;
        double[][] calificaciones = new double[5][7];
        double[] definitivas = new double[5];
        
        for(int i = 0; i < calificaciones.length; i++){
            for(int j = 0; j < calificaciones[i].length; j++){
                double nota;
                do{ //pedir las notas
                    System.out.println("Ingrese la nota de la casilla " + i + "," + j);
                    nota = sc.nextDouble();
                    if(nota < 1 || nota > 5){
                        System.out.println("Error: La nota debe ser entre 1.0 y 5.0");
                    } else{
                        calificaciones[i][j] = nota;
                    }
                } while(nota < 1 || nota > 5);
            }
            //calcular las definitivas
            double previo3 = (calificaciones[i][QUIZ_1] + calificaciones[i][QUIZ_2] + calificaciones[i][TALLER_INDIVIDUAL] + calificaciones[i][TALLER_GRUPAL]) / 4;
            definitivas[i] = ((calificaciones[i][PREVIO_1] + calificaciones[i][PREVIO_2] + previo3)/3.0 * 0.7) + (calificaciones[i][EXAMEN_FINAL]*0.3);
        }
        
        //calcular calificacion mas alta y mas baja
        double notaMax=0, notaMin=5.0;
        for(int i = 0; i < definitivas.length; i++){
            notaMax = definitivas[i] > notaMax ? definitivas[i] : notaMax;
            notaMin = definitivas[i] < notaMin ? definitivas[i] : notaMin;
        }
        sc.nextLine(); //arreglando lo del nextDouble()
        
        System.out.println("====================================================================");
        System.out.printf("La nota definitiva más alta fué %.2f", notaMax);
        System.out.println("");
        System.out.printf("La nota definitiva más baja fué %.2f", notaMin);
        System.out.println("");
        System.out.println("====================================================================");
        
        boolean continuar = true;
        do{
            int opcion;
            do{
                System.out.println("Ingrese 1.Si desea consultar una nota  2.Si desea salir");
                opcion = sc.nextInt();
                if(opcion < 1 || opcion > 2){
                    System.out.println("Opción inválida");
                }
            } while(opcion < 1 || opcion > 2);
            if(opcion == 2){
                continuar = false;
            } else{
                int columna, fila;
                do{
                    System.out.println("Ingrese la fila de la nota a consultar");
                    fila = sc.nextInt();
                } while(fila < 0 || fila > calificaciones.length);
                do{
                    System.out.println("Ingrese la columna de la nota a consultar");
                    columna = sc.nextInt();
                } while(columna < 0 || columna > calificaciones[fila].length);
                
                System.out.println("La nota de la casilla " + fila + "," + columna + " es " + calificaciones[fila][columna]);
            }
        } while(continuar);
    }
    
}
