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
public class Matrices {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[][] matriz = new int[6][4];
        
        double media = 0;
        
        int maxDigitos = 0; //para el printf abajo
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.println("Ingrese un valor para la casilla " + (i+1) + "," + (j+1));
                matriz[i][j] = sc.nextInt();
                media += matriz[i][j];
                maxDigitos = Integer.toString(matriz[i][j]).length() > maxDigitos ? Integer.toString(matriz[i][j]).length() : maxDigitos;
            }
        }
        
        media /= (matriz.length*matriz[0].length); //calcular la media
        
        System.out.println("=============================================================");
        int fila, columna;
        do{
            System.out.println("Ingrese que fila desea sumar:");
            fila = sc.nextInt();
        } while(fila <= 0 || fila > matriz.length);
        do{
            System.out.println("Ingrese que columna desea sumar:");
            columna = sc.nextInt();
        } while(columna <= 0 || columna > matriz[0].length);
        
        //imprimir la matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("[%" + maxDigitos + "d]", matriz[i][j]);
            }
            System.out.println("");
        }
        
        System.out.println("");
        System.out.println("La suma de la fila " + fila + " es " + sumarFila(matriz, (fila-1)));
        System.out.println("La suma de la columna " + columna + " es " + sumarColumna(matriz, (columna-1)));
        System.out.println("La suma del borde es " + sumarBorde(matriz));
        System.out.println("La media de todos los valores de la matriz es " + media);
    }
    
    public static int sumarFila(int[][] matriz, int fila){
        int suma=0;
        for (int i : matriz[fila]){
            suma += i;
        }
        return suma;
    }
    
    public static int sumarColumna(int[][] matriz, int columna){
        int suma=0;
        for(int[] i : matriz){
            suma += i[columna];
        }
        return suma;
    }
    
    public static int sumarBorde(int[][] matriz){
        int suma=0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if(i==0 || i==(matriz.length-1) || j==0 || j==(matriz[i].length-1)){
                    suma += matriz[i][j];
                }
            }
        }
        return suma;
    }
}
