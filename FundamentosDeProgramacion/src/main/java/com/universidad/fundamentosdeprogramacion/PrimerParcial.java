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
public class PrimerParcial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sfecha;
        int fecha, dia=0, mes=0, ano=0;
        boolean esNumero = false;
        
        do{
            System.out.println("Ingrese la fecha actual en formato DDMMAAAA: ");
            sfecha = scanner.nextLine();
            if(sfecha.matches("\\d{7,8}")){
                fecha = Integer.parseInt(sfecha);
                esNumero = true;
                //como fecha es número se saca dia, mes y año
                ano = fecha%10000;
                dia = fecha/1000000;
                mes = (fecha/10000)%100;
                
                //verifica dia, mes y ano para decir si es incorrecta
                if(dia > 30 || mes > 12 || ano > 2023){
                    System.out.println("Fecha  inválida");
                }
            } else{
                System.out.println("Fecha inválida");
                fecha = 203;
                //fecha a valor inválido para que se repita
            }
            
        } while((sfecha.length() != 8) || dia < 0 || dia > 30 || mes < 0 || mes > 12 || ano < 0 || ano > 2023 || !esNumero);
        
        System.out.println("Ingrese el nombre del remitente");
        String nombreRemitente = scanner.nextLine();
        System.out.println("Ingrese el nombre del destinatario");
        String nombreDestinatario = scanner.nextLine();
        System.out.println("Ingrese el peso del paquete en Kg");
        int pesoPaquete = scanner.nextInt();
        System.out.println("Ingrese la zona de ubicación de la entrega.\n Ingrese 1 para Argentina, 2 para Bolivia, 3 para Costa Rica, 4 para Chile, 5 para Cuba");
        int zonaNum = scanner.nextInt();
        
        String zonaPais = "";
        boolean zonaCorrecta = true;
        int diasFuturos = 0;
        int costo = 0;
        
        if(pesoPaquete > 10){
            System.out.println("Por motivos de logística y seguridad se rechaza el envío del paquete");
            
        } else{
            switch(zonaNum){
                case 1:
                    zonaPais = "Argentina";
                    diasFuturos = 4;
                    costo = 25;
                    break;
                case 2:
                    zonaPais = "Bolivia";
                    diasFuturos = 2;
                    costo = 5;
                    break;
                case 3:
                    zonaPais = "Costa Rica";
                    diasFuturos = 3;
                    costo = 19;
                    break;
                case 4:
                    zonaPais = "Chile";
                    diasFuturos = 5;
                    costo = 22;
                    break;
                case 5:
                    zonaPais = "Cuba";
                    diasFuturos = 7;
                    costo = 21;
                    break;
                default:
                    zonaCorrecta = false;
            }
            int i = 1;
            while(i <= diasFuturos){
                if(dia > 30){
                    mes++;
                    dia = 0;
                }
                if(mes > 12){
                    ano++;
                    dia = 0;
                    mes = 1;
                }
                i++;
                dia++;
            }
            if(zonaCorrecta){
                System.out.println("Remitente: " + nombreRemitente);
                System.out.println("Destinatario: " + nombreDestinatario);
                System.out.println("El precio del envío para " + zonaPais + " serán " + (costo*pesoPaquete) + " euros y la fecha de entraga estimada es " + dia + "/" + mes + "/" + ano);
            } else{
                System.out.println("Zona incorrecta");
            }
            
        }
    }   
}