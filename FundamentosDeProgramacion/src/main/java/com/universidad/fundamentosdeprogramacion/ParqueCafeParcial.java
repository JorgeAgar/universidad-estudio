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
public class ParqueCafeParcial {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int tickets=0, restricciones=0;
        
        System.out.println("Ingrese el número de atracciones mecánicas disponibles para su uso");
        int atracciones = sc.nextInt();
        System.out.println("Ingrese la cantidad de visitantes que se espera atender en el día");
        int visitantes = sc.nextInt();
        sc.nextLine();
        
        int[] numsIdentificacion = new int[visitantes];
        int[] alturaVisitantes = new int[visitantes];
        int[] edadVisitantes = new int[visitantes];
        
        for(int i = 0; i < atracciones; i++){ //datos para las atracciones
            System.out.println("==========================================");
            System.out.println("Atracción " + (i+1));
            System.out.println("==========================================");
            System.out.println("Ingrese el nombre de la atracción");
            String nombreAtraccion = sc.nextLine();
            
            int acrofobiaAtraccion;
            do{
                System.out.println("Ingrese el nivel de acrofobia de la atracción:");
                System.out.println("1.Bajo 2.Medio 3.Alto");
                acrofobiaAtraccion = sc.nextInt();
            } while(acrofobiaAtraccion < 1 || acrofobiaAtraccion > 3);
            System.out.println("Ingrese la altura mínima permitida en la atracción en cm");
            int alturaMinAtraccion = sc.nextInt();
            
            for(int j = 0; j < visitantes; j++){ //visitantes
                //pedir datos visitante
                if(i==0){
                    System.out.println("============================================");
                    System.out.println("Visitante " + (j+1));
                    System.out.println("============================================");
                    System.out.println("Ingrese su número de identificación");
                    numsIdentificacion[j] = sc.nextInt();
                    System.out.println("Ingrese su altura en cm");
                    alturaVisitantes[j] = sc.nextInt();
                    System.out.println("Ingrese su edad");
                    edadVisitantes[j] = sc.nextInt();
                }

                //verificar restricciones
                boolean permitido = true;
                if(alturaVisitantes[j] < alturaMinAtraccion){
                    permitido = false;
                }
                if((acrofobiaAtraccion == 3) && (edadVisitantes[j] < 18 || edadVisitantes[j] > 40)){
                    permitido = false;
                }
                
                //imprimir visitante
                if(permitido){
                    System.out.println("---------------------------------------------------------------");
                    System.out.println("# identificación " + numsIdentificacion[j]);
                    System.out.println("Bienvenido al Parque del Cafe, atracción " + nombreAtraccion);
                    System.out.println("ticket #" + (j+1));
                    System.out.println("---------------------------------------------------------------");
                    
                    tickets++; //aumentar contador de tickets entregados
                } else{
                    System.out.println("---------------------------------------------------------------");
                    System.out.println("Estimado cliente, usted no cumple con los requisitos para esta atracción");
                    System.out.println("---------------------------------------------------------------");
                    
                    restricciones++; //aumentar contador de restricciones
                }
            }
            sc.nextLine();
        }
        
        System.out.println("");
        System.out.println("=================================================================================");
        System.out.println("Fin jornada laboral");
        System.out.println("=================================================================================");
        System.out.println("Tickets entregados: " + tickets);
        System.out.println("Personas restringidas para el ingreso a las atracciones " + restricciones);
    }
    
}
