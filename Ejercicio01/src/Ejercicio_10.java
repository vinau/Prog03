/*
 * Dado un numero N le�do por teclado encontrar el numero P primo mas cercano a �l por exceso.
 */
import java.util.Scanner;;
public class Ejercicio_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado= new Scanner (System.in);
		
		int numero, divisor,comprobador;
		
		System.out.println ("Ingrese un n�mero");
		numero= teclado.nextInt ();
								
		numero++;
		
		comprobador=0;
		
		while(comprobador!=2){


		for(divisor=1;divisor<(numero+1);divisor=divisor+1){	
		
		}
			if(numero%divisor==0){								

				comprobador=comprobador+1;
				
				if (comprobador==2){
					System.out.println("el numero "+numero+" no es primo");
			}
			}
		
		}
		if(comprobador!=2){										
		}else{
			System.out.println("El n�mero "+numero+" es primo");
			
		}
		
		
	}

}

