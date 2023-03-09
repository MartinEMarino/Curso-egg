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
public class Ej_5 {
    public static void main(String[] args){
        System.out.println("Ingrese un número entero");
        Scanner read = new Scanner(System.in);
        int num = read.nextInt();
        double raiz = Math.sqrt(num);
        System.out.println("El doble es: " +(num*2));
        System.out.println("El triple es: " +(num*3));
        System.out.println("La raíz cuadrada es: "+ raiz);
    }
    
}
