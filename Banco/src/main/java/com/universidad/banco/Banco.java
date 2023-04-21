/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.universidad.banco;

/**
 *
 * @author Jorge
 */
import java.util.Scanner;
public class Banco {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        String opcion = "";
        int cantidad = 0;
        boolean salir = false;
        int saldo = 0;
        
        Cuenta usuario1 = new Cuenta("hola", "Jorge");
       
        do{
            usuario1.mostrarMenu();
            opcion = entrada.nextLine();
            switch(opcion){
                case "A": System.out.println("Ingrese la cantidad de dinero a retirar");
                          cantidad = entrada.nextInt();
                          usuario1.retirarDinero(cantidad);
                          break;
                case "B": System.out.println("Ingrese la cantidad a depositar");
                          cantidad = entrada.nextInt();
                          usuario1.agregarDinero(cantidad);
                          break;
                case "C": saldo = usuario1.consultarSaldo();
                          System.out.println("Su saldo es " + saldo);
                          break;
                case "D": System.out.println("Su última transacción fue " + usuario1.ultimaTransaccion + usuario1.ultimoMovimiento);
                          break;
                case "E": System.out.println("Gracias por usar nuestros servicios");
                          salir = true;
                          break;
                default: System.out.println("Opción inválida, por favor intente nuevamente");
                         System.out.println("\n");
                         break;
            }
        } while(salir == false);
    }
}