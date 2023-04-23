/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.universidad.hackerrank;

/**
 *
 * @author Jorge
 */
import java.io.*;
import java.util.*;

public class JavaLoopsII {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int q = Integer.parseInt(sc.nextLine());
        if(q >= 0 && q <= 500){
            
            int[] a = new int[q];
            int[] b = new int[q];
            int[] n = new int[q];
            
            int staging;
            
            for(int i = 0; i < q; i++){
                
                String sa = sc.next();
                String sb = sc.next();
                String sn = sc.next();
                
                a[i] = Integer.parseInt(sa);
                b[i] = Integer.parseInt(sb);
                n[i] = Integer.parseInt(sn);
            }
            
            boolean validInput = true;
            for(int i = 0; i < q; i++){
                if(a[i]<0 || a[i]>50 || b[i]<0 || b[i]>50 || n[i]<1 || n[i]>15){
                    validInput = false;
                    break;
                }
            }
            
            if(validInput){
                for(int i = 0; i < q; i++){
                    //i of q
                    for(int j = 0; j < n[i]; j++){
                        //j of n
                        staging = 0;
                        for(int k = 0; k <= j; k++){
                            //k for exponent
                            staging += (Math.pow(2, k)) * b[i];
                        }
                        System.out.print((a[i]+staging) + " ");
                    }
                    System.out.println("");
                }
            } else{
                System.out.println("a and b must be a number between 0 and 50");
                System.out.println("n must be a number between 1 and 15");
            }

            
        } else{
            System.out.println("q must be a number between 0 and 500");
        }
    }
}