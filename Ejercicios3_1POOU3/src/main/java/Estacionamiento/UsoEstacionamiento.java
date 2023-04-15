/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Estacionamiento;

/**
 *
 * @author ALEJANDRO ZURITA PÉREZ
 */
public class UsoEstacionamiento {
    public static void main(String[] args) {
        Estacionamiento carro1 = new Estacionamiento();
        System.out.println("Total a pagar: "+carro1.CalcularCargos(3));
        System.out.println("-----------------------------------------------");
        Estacionamiento carro2 = new Estacionamiento();
        System.out.println("Total a pagar: "+carro2.CalcularCargos(15));
        System.out.println("-----------------------------------------------");
        Estacionamiento carro3 = new Estacionamiento();
        System.out.println("Total a pagar: "+carro3.CalcularCargos(25));
    }
}
