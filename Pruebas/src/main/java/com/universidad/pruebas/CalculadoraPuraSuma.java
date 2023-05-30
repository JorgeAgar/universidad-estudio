/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.universidad.pruebas;

/**
 *
 * @author Jorge
 */
import java.util.Scanner;
public class CalculadoraPuraSuma {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
    }
    
    static int restar(int a, int b){ //a-b = c
        return a + (Math.negateExact(b));
    }
    static int multiplicar(int a, int b){
        for(int i = 1; i < b; i++){
            a += a;
        }
        return a;
    }
    
}
