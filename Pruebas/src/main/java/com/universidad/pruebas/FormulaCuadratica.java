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
public class FormulaCuadratica {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese una ecuación de la forma ax2 + bx + c = 0 (Sin el igual a 0 y con espacio antes y despues de los signos por favor)");
        
        String sa = sc.next();
        String primerSigno = sc.next();
        int xAPos = sa.indexOf('x');
        int a = Integer.parseInt(sa.substring(0, xAPos));
        
        String sb = sc.next();
        String segundoSigno = sc.next();
        int xBPos = sb.indexOf('x');
        int b = Integer.parseInt(sb.substring(0, xBPos));
        
        String strc = sc.next();
        int c = Integer.parseInt(strc);
        
        if(primerSigno.matches("-")){
            b = b*-1;
        }
        if(segundoSigno.matches("-")){
            c = c*-1;
        }

        double x1 = ((b*(-1)) + Math.sqrt(Math.pow(b, 2) - (4*a*c)))/(2*a);
        double x2 = ((b*(-1)) - Math.sqrt(Math.pow(b, 2) - (4*a*c)))/(2*a);
        
        System.out.println("x1 = " + x1);
        System.out.println("x2 = " + x2);
        
    }
}
