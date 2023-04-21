/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.universidad.fundamentosdeprogramacion;

/**
 *
 * @author Jorge
 */
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;
public class Edad{
    public static void main(String[] args) {

        int fecha1, diaNaci, mesNaci, anoNaci, anoEdad = 0, mesEdad = 0, diaEdad = 0, anoActual, mesActual, diaActual;
        boolean repetir = true;
        String sfecha1;

        Scanner scanner = new Scanner(System.in);
        Calendar fecha = new GregorianCalendar();

        do {
            anoActual = fecha.get(Calendar.YEAR);
            mesActual = fecha.get(Calendar.MONTH);
            diaActual = fecha.get(Calendar.DAY_OF_MONTH);

            System.out.println("Ingrese su fecha de nacimiento en formato DDMMAAAA: ");
            sfecha1 = scanner.nextLine();
            if(sfecha1.matches("\\d{7,8}")){
                fecha1 = Integer.parseInt(sfecha1);
            } else{
                System.out.println("Fecha inválida");
                fecha1 = 203;
                //fecha1 a valor inválido para que se repita
            }


            mesNaci = ((fecha1 / 10000) % 100);
            diaNaci = (fecha1 / 1000000);
            anoNaci = (fecha1 % 10000);

            mesActual++;

            if (anoNaci >= anoActual) {
                if (mesNaci < mesActual) {
                    repetir = false;
                } else if (mesNaci == mesActual) {
                    if (diaNaci <= diaActual) {
                        repetir = false;
                    } else {
                        repetir = true;
                    }
                } else if (mesNaci > mesActual) {
                    repetir = true;
                }
            } else {
                repetir = false;
            }


        } while ((fecha1 <= 101000) || (fecha1 > 99999999) || (diaNaci > 31) || (mesNaci > 12) || (anoNaci > anoActual) || repetir);

        if (anoActual > anoNaci){
            if(mesActual > mesNaci){
                if(diaActual > diaNaci){
                    anoEdad = anoActual - anoNaci;
                    mesEdad = mesActual - mesNaci;
                    diaEdad = diaActual - diaNaci;
                    //esta bien
                } else if(diaActual < diaNaci){
                    anoEdad = anoActual - anoNaci;
                    mesEdad = (mesActual - mesNaci) - 1;
                    diaEdad = (31-diaNaci)+diaActual;
                    //esta bien
                } else if(diaActual == diaNaci){
                    anoEdad = anoActual - anoNaci;
                    mesEdad = mesActual - mesNaci;
                    diaEdad = 0;
                    //esta bien
                }
            } else if(mesActual < mesNaci){
                if(diaActual > diaNaci){
                    anoEdad = (anoActual-anoNaci)-1;
                    mesEdad = (mesActual - mesNaci) + 12;
                    diaEdad = diaActual - diaNaci;
                    //esta bien
                } else if(diaActual < diaNaci){
                    anoEdad = (anoActual - anoNaci)-1;
                    mesEdad = (mesActual - mesNaci) + 12;
                    diaEdad = diaNaci - diaActual;
                    //esta bien
                } else if(diaActual == diaNaci){
                    anoEdad = (anoActual - anoNaci) - 1;
                    mesEdad = (mesActual - mesNaci) + 12;
                    diaEdad = 0;
                    //esta bien
                }
            } else if(mesActual == mesNaci){
                if(diaActual > diaNaci){
                    anoEdad = anoActual - anoNaci;
                    mesEdad = 0;
                    diaEdad = diaActual - diaNaci;
                    //esta bien
                } else if(diaActual < diaNaci){
                    anoEdad = (anoActual - anoNaci) - 1;
                    mesEdad = 11;
                    diaEdad = (diaActual - diaNaci) + 31;
                    //esta bien
                } else if(diaActual == diaNaci){
                    anoEdad = anoActual - anoNaci;
                    mesEdad = 0;
                    diaEdad = 0;
                    //esta bien
                }
            }
        }
        if (anoActual == anoNaci){
            if(mesActual > mesNaci){
                if(diaActual > diaNaci){
                    anoEdad = 0;
                    mesEdad = mesActual - mesNaci;
                    diaEdad = diaActual - diaNaci;
                    //esta bien
                } else if(diaActual < diaNaci){
                    anoEdad = 0;
                    mesEdad = (mesActual - mesNaci) - 1;
                    diaEdad = (31 - diaNaci) + diaActual;
                    //esta bien
                } else if(diaActual == diaNaci){
                    anoEdad = 0;
                    mesEdad = mesActual - mesNaci;
                    diaEdad = 0;
                    //esta bien
                }
            } else if(mesActual == mesNaci){
                if(diaActual > diaNaci){
                    anoEdad = 0;
                    mesEdad = 0;
                    diaEdad = diaActual - diaNaci;
                    //esta bien
                } else if(diaActual == diaNaci){
                    anoEdad = 0;
                    mesEdad = 0;
                    diaEdad = 0;
                }
            }
    }
        
        if (mesEdad==1 || mesEdad==3 || mesEdad==5 || mesEdad==7 || mesEdad==8 || mesEdad==10 || mesEdad==12){
            if (diaEdad==31){
                diaEdad = 0;
                mesEdad +=1;
            }
            if (mesEdad==13){
                anoEdad +=1;
                mesEdad=1;
            }
        }
        if (mesEdad==4 || mesEdad==6 || mesEdad==9 || mesEdad==11){
            if (diaEdad==30){
                diaEdad = 0;
                mesEdad +=1;
            }

        }
        if (mesEdad==2){
            if (verificarBisiesto(anoEdad)){
                if (diaEdad==29){
                    diaEdad = 0;
                    mesEdad +=1;
                }

            }else {
                if (diaEdad==28){
                    diaEdad = 0;
                    mesEdad +=1;
                }
            }
        }
        if(mesEdad > 11){
            anoEdad++;
            mesEdad = 0;
        }
        
        System.out.println("Su edad es de " + anoEdad + " años, " + mesEdad + " meses, " + diaEdad + " días."); 
}
static boolean verificarBisiesto(int year){
        if(year % 4 == 0){
            return (year % 100 != 0) || year % 400 == 0;
        } else{
            return false;
        }
    }
}