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
public class Ej_e1 {
    public static void main(String[] args){
        
        Scanner read=new Scanner(System.in);
        System.out.println("Ingrese la cantidad de segundos");
        int segundos=read.nextInt();
        
        int minutes=segundos/60;
        int hours=minutes/60;
        minutes=minutes-(hours*60);
        segundos=segundos-(hours*60*60+minutes*60);
        
        System.out.println(segundos + " segundos equivalenn a:");
        System.out.println( hours + " horas");
        System.out.println(minutes + " minutos");
        System.out.println(segundos + " segundos");
    }
    
}
