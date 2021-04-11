
package PracticaDebug1;

import java.util.Scanner;
public class PerimetroRectangulo {
    
     public static void main(String[] args) {
         
       Scanner sc=new Scanner(System.in);
       double largo,ancho,perimetro;
       System.out.println("Ingresa largo");
       largo=sc.nextDouble();
       System.out.println("Ingresa ancho");
       ancho=sc.nextDouble();
       perimetro=2*(ancho+largo);
      System.out.println(perimetro);
      
     }
}
