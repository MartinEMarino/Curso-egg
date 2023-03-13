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
public class Ej_6 {
    public static void main(String[] args){
        Scanner read=new Scanner(System.in);
        System.out.println("Ingrese dos números enteros positivos");
        int num1=read.nextInt();
        int num2=read.nextInt();
        
        String continuar="s";
        
        while(continuar.equalsIgnoreCase("S")){
        
        System.out.println("");
        System.out.println("MENU");
        System.out.println("");
        System.out.println("1 - Sumar");
        System.out.println("2 - Restar");
        System.out.println("3 - Multiplicar");
        System.out.println("4 - Dividir");
        System.out.println("5 - Salir");
        System.out.println("");
        System.out.println("Ingrese una opción");
        
        int choice = read.nextInt();
        
        while((choice>5) || (choice<1)){
        
        System.out.println("");
        System.out.println("MENU");
        System.out.println("");
        System.out.println("1 - Sumar");
        System.out.println("2 - Restar");
        System.out.println("3 - Multiplicar");
        System.out.println("4 - Dividir");
        System.out.println("5 - Salir");
        System.out.println("");
        System.out.println("Ingrese una opción");
        
        choice = read.nextInt();
        }
        
        switch(choice){
            
            case 1:
                System.out.println("La Suma de los números es: " +(num1+num2));
                break;
            case 2:
                System.out.println("La resta de los números es: " +(num1-num2));
                break;
            case 3:
                System.out.println("La multiplicación de los números es: " +(num1*num2));
                break;
            case 4:
                System.out.println("La división de los números es: " +(num1/num2));
                break;
            case 5:
                
                String confirm="H";
                
                while((!confirm.equalsIgnoreCase("N")) && (!confirm.equalsIgnoreCase("S"))){
                
                confirm=read.nextLine();
                
                System.out.println("¿Está seguro que desea salir (S/N)?");
                
                confirm=read.nextLine();
                }
                
                if (confirm.equalsIgnoreCase("S")){
                    continuar="N";
                }
                
                break;
                
        }
        
    }
    }
}
