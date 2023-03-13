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
public class Ej_e5 {
    public static void main(String[] args){
        
        Scanner read = new Scanner(System.in);
        
        System.out.println("Ingrese la clase de socio (A,B;C)");
        String clase = read.next();
        System.out.println("Ingrese el costo del tratamiento");
        double costo = read.nextDouble();
        
        switch(clase){
            case "A":
                System.out.println("El importe a pagar es: $" +(costo*0.5));
                break;
            case "B":
                System.out.println("El importe a pagar es: $" +(costo * 0.35));
                break;
            case "C":
                System.out.println("El importe a pagar es: $" + costo);
    }
        
    }
    
}
