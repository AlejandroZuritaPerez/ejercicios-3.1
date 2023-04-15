/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ALEJANDRO ZURITA PÉREZ
 */
public class UsoCuadrado {
    public static void main(String[] args) {
        Cuadrado C1 = new Cuadrado();
        C1.setLado(100);
        System.out.println("Area del Cuadrado 1: "+C1.area());
        System.out.println("Perimetro del Cuadrado 1: "+C1.perimetro());
        
        Cuadrado C2 = new Cuadrado();
        C2.setLado(150);
        System.out.println("El Area del Cuadrado 2 es: " +C2.area());
        System.out.println("El Perimetro del Cuadrado 2 es:" +C2.perimetro());
        System.out.println("-------------------------------------------------");
    }
}
