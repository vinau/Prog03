/*
Dado un numero N imprimir la lista de todos los numero primos hasta dicho numero N.
*/
import java.util.Scanner;
public class Ejercicio_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado= new Scanner (System.in);
		
		int numero,divisor=2;
		boolean esPrimo=true;
		
		System.out.println("Introduzca un número");
		numero= teclado.nextInt();
		numero--;
		
		while(numero>2){
		while (esPrimo && divisor <numero){
			
			
			esPrimo=numero%divisor !=0;
			divisor++;

		}
		
		if (esPrimo==true){
			
			System.out.println(numero);
		divisor=2;
		numero--;
		}
		else
			
			esPrimo=true;
		divisor=2;
		numero--;
		}
	}
}
