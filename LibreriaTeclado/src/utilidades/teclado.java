package utilidades;
// Esta es la forma indicada para leer desde consola a partir de la versi�n Java 1.5
// importar la clase Scanner
import java.util.Scanner;

public class teclado {

	
	public static int leer_entero (String mensaje, int min, int max) {
		int n = 0;
		do {
			n = leer_entero(mensaje);
			if(n < min || n > max) {
				System.out.println("Debe introducir un numero entre "+min+" y "+max);
			}else {
				return n;
			}
		} while (true);
	}
	
	public static int leer_entero (String mensaje) {
		// crea objeto entrada de la clase Scanner para obtener la entrada de la terminal de comandos
		Scanner entrada = new Scanner (System.in);		
				
		int num1 = 0;		
		
		System.out.print (mensaje);

		// nos aseguramos de controlar posibles errores en la lectura
		try {
			num1 = entrada.nextInt();
		}
		// mostramos mensaje de error en caso de lectura incorrecta (p.e leer una letra en vez de un n�) 
		catch (Exception e){
			System.err.println ("Error de lectura del n�mero. C�digo de error = " + e);
	    e.printStackTrace();
			System.exit(1);
		}			
		
 		return num1;
	} // fin leer entero
	
	public static String leer_cadena (String mensaje) {
		// ************* LEER CADENAS DE CARACTERES con nextLine de Scanner, FALLA a veces **********
		// OjO!!! puede que te falle la lectura de texto,
		// al leer muchas veces (si el buffer de entrada se llena)
		
		// crea objeto entrada de la clase Scanner para obtener la entrada de la terminal de comandos
		Scanner entrada = new Scanner (System.in);		
		
		String texto="";
		
		System.out.print (mensaje);
		// nos aseguramos de controlar posibles errores en la lectura
		try {
			texto = entrada.nextLine();
		}		
		// mostramos mensaje de error en caso de lectura incorrecta 
		catch (Exception e){
			System.err.println ("Error de lectura del n�mero. C�digo de error = " + e);
	    e.printStackTrace();
			System.exit(1);
		}			
		
		return texto;
	
	}// fin leer_cadena
	

	
	

	public static void main (String args[]) {	
	
		String cadena = leer_cadena ("Introduce una cadena2: ");		
		System.out.println ("La cadena leida es: " + cadena);	
	
		String palabras = leer_cadena ("Introduce una cadena: ");		
		System.out.println ("La cadena leida es: " + palabras);	
		
		int numero = leer_entero ("Introduce un n�mero: ");
		System.out.println ("El n�mero leido es: " + numero);			
			
	} // fin m�todo main
	
} // fin clase teclado
