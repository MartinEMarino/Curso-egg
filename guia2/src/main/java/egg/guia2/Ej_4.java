/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package egg.guia2;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Ej_4 {
    public static void main(String[] args){
        System.out.println("Ingrese la temperatura en ° Celsius");
        Scanner read = new Scanner(System.in);
        double celsius = read.nextDouble();
        double farh = 32+(9 * celsius/5);
        System.out.println("La temperatura en °Farenheit es: " + farh);
    }
    
}
