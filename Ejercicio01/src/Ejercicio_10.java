/*
 * Dado un numero N leído por teclado encontrar el numero P primo mas cercano a él por exceso.
 */
import java.util.Scanner;;
public class Ejercicio_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado= new Scanner (System.in);
		
		int numero,divisor=2;
		boolean esPrimo=true;
		
		System.out.println ("Ingrese un número");
		numero= teclado.nextInt ();
		
		numero++;
				
		while (esPrimo && divisor <numero){
			
			esPrimo=numero%divisor !=0;
			divisor++;
		}
		
		while(esPrimo==false){
			
			numero++;
			
			while (esPrimo && divisor <numero){
				
				esPrimo=numero%divisor !=0;
				divisor++;
			}
		}
		
			if (esPrimo==true){
			
			System.out.println("el número"+numero+"es primo");
			
		}
		
	}
	
}