/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package egg.guia_3;

/**
 *
 * @author user
 */
public class Ej_e12 {
    public static void main(String[] args){
        
        String centena = null;
        String decena = null;
        String unidad = null;
        
        for(int i=0; i<10; i++){
            
            switch(i){
                case 0:
                centena="0";
                break;
                case 1:
                centena="1";
                break;
                case 2:
                centena="2";
                break;
                case 3:
                centena="E";
                break;
                case 4:
                centena="4";
                break;
                case 5:
                centena="5";
                break;
                case 6:
                centena="6";
                break;
                case 7:
                centena="7";
                break;
                case 8:
                centena="8";
                break;
                case 9:
                centena="9";
                break;
            }
            
            for(int j=0; j<10; j++){
                
            switch(j){
                case 0:
                decena="0";
                break;
                case 1:
                decena="1";
                break;
                case 2:
                decena="2";
                break;
                case 3:
                decena="E";
                break;
                case 4:
                decena="4";
                break;
                case 5:
                decena="5";
                break;
                case 6:
                decena="6";
                break;
                case 7:
                decena="7";
                break;
                case 8:
                decena="8";
                break;
                case 9:
                decena="9";
                }
                
                for(int k=0; k<10; k++){
                                 
                     
             switch(k){
                case 0:
                unidad="0";
                break;
                case 1:
                unidad="1";
                break;
                case 2:
                unidad="2";
                break;
                case 3:
                unidad="E";
                break;
                case 4:
                unidad="4";
                break;
                case 5:
                unidad="5";
                break;
                case 6:
                unidad="6";
                break;
                case 7:
                unidad="7";
                break;
                case 8:
                unidad="8";
                break;
                case 9:
                unidad="9";
                }

                    System.out.println(centena+"-"+decena+"-"+unidad);
            
                }        
            }
        }
    }
}
