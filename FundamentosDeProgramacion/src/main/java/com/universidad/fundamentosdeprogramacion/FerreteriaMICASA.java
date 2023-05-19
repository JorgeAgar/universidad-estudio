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
public class FerreteriaMICASA {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("¿Cuántas secciones desea hacer?");
        int cantidadSecciones = sc.nextInt();
        sc.nextLine();

        int[] unidadesXSeccion = new int[cantidadSecciones];
        int[] productosXSeccion = new int[cantidadSecciones];
        int[] precioStockXSeccion = new int[cantidadSecciones];

        for (int i = 1; i <= cantidadSecciones; i++) {
            int continuar;
            boolean continuarSeccion = true;

            int unidadesSeccion = 0, productosSeccion = 0, precioStockSeccion = 0;
            while (continuarSeccion) {

                System.out.println("Sección " + i);
                System.out.println("Ingrese el nombre del producto");
                String nombreProducto = sc.nextLine();
                System.out.println("Ingrese el precio por unidad de cada producto");
                int precioUnidad = sc.nextInt();
                System.out.println("Ingrese la cantidad de unidades a inventariar");
                int cantidadUnidades = sc.nextInt();
                sc.nextLine();

                //imprimir que producto metio
                System.out.println("======================================================");
                System.out.println("Ingresado(s) " + cantidadUnidades + " " + nombreProducto + " a $" + precioUnidad + " por unidad");
                System.out.println("El precio total de stock de este producto es de $" + (precioUnidad*cantidadUnidades));
                System.out.println("======================================================");
                //aumentar contadores "locales"
                unidadesSeccion += cantidadUnidades;
                productosSeccion++;
                precioStockSeccion += (precioUnidad*cantidadUnidades);

                do{ //pedir si meter mas productos
                    System.out.println("¿Desea ingresar más productos? 1. Si 2. No");
                    continuar = sc.nextInt();
                }while(continuar < 1 || continuar > 2);
                sc.nextLine();
                if(continuar == 1){
                    continuarSeccion = true;
                } else{
                    continuarSeccion = false;
                }
            }
            //imprimir por seccion
            System.out.println("======================================================");
            System.out.println("En esta sección se ingresaron:");
            System.out.println(productosSeccion + " productos");
            System.out.println(unidadesSeccion + " unidades");
            System.out.println("$" + precioStockSeccion + " en productos");
            System.out.println("======================================================");

            //aumentar contadores
            unidadesXSeccion[i-1] += unidadesSeccion;
            productosXSeccion[i-1] += productosSeccion;
            precioStockXSeccion[i-1] += precioStockSeccion;
        }
        int unidadesTotales=0, productosTotales=0, precioStockTotal=0;
        for(int i = 0; i < cantidadSecciones; i++){
            System.out.println("");
            System.out.println("======================================================");
            System.out.println("Sección " + (i+1) + ":");
            System.out.println(productosXSeccion[i] + " productos");
            System.out.println(unidadesXSeccion[i] + " unidades");
            System.out.println("$" + precioStockXSeccion[i] + " en productos");
            System.out.println("======================================================");
            System.out.println("");

            //aumentar acumulados
            unidadesTotales += unidadesXSeccion[i];
            productosTotales += productosXSeccion[i];
            precioStockTotal += precioStockXSeccion[i];
        }
        System.out.println("");
        System.out.println("======================================================");
        System.out.println("En total:");
        System.out.println(productosTotales + " productos totales");
        System.out.println(unidadesTotales + " unidades totales");
        System.out.println("$" + precioStockTotal + " en total en productos");
        System.out.println("======================================================");
    }
    
}
