//Hacer un programa que lea un número N y nos escriba en la pantalla mediante un mensaje si es o no primo
//(NOTA: Número primo es aquél que es divisible solo por si mismo y por la unidad)

import java.util.Scanner;
public class Ejercicio_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado= new Scanner (System.in);
		
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
			
			
		
		
	}


