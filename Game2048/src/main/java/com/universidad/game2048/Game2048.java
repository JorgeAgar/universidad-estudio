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
        
        String[][] snumbers = new String[4][4];
        
        boolean[] wasMovePossible = new boolean[4];
        
        byte move = 1;
        
        boolean continueGame = true;
        
        boolean isEmpty;
        
        boolean updatedBoard = true;
        
        boolean victory = false;
        
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                //"initialize" cnumbers to ' ' (blank)
                snumbers[i][j] = " ";
            }
        }
        
        for(int i = 0; i < 4; i++){ //initialize wasMovePossible to true
            wasMovePossible[i] = true;
        }
        
        int iteration = 0;
        
        while(continueGame){
            
            
            System.out.println("iteration = " + (++iteration));
            /*
            1. if the next positions box is empty -> shift number (repeat until no more possible shifts)
            2. if the number is equal to the number in the next positions box -> 
                2.1. if the number in the next position box will merge with another number -> don't merge
                2.2. if it won't -> merge
            3. repeat only step 1
            4. generate new number
            */
            //boolean willMerge;
            int shifts, highest=0;
            do{  //move & shift
                shifts = 0;
                
                System.out.println("move = " + move);
                switch (move) {
                    case 1 -> { //up
                        for (int i = 1; i < 4; i++) {
                            for (int j = 0; j < 4; j++) {
                                if (snumbers[i - 1][j].isBlank() && !(snumbers[i][j].isBlank())) { //shift
                                    snumbers[i - 1][j] = snumbers[i][j];
                                    snumbers[i][j] = " ";
                                    shifts++;
                                } else if (snumbers[i - 1][j].equals(snumbers[i][j]) && !(snumbers[i][j].isBlank()) && (snumbers[i][j].matches("\\d{1,5}"))) { //merge
                                    snumbers[i - 1][j] = (Integer.toString(2 * (Integer.parseInt(snumbers[i][j]))) + "m");
                                    snumbers[i][j] = " ";
                                    shifts++;
                                }
                            }
                        }
                    }
                    case 2 -> { //down
                        for (int i = 2; i >= 0; i--) {
                            for (int j = 0; j < 4; j++) {
                                if (snumbers[i + 1][j].isBlank() && !(snumbers[i][j].isBlank())) { //shift
                                    snumbers[i + 1][j] = snumbers[i][j];
                                    snumbers[i][j] = " ";
                                    shifts++;
                                } else if (snumbers[i + 1][j].equals(snumbers[i][j]) && !(snumbers[i][j].isBlank()) && (snumbers[i][j].matches("\\d{1,5}"))) { //merge
                                    snumbers[i + 1][j] = (Integer.toString(2 * (Integer.parseInt(snumbers[i][j]))) + "m");
                                    snumbers[i][j] = " ";
                                    shifts++;
                                }
                            }
                        }
                    }
                    case 3 -> { //right
                        for (int i = 0; i < 4; i++) {
                            for (int j = 2; j >= 0; j--) {
                                if (snumbers[i][j + 1].isBlank() && !(snumbers[i][j].isBlank())) { //shift
                                    snumbers[i][j + 1] = snumbers[i][j];
                                    snumbers[i][j] = " ";
                                    shifts++;
                                } else if (snumbers[i][j + 1].equals(snumbers[i][j]) && !(snumbers[i][j].isBlank()) && (snumbers[i][j].matches("\\d{1,5}"))) { //merge
                                    snumbers[i][j + 1] = (Integer.toString(2 * (Integer.parseInt(snumbers[i][j]))) + "m");
                                    snumbers[i][j] = " ";
                                    shifts++;
                                }
                            }
                        }
                    }
                    case 4 -> { //left
                        for (int i = 0; i < 4; i++) {
                            for (int j = 1; j < 4; j++) {
                                if (snumbers[i][j - 1].isBlank() && !(snumbers[i][j].isBlank())) { //shift
                                    snumbers[i][j - 1] = snumbers[i][j];
                                    snumbers[i][j] = " ";
                                    shifts++;
                                } else if (snumbers[i][j - 1].equals(snumbers[i][j]) && !(snumbers[i][j].isBlank()) && (snumbers[i][j].matches("\\d{1,5}"))) { //merge
                                    snumbers[i][j - 1] = (Integer.toString(2 * (Integer.parseInt(snumbers[i][j]))) + "m");
                                    snumbers[i][j] = " ";
                                    shifts++;
                                }
                            }
                        }
                    }
                    default -> { //just in case
                        System.out.println("Not a valid move!");
                        System.out.println("move = " + move);
                    }
                }
                if(shifts > 0){
                    updatedBoard = true;
                }
            }while(shifts != 0);
            //random number has to be from 0 to 4 bc origin is counted but the bound is not counted, example origin 1, bound 5 == 1-4
            if(updatedBoard){ //choose whether to generate a new number or not
                wasMovePossible[move-1] = true; //move was possible
                //generate new number
                do{
                    //choose random box to generate new number
                    //System.out.println("iterate");
                    int row = rng.nextInt(0,4);//random number 0-32

                    int column = rng.nextInt(0,4);//random number 0-3

                    if(snumbers[row][column].isBlank()){
                        isEmpty = true;
                        snumbers[row][column] = Integer.toString(generateNumber());
                    } else{
                        isEmpty = false;
                    }

                }while(!isEmpty);
            } else{ //checking impossible moves to determine loss
                wasMovePossible[move-1] = false;
            }
            
            
            for(int i = 0; i < 4; i++){ //remove "m" from numbers and check for highest number
                for(int j = 0; j < 4; j++){ //remove "m" from numbers
                    if(snumbers[i][j].contains("m")){
                        snumbers[i][j] = snumbers[i][j].replace("m", " ");
                        snumbers[i][j] = snumbers[i][j].strip();
                    }
                }
                for(int j = 0; j < 4; j++){ //check for highest number
                    if(snumbers[i][j].strip().matches("\\d{1,5}")){
                        highest = Integer.parseInt(snumbers[i][j].strip()) > highest ? Integer.parseInt(snumbers[i][j].strip()) : highest;
                    }
                }
            }
            
            if(!wasMovePossible[0] && !wasMovePossible[1] && !wasMovePossible[2] && !wasMovePossible[3]){ //no move was possible, loss
                continueGame = false; //loss, not continuing game
            }
            
            if(highest > 2047){ //2048, won the game
                victory = true;
                continueGame = false; //victory, not continuing game
            }
            
            printBoard(snumbers); //print the board
            
            do{
                //capture the move for next iteration
                System.out.println("1.up   2.down   3.right   4.left");
                move = sc.nextByte();
            }while(move < 1 || move > 4);
            updatedBoard = false;
        }
        
        if(victory){
            System.out.println("");
            System.out.println("=============================================");
            System.out.println("You won!");
            System.out.println("=============================================");
        } else{
            System.out.println("");
            System.out.println("=============================================");
            System.out.println("You lost");
            System.out.println("=============================================");
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
    
    static void printBoard(String[][] snumbers){
        for(int i = 0; i < 4; i++){
                //print the board
                System.out.println(" " + snumbers[i][0] + " | " + snumbers[i][1] + " | " + snumbers[i][2] + " | " + snumbers[i][3]);
            }
    }
}