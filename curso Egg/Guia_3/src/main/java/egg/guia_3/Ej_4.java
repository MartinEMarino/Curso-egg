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
public class Ej_4 {
    public static void main(String[] args){
        
        Scanner read=new Scanner(System.in);
        System.out.println("Ingrese una frase");
        String frase=read.nextLine();

        if(frase.substring(0, 1).equals("A")){
            System.out.println("Correcto");
        }
        
        else{
                System.out.println("Incorrecto");
            }
        
    }

}
