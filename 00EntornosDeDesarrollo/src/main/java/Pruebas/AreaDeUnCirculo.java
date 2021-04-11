
package PracticaDebug1;

import java.util.Scanner;

public class AreaDeUnCirculo {


    public static void main(String[] args) {
        
        Scanner Sca = new Scanner(System.in);

        System.out.print("Programa que calcula el area de un circulo\n\n");

        System.out.print("ingrese el radio del circulo: ");
        double radio = Sca.nextInt();

        double Resultado = 3.1416 * (radio * radio);

        System.out.print("El area del circulo es: " + Resultado);



    }

}
