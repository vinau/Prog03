/*
 * Realizar un programa que elija mediante un menú un tipo de figura:
 Triángulo
 Cuadrado
 Rectángulo
Una vez elegida la opción nos pida en cada caso los datos necesarios para calcular su área y nos la muestre.
 * 
 * 
*/
import java.util.Scanner;
public class Ejercicio_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner (System.in);
		
		int numero;
		
		System.out.println("Introduzca 1,2, o 3 segun lo que desee: Triangulo(1), Cuadrado(2), Rectángulo(3)");
		numero=teclado.nextInt();
	
		if (numero==1){
			
			int base,altura,area;
			
			System.out.println("Introduzca la base del triángulo:");
			base=teclado.nextInt();
			
			System.out.println("Introduzca la altura del triángulo:");
			altura=teclado.nextInt();
			
			area=base*altura/2;
			
			System.out.println("El área del triángulo es: "+ area);
		}
	
		if (numero==2){
			
			int lado,area;
			
			System.out.println("Introduzca el lado del cuadrado:");
			lado=teclado.nextInt();
			
			area=lado*lado;
			
			System.out.println("El área del cuadrado es: "+area);
			
		}
		
		if (numero==3){
			
			int base,altura,area;
			
			System.out.println("Introduzca la base:");
			base=teclado.nextInt();
					
			System.out.println("Introduzca la altura:");
			altura=teclado.nextInt();
			
			area=base*altura;
			
			System.out.println("El área del rectángulo es:"+area);
		}		
	}
}
