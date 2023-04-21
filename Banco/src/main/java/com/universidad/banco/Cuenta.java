/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.universidad.banco;

/**
 *
 * @author Jorge
 */
public class Cuenta {
    private int dinero = 0;
    public int ultimoMovimiento = 0;
    public String ultimaTransaccion = "";
    private String clave = "";
    private String nombre = "";
    public Cuenta(String password, String name){
        clave = password;
        nombre = name;
    }
    public void agregarDinero(int cantidad){
        dinero = dinero + cantidad;
        ultimaTransaccion = "Depositar ";
        ultimoMovimiento = cantidad;
    }
    public void retirarDinero(int cantidad){
        dinero = dinero - cantidad;
        ultimaTransaccion = "Retirar ";
        ultimoMovimiento = cantidad;
    }
    public int consultarSaldo(){
        return dinero;
    }
    public void mostrarMenu(){
        System.out.println("Bienvenido " + nombre + ",");
        System.out.println("Por favor seleccione una de las siguientes opciones:");
        System.out.println("A para retirar dinero");
        System.out.println("B para depositar dinero");
        System.out.println("C para consultar su saldo");
        System.out.println("D para consultar su última transacción");
        System.out.println("E para salir del sistema");
    }
}