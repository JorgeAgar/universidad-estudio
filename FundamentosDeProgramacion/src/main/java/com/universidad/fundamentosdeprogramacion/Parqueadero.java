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
public class Parqueadero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        boolean finJornada = false;
        int contadorCarros = 0, contadorMotos = 0;
        int ingresoMotos = 0, ingresoCarros = 0, vehiculosCucuta = 0;
        int carrosRojos = 0, carrosAzules = 0, carrosVerdes = 0;
        int fecha,dia,mes,ano;
        
        int tipoVehiculo;
        
        while(!finJornada){
            do{
                System.out.println("Ingrese la fecha en formato DDMMAAAA");
                fecha = sc.nextInt();
                ano = fecha%10000;
                dia = fecha/1000000;
                mes = (fecha/10000)%100;
            }while(dia>30 || mes>12 || dia<0);
            
            System.out.println("Ingrese tipo de vehiculo: 2 para carro y 1 para moto");
            tipoVehiculo = sc.nextInt();
            sc.nextLine();
            System.out.println("Ingrese su nombre");
            sc.nextLine();
            System.out.println("Ingrese su cedula");
            sc.nextLine();
            System.out.println("Ingrese el número de placa");
            sc.nextLine();
            System.out.println("Ingrese el color de su vehiculo");
            System.out.println("1. Rojo 2. Verde 3. Azul 4. Blanco 5. Plata 6. Negro 7. Vinotinto");
            int colorVehiculo = sc.nextInt();
            sc.nextLine();
            System.out.println("Ingrese el lugar de registro de la matrícula del vehículo");
            System.out.println("1. Cucuta 2. Villa del Rosario 3. Pamplona 4. Bogota 5. Bucaramanga");
            int lugarRegistro = sc.nextInt();
            System.out.println("Ingrese las horas que va a dejar el vehículo haciendo estorbo en mi parqueadero");
            int horas = sc.nextInt();
            
            if(tipoVehiculo == 1){
                System.out.println("Motocicleta");
                System.out.println("Precio: $" + horas*2100); //descuento del 30%
                contadorMotos++;
                ingresoMotos += horas*2100;
            } else if(tipoVehiculo == 2){
                System.out.println("Automóvil");
                System.out.println("Precio: $" + horas*3000);
                contadorCarros++;
                ingresoCarros += horas*3000;
                switch(colorVehiculo){
                    case 1:
                        carrosRojos++;
                        break;
                    case 2:
                        carrosVerdes++;
                        break;
                    case 3:
                        carrosAzules++;
                        break;
                }
            } else{
                System.out.println("Tipo de vehículo incorrecto");
            }
            if(lugarRegistro == 1){
                vehiculosCucuta++;
            }
            System.out.println("");
            System.out.println("============================================================================================================");
            System.out.println("");    
            int opcion;
            do{
                System.out.println("");
                System.out.println("Ingrese 1 para ingresar otro vehiculo o 2 para finalizar la jornada laboral");
                opcion = sc.nextInt();
            }while(opcion < 1 || opcion > 2);
            if(opcion == 2){
                finJornada = true;
            }
            System.out.println("");
            System.out.println("============================================================================================================");
            System.out.println("");    
        }
        
        System.out.println("La cantidad de carros que ingresaron es " + contadorCarros);
        System.out.println("La cantidad de motos que ingresaron es " + contadorMotos);
        System.out.println("La cantidad de carros rojos que ingresaron es " + carrosRojos);
        System.out.println("La cantidad de carros azules que ingresaron es " + carrosAzules);
        System.out.println("La cantidad de carros verdes que ingresaron es " + carrosVerdes);
        System.out.println("La cantidad de vehiculos registrados en Cucuta es " + vehiculosCucuta);
        System.out.println("El dinero recaudado de carros es " + ingresoCarros);
        System.out.println("El dinero recaudado de motos es " + ingresoMotos);
        System.out.println("El dinero total recaudado es " + (ingresoCarros+ingresoMotos));
        
    }
    
}
