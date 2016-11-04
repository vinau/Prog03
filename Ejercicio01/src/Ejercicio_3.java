//Escribir un programa que una vez que lea un número N por teclado calcule
//y escriba sus divisores por la pantalla (sin incluirse a si mismo).

import java.util.Scanner;
public class Ejercicio_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado= new Scanner (System.in);
		int n,divisor;
		
		System.out.print ("Ingrese un numero:");
		n = teclado.nextInt();
		
		divisor=1;
		while (divisor<n) {
			if (n%divisor==0) {
				
				System.out.println(divisor);
					
		}
		
		divisor++;	
			
		
	}

	}
}
