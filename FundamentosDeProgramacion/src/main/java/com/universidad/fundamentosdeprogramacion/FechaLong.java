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
public class FechaLong {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int dia,ano,mes,num;
        
        do{
            dia=0;
            ano=0;
            mes=0;
            num=0;
            
            System.out.println("Ingrese el número DDMMYYYY");
            num = scanner.nextInt();
        
            ano = num%10000;
            dia = num/1000000;
            mes = (num/10000)%100;
        }while(num<=101000 || num>99999999 || dia>31 || mes>12 || dia<1 || mes<1);
        
        
        System.out.println(dia + "/" + mes + "/" + ano);
    }
}