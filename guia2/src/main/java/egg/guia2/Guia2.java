/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package egg.guia2;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Guia2 {

    public static void main(String[] args) {
        System.out.println("Ingrese un número");
        Scanner leer = new Scanner(System.in);
        int num1 = leer.nextInt();
        System.out.println("Ingrese un número");
        int num2 = leer.nextInt();
        System.out.println("La suma de los números es " + (num1+num2));
    }
}
