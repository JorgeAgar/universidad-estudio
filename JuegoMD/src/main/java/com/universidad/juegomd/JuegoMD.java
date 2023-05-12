/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.universidad.juegomd;

/**
 *
 * @author Jorge
 */
import java.util.Scanner;
public class JuegoMD {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[][] equivalencias = new String[32][2];
        equivalencias[0][0] = "p ^ F";
        equivalencias[0][1] = "F";
        equivalencias[1][0] = "p v T";
        equivalencias[1][1] = "T";
        equivalencias[2][0] = "p v F";
        equivalencias[2][1] = "p";
        equivalencias[3][0] = "P ^ T";
        equivalencias[3][1] = "p";
        equivalencias[4][0] = "p v p";
        equivalencias[4][1] = "P";
        equivalencias[5][0] = "p ^ p";
        equivalencias[5][1] = "p";

        int respuesta;

        for(int i = 0; i < 6; i++){
            System.out.print(equivalencias[i][0] + " ≡ ");
            int pos = (int)Math.round(Math.random());
            System.out.println(equivalencias[pos][1]);
            System.out.println("1 para si y 2 para no");
            respuesta = sc.nextInt();
            sc.nextLine();

            if(respuesta == 1 && equivalencias[pos][1].equals(equivalencias[i][1])){
                System.out.println("Esta bien");
            } else if(respuesta == 2 && !(equivalencias[pos][1].equals(equivalencias[i][1]))){
                System.out.println("Esta bien");
            } else{
                System.out.println("Bruto");
            }
        }
        
    }
}
