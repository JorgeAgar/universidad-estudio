/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.universidad.fundamentosdeprogramacion;

/**
 *
 * @author jorge
 */
import javax.swing.*;
public class SupermercadoJM {
    
    public static void main(String[] args) {
        String[][] productos = new String[100][3];
        final int NOMBRE = 0, PRECIO_UNITARIO = 1, CANTIDAD = 2;
        
        boolean continuarJornada = true;
        int productoActual = 0, unidadesIngresadas=0, dineroTotal=0;
        
        while(continuarJornada && productoActual <= 100){
            //pedir opcion
            int opcion;
            do{
                opcion = Integer.parseInt(JOptionPane.showInputDialog("Seleccione 1 opción: \n 1. Ingresar un producto\n 2. Consultar un producto\n 3. Totalizar las ventas\n 4. Salir"));
            } while(opcion < 1 || opcion > 4);
            
            switch(opcion){
                case 1 -> { //ingresar un producto
                    //Ingresar el nombre del producto
                    productos[productoActual][NOMBRE] = JOptionPane.showInputDialog("Ingrese el nombre del producto").trim();
                    //Ingresar el precio unitario del producto
                    productos[productoActual][PRECIO_UNITARIO] = JOptionPane.showInputDialog("Ingrese el precio unitario del producto").trim();
                    //Ingresar la cantidad de elementos de este producto
                    productos[productoActual][CANTIDAD] = JOptionPane.showInputDialog("Ingrese la cantidad a ingresar de este producto").trim();
                    
                    unidadesIngresadas += Integer.parseInt(productos[productoActual][CANTIDAD]);
                    dineroTotal += Integer.parseInt(productos[productoActual][PRECIO_UNITARIO])*(Integer.parseInt(productos[productoActual][CANTIDAD]));
                    
                    productoActual++;
                }
                case 2 -> { //consultar un producto
                    String[] match = new String[100];
                    String imprimirConsulta = "";
                    int resultados=0;
                    
                    //pedir keyword a consultar
                    String keyword = JOptionPane.showInputDialog("Ingrese el producto a buscar");
                    
                    //consultar en la matriz
                    for(String[] producto : productos){
                        if(producto[NOMBRE] != null && producto[NOMBRE].toLowerCase().contains(keyword.trim().toLowerCase())){
                            match[resultados] = producto[NOMBRE];
                            resultados++;
                            
                            imprimirConsulta += resultados + ". " + match[resultados-1] + "\n";
                            
                        }
                        
                    }
                    
                    //imprimir los resultados
                    JOptionPane.showMessageDialog(null, (resultados + " resultados encontrados:\n" + imprimirConsulta));
                }
                case 3 -> { //totalizar las ventas
                    String aImprimir = "";
                    
                    aImprimir += "Total de productos ingresados: " + (productoActual) + "\n";
                    aImprimir += "Total de unidades ingresadas: " + unidadesIngresadas + "\n";
                    aImprimir += "Dinero total recaudado en ventas: $" + dineroTotal;
                    
                    JOptionPane.showMessageDialog(null, aImprimir);
                }
                case 4 -> { //salir
                    continuarJornada = false;
                }
            }
            
            //productoActual++;
        }
    }
    
}
