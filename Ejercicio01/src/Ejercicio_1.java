//Escribir un programa que calcule e imprima la suma de los números enteros comprendidos entre A y B 
//que deben leerse por teclado y filtrarse para que A<=B. Los valores de A y B no deben incluirse en la suma.

import java.util.Scanner;
public class Ejercicio_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado= new Scanner (System.in);
		int a,b,indice,resultado;
		
		
		System.out.print ("Ingrese el valor A:");
		a = teclado.nextInt();
		
		System.out.print ("Ingrese el valor B:");
		b = teclado.nextInt();
		
		
		resultado = 0;
		indice = a+1;
			
				while (indice<=b-1) {
					resultado = resultado + indice;
					indice = indice +1;
					
					
					
				}
				System.out.println(resultado);
		}
		
	

}
