/* Escribir un programa que lea una secuencia de datos num�ricos de longitud indefinida,
 * de manera que cuando el n�mero sea el cero cesar� la entrada de dicha secuencia.
 * El programa debe imprimirnos la media de todos ellos, el mayor y el menor.*/
import java.util.Scanner;
public class Ejercicio_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado= new Scanner (System.in);

		int numero,max,min,contador,suma;
		
		System.out.println ("Ingrese un n�mero");
		numero= teclado.nextInt ();
		max=0;
		min=99999;
		contador=0;
		suma=0;
		
		if (numero>max) {
			max=numero;
		
		if (numero<=min) 
					min=numero;
		}
		while (numero!=0) {
			System.out.println ("Ingrese un n�mero");
			numero= teclado.nextInt ();
				if (numero!=0)  {
					suma=numero+suma;
					contador=contador+1;
					if (numero>max) {
						max=numero;
					
					if (numero<=min) 
								min=numero;
								
								
								
						}
				
					}
					
			
				
				}	
		System.out.println("Esta es la media = " + suma/contador);
		System.out.println("Este es el numero mayor = " + max);
		System.out.println("Este es el numero menor = " + min);
		
	}
}	
			
			
		
		
	



