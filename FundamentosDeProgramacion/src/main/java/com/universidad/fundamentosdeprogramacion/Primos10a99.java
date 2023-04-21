/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.universidad.fundamentosdeprogramacion;

/**
 *
 * @author Jorge
 */
public class Primos10a99 {

    public static void main(String[] args) {
        for(int i = 10; i <= 99; i++){
            if(verificarPrimo(i)){
                System.out.println(i);
            }
        }
    }
    static boolean verificarPrimo(int num){
        for(int i = 2; i < num; i++){
            if(num % i == 0){
                return false;
            }
        }
        return true; //si salió del ciclo es xq es primo, sino no se ejecuta esta línea
    }
}