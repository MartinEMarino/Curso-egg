/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package egg.guia_3;

/**
 *
 * @author user
 */
public class Ej_e2 {
    public static void main(String[] args){
        
        int A=0;
        int B=25;
        int C=50;
        int D=75;
        
        System.out.println("A: " + A + ", B: " + B + ", C: " + C + ", D: " + D);
        
        int E=B;
        B=C;
        C=A;
        A=D;
        D=E;
        
        System.out.println("A: " + A + ", B: " + B + ", C: " + C + ", D: " + D);
    }
    
}
