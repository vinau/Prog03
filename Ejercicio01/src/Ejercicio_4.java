//Hacer un programa que lea un número N y nos escriba en la pantalla mediante un mensaje si es o no primo
//(NOTA: Número primo es aquél que es divisible solo por si mismo y por la unidad)

import java.util.Scanner;
public class Ejercicio_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado= new Scanner (System.in);
		
		int numero,divisor,comprobador;							//Aqui definimos numero, que sera el numero que introduzcamos
																//divisor que sera el número ntre el que dividamos
																//y comprobador que sera el
		
		comprobador=0;
		
		System.out.println("Inrese un número");
		numero= teclado.nextInt ();
		
		for(divisor=1;divisor<(numero+1);divisor=divisor+1){	//Esta linea define el divisor al valor 1, 
																//comprueba si es menor que el número +1 y si lo es									
																//suma uno al divisor
			
			if(numero%divisor==0){								//Esta línea divide el número entre el divisor y si
																// el resto es 0 se suma uno al comprobador.
										
				comprobador=comprobador+1;
				System.out.println("el comprobador es"+ comprobador);
			}
		}
		if(comprobador!=2){										
			
			System.out.println("No es Primo");
        }else{
            System.out.println("Si es Primo");
			
		}
	}
}

		/*
		 * FORMA DE HACERLO DE CRISTIAN
		 * 
		int n,a,i;
		a=0;
        System.out.println("Ingrese numero");
        n= teclado.nextInt();
        for(i=1;i<(n+1);i++){
        if(n%i==0){
            a++;
           }
        }
        if(a!=2){
             System.out.println("No es Primo");
           }else{
               System.out.println("Si es Primo");
        }
    }
		*/
	


