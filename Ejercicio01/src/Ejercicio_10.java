/*
 * Dado un numero N le�do por teclado encontrar el numero P primo mas cercano a �l por exceso.
 */
import java.util.Scanner;;
public class Ejercicio_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado= new Scanner (System.in);
		
		int numero, divisor=2;
		boolean esPrimo=true;
		
		System.out.println ("Introduzca un n�mero:");
		numero = teclado.nextInt();
		
		numero++;
		
		while (esPrimo && divisor <numero){
			
			esPrimo=numero%divisor !=0;
			divisor++;
			
		}
		
		if (esPrimo==true){
			
			System.out.println("el n�mero"+numero+"es primo");
			
		}
		
		if (esPrimo==false){
			
			//Aqui hay que repetir el proceso para que siga sumando al valor numero cada vez que esPrimo sea falso.
			boolean esPrimo2=true;
			esPrimo2=true;
			int divisor2=2;
			
			while (esPrimo2 && divisor2 <numero){
				
				numero++;
				
				esPrimo2=numero%divisor2 !=0;
				divisor2++;
				
			}
			
			if (esPrimo2==true){
				
				System.out.println("el n�mero"+numero+"primo");
				
		}
		
	}
}
}
