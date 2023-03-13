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
public class Ej_8 {
    public static void main(String[] args){
        
        Scanner read = new Scanner(System.in);
        
        System.out.println("Ingrese un número entero mayor que 1");
        
        int num = read.nextInt();
        
        while (num<2){
            
        System.out.println("Ingrese un número entero mayor que 1");
        
        num = read.nextInt();
        
        }
        System.out.println("");
        
        for (int j =1 ; j <= num ; j++) {
            
            for (int i = 1 ; i <= num ; i++ ) {
                if ((j==1) || (j==num) || (i==1) || (i==num)){
            System.out.print(" *");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
        
    }
    
}
