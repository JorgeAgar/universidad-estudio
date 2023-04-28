/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.triquitraqui;

/**
 *
 * @author Jorge
 */
import java.util.Scanner;
public class TriquiTraqui {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String x = " X ", o = " O ", vacio = "   ";
        boolean victoria = false, lleno = false;
        boolean turnoX = false;
        byte posicion;
        String entrada;
        byte vacios = 0;
        String[] cuadro = {vacio, vacio, vacio, vacio, vacio, vacio, vacio, vacio, vacio};
        
        while(victoria == false && lleno == false){
            if(turnoX){
                do{
                    System.out.println("Turno de X");
                    entrada = scanner.nextLine();
                    if(entrada.matches("\\d{1,2}")){
                        posicion = Byte.parseByte(entrada);
                    } else{
                        posicion = 9;
                    }
                } while(posicion < 0 || posicion > 8 || !cuadro[posicion].equals(vacio));
                cuadro[posicion] = x;
            } else{
                do{
                    System.out.println("Turno de O");
                    entrada = scanner.nextLine();
                    if(entrada.matches("\\d{1,2}")){
                        posicion = Byte.parseByte(entrada);
                    } else{
                        posicion = 9;
                    }
                } while(posicion < 0 || posicion > 8 || !cuadro[posicion].equals(vacio));
                cuadro[posicion] = o;
            }
            
            System.out.println(cuadro[0] + "|" + cuadro[1] + "|" + cuadro[2]);
            System.out.println("-----------");
            System.out.println(cuadro[3] + "|" + cuadro[4] + "|" + cuadro[5]);
            System.out.println("-----------");
            System.out.println(cuadro[6] + "|" + cuadro[7] + "|" + cuadro[8]);
            
            turnoX = !turnoX;
            
            for(byte i = 0; i < 9; i++){
                if(cuadro[i].equals(vacio)){
                    vacios++;
                }
            }
            if(vacios <= 0){
                lleno = true;
            }
            vacios = 0;
            
            if(cuadro[0].equals(x) && cuadro[1].equals(x) && cuadro[2].equals(x)){
                victoria = true;
            }
            if(cuadro[0].equals(o) && cuadro[1].equals(o) && cuadro[2].equals(o)){
                victoria = true;
            }
            if(cuadro[3].equals(x) && cuadro[4].equals(x) && cuadro[5].equals(x)){
                victoria = true;
            }
            if(cuadro[3].equals(o) && cuadro[4].equals(o) && cuadro[5].equals(o)){
                victoria = true;
            }
            if(cuadro[6].equals(x) && cuadro[7].equals(x) && cuadro[8].equals(x)){
                victoria = true;
            }
            if(cuadro[6].equals(o) && cuadro[7].equals(o) && cuadro[8].equals(o)){
                victoria = true;
            }
            if(cuadro[0].equals(x) && cuadro[3].equals(x) && cuadro[6].equals(x)){
                victoria = true;
            }
            if(cuadro[0].equals(o) && cuadro[3].equals(o) && cuadro[6].equals(o)){
                victoria = true;
            }
            if(cuadro[1].equals(x) && cuadro[4].equals(x) && cuadro[7].equals(x)){
                victoria = true;
            }
            if(cuadro[1].equals(o) && cuadro[4].equals(o) && cuadro[7].equals(o)){
                victoria = true;
            }
            if(cuadro[2].equals(x) && cuadro[5].equals(x) && cuadro[8].equals(x)){
                victoria = true;
            }
            if(cuadro[2].equals(o) && cuadro[5].equals(o) && cuadro[8].equals(o)){
                victoria = true;
            }
            if(cuadro[0].equals(x) && cuadro[4].equals(x) && cuadro[8].equals(x)){
                victoria = true;
            }
            if(cuadro[0].equals(o) && cuadro[4].equals(o) && cuadro[8].equals(o)){
                victoria = true;
            }
            if(cuadro[2].equals(x) && cuadro[4].equals(x) && cuadro[6].equals(x)){
                victoria = true;
            }
            if(cuadro[2].equals(o) && cuadro[4].equals(o) && cuadro[6].equals(o)){
                victoria = true;
            }
        }
        if(victoria){
            System.out.println("Tenemos un ganador!");
        } else{
            System.out.println("Empate");
        }
    }
}