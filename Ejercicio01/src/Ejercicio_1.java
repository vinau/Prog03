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
