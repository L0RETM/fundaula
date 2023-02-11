package estructurasControl;

import java.util.Scanner;

public class Ejercicio1 {
	
	//: Desarrollar un programa que nos solicite un numero por teclado (el que queramos), y 
	//nos indique si es múltiplo de 5.

	public static void main(String[] args) {
		
		//CREO UN OBJETO TECLADO: CON EL CLASE SCANNER
		//IMPORTAMOS EL PAQUETE
		//System.in INTRODUCIMOS DATOS EN CONSOLA
		
		Scanner teclado =new Scanner(System.in);
		
		//creaamos una variable
		int numero;
		
		//donde vamos a introducir
		//syso control barra espaciadora
		
		System.out.println("introduce un numero");
		
		//recogemos esa variable
		//la guardamos en numero. debera ser int
		
		numero= teclado.nextInt();
		
		//comprobamos si es multiplo de 5, con el resto%
		if (numero % 5 == 0) {
			System.out.println("el numero es multiplo de 5");
			
		} else {
			System.out.println("el numero no es multiplo de 5");
		}

	}

}
