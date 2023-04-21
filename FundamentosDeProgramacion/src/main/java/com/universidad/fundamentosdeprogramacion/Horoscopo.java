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
public class Horoscopo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese la fecha en formato YYYYMMDD");
        int fecha = scanner.nextInt();
        String sfecha = Integer.toString(fecha);
        
        String sano = sfecha.substring(0, 4);
        int ano = Integer.parseInt(sano);
        String smes = sfecha.substring(4, 6);
        int mes = Integer.parseInt(smes);
        String sdia = sfecha.substring(6,8);
        int dia = Integer.parseInt(sdia);
        
        boolean bisiesto = verificarBisiesto(ano);
        
        switch(mes){
            case 1:
                if(dia <= 19){
                    System.out.println("Es capricornio");
                } else if(dia <= 31){
                    System.out.println("Es acuario");
                }
                break;
            case 2:
                if(dia <= 18){
                    System.out.println("Es acuario");
                } else if(dia <= 29 && bisiesto == true){
                    System.out.println("Piscis");
                } else if(dia <= 28){
                    System.out.println("Piscis");
                }
                break;
            case 3:
                if(dia <= 20){
                    System.out.println("Piscis");
                } else if(dia <= 31){
                    System.out.println("Aries");
                }
                break;
            case 4:
                if(dia <= 19){
                    System.out.println("Aries");
                } else if(dia <= 30){
                    System.out.println("Tauro");
                }
                break;
            case 5:
                if(dia <= 20){
                    System.out.println("Tauro");
                } else if(dia <= 31){
                    System.out.println("Géminis");
                }
                break;
            case 6:
                if(dia <= 20){
                    System.out.println("Géminis");
                } else if(dia <= 30){
                    System.out.println("Cáncer");
                }
                break;
            case 7:
                if(dia <= 22){
                    System.out.println("Cáncer");
                } else if(dia <= 31){
                    System.out.println("Leo");
                }
                break;
            case 8:
                if(dia <= 22){
                    System.out.println("Leo");
                } else if(dia <= 31){
                    System.out.println("Virgo");
                }
                break;
            case 9:
                if(dia <= 22){
                    System.out.println("Virgo");
                } else if(dia <= 30){
                    System.out.println("Libra");
                }
                break;
            case 10:
                if(dia <= 22){
                    System.out.println("Libra");
                } else if(dia <= 31){
                    System.out.println("Escorpión");
                }
                break;
            case 11:
                if(dia <= 21){
                    System.out.println("Escorpión");
                } else if(dia <= 30){
                    System.out.println("Sagitario");
                }
                break;
            case 12:
                if(dia <= 21){
                    System.out.println("Sagitario");
                } else if(dia <= 31){
                    System.out.println("Capricornio");
                }
                break;
        }
    }
    public static boolean verificarBisiesto(int year){
        if(year % 4 == 0){
            if((year % 100 == 0) && !(year % 400 == 0)){
                return false;
            } else{
                return true;
            }
        } else{
            return false;
        }
    }
}