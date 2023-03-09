//Conocido el número en matemática PI π, pedir al usuario que ingrese el valor del radio de
//una circunferencia y calcular y mostrar por pantalla el área y perímetro. Recuerde que para
//calcular el área y el perímetro se utilizan las siguientes fórmulas:
//area = PI * radio2
//perimetro = 2 * PI * radio

package egg.egg;
import java.util.Scanner;

public class Egg {

    public static void main(String[] args) {
        
        double radio;
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese el valor del radio de la circunferencia");
        radio=leer.nextDouble();
        System.out.println("El área del círculo es: " +Math.pow(radio,2)*Math.PI);
        System.out.println("El perímetro de la circunferencia es: " +2*radio*Math.PI);
    }
}