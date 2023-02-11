package estructurasControl;

import java.util.Scanner;

public class Ejercicio3 {
	//comprobar si el numero es mayor que 0 
	//muestra un mensaje u otro

	public static void main(String[] args) {
		
		Scanner teclado =new Scanner(System.in);
		
		//creamos una variable
		int numero;
		
		//con el booleano se ejecutara tantas veces hasta que
		//sea false
		boolean incorrecto=true;
		
		
		//do while hago la condicion
		//if else compruebo la condicion
		do {
			System.out.println("introduce un numero");
			numero=teclado.nextInt();
			if (numero > 0) {
				System.out.println("el numero es correcto");
				incorrecto=false;
				
			} else {
				System.out.println("el numero es incorrecto");

			}
				
		} while (incorrecto);

	}

}
