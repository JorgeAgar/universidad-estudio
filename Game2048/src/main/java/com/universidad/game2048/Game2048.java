/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.universidad.game2048;

/**
 *
 * @author Jorge
 */
import java.util.Scanner;
import java.util.Random;
public class Game2048 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rng = new Random();
        
        char[][] cnumbers = new char[4][4];
        
        byte move;
        
        boolean continueGame = true;
        
        boolean isEmpty;
        
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                //"initialize" cnumbers to ' ' (blank)
                cnumbers[i][j] = ' ';
            }
        }
        
        while(continueGame){
            
            do{
                //choose random box to generate new number
                int row = rng.nextInt(3);
                int column = rng.nextInt(3);
                
                if(cnumbers[row][column] == ' '){
                    isEmpty = true;
                    cnumbers[row][column] = (char)(generateNumber() + '0');
                } else{
                    isEmpty = false;
                }
            }while(!isEmpty);
            
            /*
            1. if the next positions box is empty -> shift number (repeat until no more possible shifts)
            2. if the number is equal to the number in the next positions box -> 
                2.1. if the number in the next position box will merge with another number -> don't merge
                2.2. if it won't -> merge
            3. repeat only step 1
            4. generate new number
            */
            boolean willMerge;
            
            for(int i = 0; i < 4; i++){ 
                //print the board
                System.out.println(" " + cnumbers[i][0] + " | " + cnumbers[i][1] + " | " + cnumbers[i][2] + " | " + cnumbers[i][3]);
            }
            
            do{
                //capture the move for next iteration
                System.out.println("1.up   2.down   3.right   4.left");
                move = sc.nextByte();
            }while(move < 1 || move > 4);
        }
    }
    static int generateNumber(){
        //choose whether to generate a 2 or a 4
        byte probability = (byte)Math.floor(Math.random()*10);
        if(probability > 8){
            return 4;
        } else{
            return 2;
        }
    }
}
