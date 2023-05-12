/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.universidad.gui;

/**
 *
 * @author Jorge
 */
import javax.swing.*;
public class GUI {

    public static void main(String[] args) {
        JFrame f=new JFrame();//creating instance of JFrame  
          
        JButton b=new JButton("click");//creating instance of JButton  
        b.setBounds((1920/2)-150,(1000/2)-70,300, 140);//x axis, y axis, width, height 
        
        f.add(b);//adding button in JFrame  
          
        f.setSize(1280,720);//400 width and 500 height  
        f.setLayout(null);//using no layout managers  
        f.setVisible(true);//making the frame visible
    }
}
