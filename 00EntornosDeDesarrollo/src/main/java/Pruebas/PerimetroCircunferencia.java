
package PracticaDebug1;

import java.util.*;
 
public class PerimetroCircunferencia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double radio, volumen, perimetro;
 
        System.out.print("Introduzca radio de una circunferencia: ");
        radio = sc.nextDouble();
 
        perimetro=2 * Math.PI * radio;
        System.out.println("El perimetro de la circunferencia con un radio de " + radio + " es " + perimetro);
    }
}
    

