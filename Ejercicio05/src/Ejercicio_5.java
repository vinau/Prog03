//Hacer un programa que lea una serie de números
//por teclado de manera que cuando el número leído sea el cero ya no se introduzcan más, 
//el programa debe calcular y escribir la suma de los números de la serie y cuántos se han introducido en total.
import java.util.Scanner;
public class Ejercicio_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado= new Scanner (System.in);
		
		int numero,suma,contador;
		
		
		System.out.print ("Ingrese un numero:");
		numero = teclado.nextInt();
		contador=0;
		suma=numero;
		while (numero!=0) {
			System.out.print ("Ingrese un numero:");
			numero = teclado.nextInt();
				suma=numero+suma;
				contador=contador+1;
			
			
			
		}
		
		System.out.println("La suma de los numeros es: " + suma);
		System.out.println("Has introducido: " + contador + " numeros");
	}

}
