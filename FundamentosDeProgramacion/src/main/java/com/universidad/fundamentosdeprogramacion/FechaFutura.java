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

public class FechaFutura {
    public static void main(String[] args) {
        int i=1, mes, ano, dia, fecha;
        Scanner scanner = new Scanner(System.in);

        do{
            do{
                System.out.println("Ingrese la fecha en formato YYYYMMDD");
                fecha = scanner.nextInt();
            }while(fecha>99999999);
            
            ano = fecha/10000;
            mes = (fecha/100)%100;
            dia = fecha%100;
        }while(dia<1 || dia>31 || mes<1 || mes>12);
        
        System.out.println("¿Cuántos días quiere aumentar la fecha?");
        int diasFuturos = scanner.nextInt();

        while (i<= diasFuturos){
          if (mes==1 || mes==3 || mes==5 || mes==7 || mes==8 || mes==10 || mes==12){
              if (dia==31){
                  dia = 0;
                  mes +=1;
              }
              if (mes==13){
                  dia = 0;
                  ano +=1;
                  mes=1;
              }
          }
            if (mes==4 || mes==6 || mes==9 || mes==11){
                if (dia==30){
                    dia = 0;
                    mes +=1;
                }

            }
            if (mes==2){
                if (verificarBisiesto(ano)){
                    if (dia==29){
                        dia = 0;
                        mes +=1;
                    }

                }else {
                    if (dia==28){
                        dia = 0;
                        mes +=1;
                    }
                }
            }
            dia++;
            i++;
        }

        System.out.println("la fecha futura a los " + diasFuturos + " días, sería: " + dia + "/" + mes + "/" + ano);

    }

    static boolean verificarBisiesto(int year){
        if(year % 4 == 0){
            return (year % 100 != 0) || year % 400 == 0;
        } else{
            return false;
        }
    }
}
