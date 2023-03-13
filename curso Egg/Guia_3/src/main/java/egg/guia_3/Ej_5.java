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
public class Ej_5 {
    public static void main(String[] args){
        Scanner read=new Scanner(System.in);
        System.out.println("Ingrese un número entero ccomo límite superior");
        int limite=read.nextInt();
        int suma=0;
        System.out.println("Ingrese un número entero");
        int num = read.nextInt();
        while(( suma + num )<=limite){
            suma = suma + num;
            System.out.println("Ingrese un número entero");
            num = read.nextInt();
        }
        System.out.println("La sumatoria de los números ingresados supera el límite inicial");
    }
    
}
