/*
 * Dado un numero N leído por teclado encontrar el numero P primo mas cercano a él por exceso.
 */
import java.util.Scanner;;
public class Ejercicio_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado= new Scanner (System.in);
		
		int numero, divisor=2,contador,contador2,suma;
		boolean Primo=false;
		
		
		System.out.println ("Introduzca un número:");
		numero = teclado.nextInt();
		
		suma=0;
		contador2=1;
		
		while (Primo==false) {
			suma=contador2+numero;
			contador=0;
		
			for (int incremento=1;incremento<=suma;incremento++) {
				if (suma%incremento==0)
					contador++;
			}
				if (contador==2) {
					Primo=true;
				}
				contador2++;
			}
		System.out.println ("El numero primo mas cercano es " + suma);
		}
	
			
		}
			

		
		
	
		
		
	
			
			
	
	
			
	

