/*Un número se dice que es perfecto cuando la suma de sus divisores propios –todos los divisores a excepción
 *  del propio número-, es igual a dicho número.
 *   Hacer un programa que lea un número y nos diga si es perfecto o no.
 */

import java.util.Scanner;
public class Ejercicio_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado= new Scanner (System.in);
		
		int numero,suma,divisor;
		
		System.out.println ("Ingrese un número");
		numero= teclado.nextInt ();
		
		suma=0;

			for (divisor=1;divisor<numero;divisor++) {
				if (numero%divisor==0)
					suma=suma+divisor;
			}
					if (suma==numero)
						System.out.println("El numero es perfecto");
					else 
						System.out.println("El numero no es perfecto");
			}
		
	
	}


