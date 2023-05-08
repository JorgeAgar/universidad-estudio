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
import java.util.Locale;
import java.text.NumberFormat;
public class LavaderoVehiculos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Locale us = new Locale("en", "US"); //idioma ingles estadounidense como parametro para numberformat
        NumberFormat formatoDolar = NumberFormat.getCurrencyInstance(us); //formato en dolares xq es parecido a los pesos aca en colombia
        
        boolean continuarJornada = true;
        String nombre, numIdentidad;
        int tipoVehiculo, tipoCarro=0, tipoServicio;
        int recaudadoAuto=0, recaudadoTunel=0, recaudadoEco=0;
        int cantidadMotos=0, cantidadCarros=0, cantidadCamionetas=0;
        
        //mensaje de bienvenida
        System.out.println("============================================================================");
        System.out.println("Bienvenid@ a Mi Car S.A.");
        System.out.println("Ofrecemos los siguientes servicios:");
        System.out.println("--------------------------------------------------------------------------");
        System.out.println(" 1. Lavado automático(manual) por un valor de 20mil pesos");
        System.out.println("--------------------------------------------------------------------------");
        System.out.println(" 2. Túnel de lavado(Los túneles cuentan con grandes rodillos que presionan");
        System.out.println("    y limpian el exterior de tu auto) por un valor de 25mil pesos");
        System.out.println("--------------------------------------------------------------------------");
        System.out.println(" 3. Lavado en seco o ecológico, por un valor de 30mil pesos");
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("============================================================================");
        System.out.println("");
        
        while(continuarJornada){
            System.out.println("------------------------------------------------------------------------");
            //pedir y almacenar variables
            System.out.println("Ingrese su nombre");
            nombre = sc.nextLine();
            System.out.println("Ingrese su número de identidad");
            numIdentidad = sc.nextLine();
            
            do{
                System.out.println("Ingrese el tipo de vehículo: 1.Auto 2.Moto");
                tipoVehiculo = sc.nextInt();
            }while(tipoVehiculo < 1 || tipoVehiculo > 2);
            if(tipoVehiculo == 1){
                do{
                    System.out.println("Ingrese tipo de Auto: 1.Carro 2.Camioneta");
                    tipoCarro = sc.nextInt();
                } while(tipoCarro < 1 || tipoCarro > 2);
            }
            do{
                System.out.println("Indique el tipo de servicio que desea:");
                System.out.println("1.Automático 2.Túnel 3.Ecológico");
                tipoServicio = sc.nextInt();
            } while(tipoServicio < 1 || tipoServicio > 3);
            sc.nextLine();
            
            //calcular y mostrar valor a pagar
            int valorAPagar=0;
            switch(tipoServicio){
                case 1:
                    valorAPagar = 20000;
                    break;
                case 2:
                    valorAPagar = 25000;
                    break;
                case 3:
                    valorAPagar = 30000;
                    break;
            }
            switch(tipoVehiculo){
                case 1:
                    if(tipoCarro == 2){
                        valorAPagar += valorAPagar*0.2;
                        cantidadCamionetas++;
                    } else{
                        cantidadCarros++;
                    }
                    break;
                case 2:
                    valorAPagar -= valorAPagar*0.3;
                    cantidadMotos++;
                    break;
            }
            System.out.println("---------------------------------------------");
            System.out.println(nombre);
            System.out.println(numIdentidad);
            System.out.println("");
            System.out.println("Valor a pagar " + formatoDolar.format(valorAPagar));
            System.out.println("---------------------------------------------");
            System.out.println("");
            
            //aumentarContadores
            switch(tipoServicio){
                case 1:
                    recaudadoAuto += valorAPagar;
                    break;
                case 2:
                    recaudadoTunel += valorAPagar;
                    break;
                case 3:
                    recaudadoEco += valorAPagar;
                    break;
            }
            
            //pedir continuarJornada
            int opcion;
            do{
                System.out.println("======================================================================================");
                System.out.println("Desea 1.Continuar recibiendo vehículos 2.Finalizar la jornada");
                System.out.println("======================================================================================");
                opcion = Integer.parseInt(sc.nextLine());
            } while(opcion < 1 || opcion > 2);
            if(opcion == 2){
                continuarJornada = false;
            }
        }
        //imprimir contadores
        System.out.println("================================================================");
        System.out.println("Cantidad de motos ingresadas: " + cantidadMotos);
        System.out.println("Cantidad de carros ingresados: " + cantidadCarros);
        System.out.println("Cantidad de camionetas ingresadas: " + cantidadCamionetas);
        System.out.println("Cantidad total de vehículos ingresados " + (cantidadMotos + cantidadCarros + cantidadCamionetas));
        System.out.println("");
        System.out.println("Dinero recaudado por lavados automáticos: " + formatoDolar.format(recaudadoAuto));
        System.out.println("Dinero recaudado por lavados túnel: " + formatoDolar.format(recaudadoTunel));
        System.out.println("Dinero recaudado por lavados ecológicos: " + formatoDolar.format(recaudadoEco));
        System.out.println("Dinero total recaudado en la jornada: " + formatoDolar.format(recaudadoAuto + recaudadoTunel + recaudadoEco));
    }
    
}
