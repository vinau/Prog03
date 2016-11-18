/*
 * Se define el factorial de un número N como N*(N-1)*(N-2)*.......*3*2*1.
 *  Hacer un programa que lea un número N filtrando que debe ser mayor que cero y calcule su factorial.
 */


import java.util.Scanner;
public class Ejercicio_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado= new Scanner (System.in);
		
		int numero,operacion;
		
		System.out.println ("Ingrese un número");
		numero= teclado.nextInt ();
		
		operacion=1;
		
		while (numero>0) {
			operacion=operacion*numero;
			numero--;
					}
		System.out.println (operacion);
			}
		
	
		
		
			}

			
	


