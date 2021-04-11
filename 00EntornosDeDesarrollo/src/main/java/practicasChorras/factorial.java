/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicasChorras;

import java.util.Scanner;

/**
 *
 * @author prats
 */
public class factorial {
    
    private static int factorial(int n) {
        int resultado;
        resultado = 1;
        for (int i = 2; i <= n; i++) {
            resultado = resultado * i;
        }
        return resultado;
}

    
    public static void main(String[] args) {
        
        System.out.println("Ingresa largo");
        
        
        
        int n= 2;
         
       int r = factorial (n);
      
     }
    
}
