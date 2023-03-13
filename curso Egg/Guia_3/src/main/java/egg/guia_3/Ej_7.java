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
public class Ej_7 {
    public static void main(String[] args){
        Scanner read= new Scanner(System.in);
        int count = 1;
        int correctas = 1;
        int wrong= 1;
        
        System.out.println("Ingrese el paquete de datos "+ (count));
        
        String data = read.nextLine();
        System.out.println(data.substring(0,1));
        System.out.println(data.substring( 4));
        while(!data.equals("&&&&&")){
            
            if((data.substring(0,1).equals("X")) && (data.substring(4).equals("O"))){
            count = count + 1;
            correctas = correctas + 1;
            System.out.println("");
            System.out.println("Paquetes ingresados: " + (count-1));
            System.out.println("Paquetes correctos: " + (correctas-1));
            System.out.println("Paquetes incorrectos: " + (wrong-1));
            System.out.println("");
            }
            else{
            count = count + 1;
            wrong = wrong + 1;
            System.out.println("");
            System.out.println("Paquetes ingresados: " + (count-1));
            System.out.println("Paquetes correctos: " + (correctas-1));
            System.out.println("Paquetes incorrectos: " + (wrong-1));
            System.out.println("");
            }
            
        System.out.println("Ingrese el paquete de datos "+ (count));          
        data = read.nextLine();
                
        }        
        System.out.println("");
        System.out.println("Paquetes ingresados: " + (count-1));
        System.out.println("Paquetes correctos: " + (correctas-1));
        System.out.println("Paquetes incorrectos: " + (wrong-1));
        System.out.println("");
        
    }
}
