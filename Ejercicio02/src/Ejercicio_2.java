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
		int n,contador,multiplicacion;
		
		
		System.out.print ("Ingrese un numero:");
		n = teclado.nextInt();
		System.out.println("Tabla de multiplicar de " + n);
		
		for (contador=1;contador<11;contador++)
		while (n>0 && n<=100) {
			multiplicacion=n*contador;
			System.out.println(n +  " x " + contador + " = " + multiplicacion);
			break;
			
			
		}
	}

}
