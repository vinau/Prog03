import java.util.Scanner;
public class Ejercicio_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado= new Scanner (System.in);
		int A,B,contador,resultado;
		
		
		System.out.print ("Ingrese el valor A:");
		A = teclado.nextInt();
		
		System.out.print ("Ingrese el valor B:");
		B = teclado.nextInt();
		
		resultado=0;
		contador=A+1;
		
		while (contador<=B-1) {
			resultado=resultado+contador;
			contador=contador+1;
			System.out.println(contador);
		}
		
		
		
	}

}
