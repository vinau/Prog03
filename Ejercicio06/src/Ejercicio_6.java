/**Hacer un programa que vaya leyendo números por el teclado hasta que lea el cero, que indicará 
el fin de la entrada de datos. El programa debe calcular y escribir 
la suma de los números introducidos en lugar par y de los introducidos en lugar impar,
es decir los introducidos primero, tercero, quinto, etc. y la suma de los introducidos segundo, cuarto, sexto, etc.*/
import java.util.Scanner;


public class Ejercicio_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado= new Scanner (System.in);
		
		int numero,sumapar,sumainpar;
		
		
		System.out.print ("Ingrese un numero:");
		numero = teclado.nextInt();
		sumainpar=numero;
		
		System.out.print ("Ingrese un numero:");
		numero = teclado.nextInt();
		sumapar=numero;
		while (numero!=0) {
			
			System.out.print ("Ingrese un numero:");
			numero = teclado.nextInt();
			sumainpar=sumainpar + numero;
			
			System.out.print ("Ingrese un numero:");
			numero = teclado.nextInt();
			sumapar=sumapar + numero;

		
	}
		System.out.println(sumainpar);
		System.out.println(sumapar);	
	}
}


/** 
public class Ejercicio_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado= new Scanner (System.in);
		
		int numero,contador1,contador2,suma;
		
		
		System.out.print ("Ingrese un numero:");
		numero = teclado.nextInt();
		
		while (numero!=0) {
			
			
			
			
		
		
		
		
	}
		
	System.out.print();
	}
}
*/