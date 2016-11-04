/**Leer un número N que debe filtrarse entre 1 y 100
 * y a continuación calcular y escribir la tabla de multiplicar de ese número con el siguiente formato:
 * 
 * TABLA DE MULTIPLICAR DE 8
8 * 1 = 8
8 * 2 = 16
8 * 3 = 24
......
.....
8 * 10 = 80
*/
import java.util.Scanner;
public class Ejercicio_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado= new Scanner (System.in);
		int n;
		
		
		System.out.print ("Ingrese un numero:");
		n = teclado.nextInt();
		
		while (n>0 && n<=100) {
			System.out.println("Tabla de multiplicar de " + n);
			System.out.println(n + " x 1 = " + n*1);
			System.out.println(n + " x 2 = " + n*2);
			System.out.println(n + " x 3 = " + n*3);
			System.out.println(n + " x 4 = " + n*4);
			System.out.println(n + " x 5 = " + n*5);
			System.out.println(n + " x 6 = " + n*6);
			System.out.println(n + " x 7 = " + n*7);
			System.out.println(n + " x 8 = " + n*8);
			System.out.println(n + " x 9 = " + n*9);
			System.out.println(n + " x 10 = " + n*10);
			break;
			
			
		}
	}

}
