
package PracticaDebug1;


import java.util.Scanner;
public class AreaRectangulo {
    
   public static void main(String[] args) {
        double area;
        Scanner sc=new Scanner(System.in);
        System.out.println("ingrese ancho del rectangulo");
        double a=sc.nextDouble();  
        System.out.println("ingrese alto del rectangulo");
        double b=sc.nextDouble(); 
        area=a*b;
        System.out.println(area);                
     }
}