package pkg00practicalibreria;

import utilidades.teclado;

public class CodificarFraseEnASCII {
	
	public static void main(String[] args) {
		
		String f1, f2 = "", c;
		int i, p;
		
		//entrada
		
		f1 = utilidades.teclado.leer_cadena("Introduzca la frase para codificar: ");//aqui utilizamos uno de los metodos que tiene nuestra libreria
		
		//proceso
		
		p = 0;
		
		f1 = f1.trim();
		for (i = 0; i < f1.length (); i++) {
			
			c = f1.substring(i, i + 1);
			if (!c.equals(" ")) {
				
				c = String.valueOf((char)(c.codePointAt(0) + 1));
				
			}
			
			f2 += c;
			
		}
		
		//salida
		
		System.out.println("La frase codificada es: " + f2);
		
	}
	
}
