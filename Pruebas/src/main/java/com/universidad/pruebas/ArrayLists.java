/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.universidad.pruebas;

/**
 *
 * @author Jorge
 */
import java.util.ArrayList;
public class ArrayLists {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String> numeros = new ArrayList<String>();
        
        numeros.add("uno");
        numeros.add("dos");
        numeros.add("tres");
        numeros.remove("uno");
        numeros.remove(1);
        
        for(int i = 0; i < numeros.size(); i++){
            System.out.println("numeros(" + i + ") = " + numeros.get(i));
        }
    }
    
}
