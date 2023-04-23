/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.universidad.hackerrank;

/**
 *
 * @author Jorge
 */
import java.util.Scanner;
public class JavaDatatypes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        sc.nextLine();
        
        for(int i = 1; i <= T; i++){
            boolean fitsByte = sc.hasNextByte();
            boolean fitsShort = sc.hasNextShort();
            boolean fitsInt = sc.hasNextInt();
            boolean fitsLong = sc.hasNextLong();
            
            boolean fits = fitsByte || fitsShort || fitsInt || fitsLong;
            
            String number = sc.nextLine();
            
            System.out.println("byte " + fitsByte + ", short " + fitsShort + ", int " + fitsInt + ", long " + fitsLong);
            
            if(fits){
                System.out.println(number + " can be fitted in:");
                if(fitsByte){
                    System.out.println("* byte");
                }
                if(fitsShort){
                    System.out.println("* short");
                }
                if(fitsInt){
                    System.out.println("* int");
                }
                if(fitsLong){
                    System.out.println("* long");
                }
            } else{
                System.out.println(number + " can't be fitted anywhere");
            }
        }
    }
}
