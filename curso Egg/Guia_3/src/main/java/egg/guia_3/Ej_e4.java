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
public class Ej_e4 {
    public static void main(String[] args){
        
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese un número del 1 al 10");
        int num = read.nextInt();
        
        while(num<1 || num>10){
            System.out.println("Ingrese un número del 1 al 10");
        num = read.nextInt();
        }
        
        switch(num){
                case 1:
                System.out.println("El número " +num+ " es I en números romanos");
                break;
                case 2:
                System.out.println("El número " +num+ " es II en números romanos");
                break;
                case 3:
                System.out.println("El número " +num+ " es III en números romanos");
                break;
                case 4:
                System.out.println("El número " +num+ " es IV en números romanos");
                break;
                case 5:
                System.out.println("El número " +num+ " es V en números romanos");
                break;
                case 6:
                System.out.println("El número " +num+ " es VI en números romanos");
                break;
                case 7:
                System.out.println("El número " +num+ " es VII en números romanos");
                break;
                case 8:
                System.out.println("El número " +num+ " es VIII en números romanos");
                break;
                case 9:
                System.out.println("El número " +num+ " es IX en números romanos");
                break;
                case 10:
                System.out.println("El número " +num+ " es X en números romanos");
        }
    }
}
