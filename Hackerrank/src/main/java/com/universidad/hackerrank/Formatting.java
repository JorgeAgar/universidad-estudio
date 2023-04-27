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

public class Formatting {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        ArrayList<String> text = new ArrayList<String>();
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        
        do{
            text.add(sc.next());
            numbers.add(sc.nextInt());
        } while(sc.hasNext());
        
        System.out.println("================================");
        for(int i = 0; i < text.size(); i++){
            System.out.printf("%-15s", text.get(i));
            System.out.printf("%3d %n", numbers.get(i));
        }
        System.out.println("================================");
       
    }
}
