/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package egg.guia_3;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Ej_1 {
    public static void main(String[] args){
        System.out.println("Ingrese un número entero");
        Scanner read= new Scanner(System.in);
        int num = read.nextInt();
       
        if ( 0 == (num % 2) ){
            System.out.println("El número " + num + " es par");            
        }
        else{
            System.out.println("El número " + num + " es impar");
        }
    }
    
}
