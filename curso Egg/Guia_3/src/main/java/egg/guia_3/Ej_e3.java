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
public class Ej_e3 {
    public static void main(String[] args){
        
        Scanner read = new Scanner(System.in);
        
        System.out.println("Ingrese una letra");
        String letra = read.next();
        
        if(letra.equalsIgnoreCase("A")||letra.equalsIgnoreCase("E")||letra.equalsIgnoreCase("I")||letra.equalsIgnoreCase("O") ||letra.equalsIgnoreCase("U")){
            System.out.println("La letra ingresada es una vocal");    
        }
        else{
            System.out.println("La letra ingresada no es una vocal");
        }
    }
    
}
