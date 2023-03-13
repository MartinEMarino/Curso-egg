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

public class Ej_2{ 
        public static void main(String[] args){
            System.out.println("Ingrese una frase");
            Scanner read = new Scanner(System.in);
            String frase= read.nextLine();
            String clave="eureka";
                      
            if (frase.equals(clave)){
                System.out.println("Correcto");
            }
            else{
                System.out.println("Incorrecto");
            }
        }
}