package ClasesaObjetos;

import java.util.Scanner;

public class AppPersonas {

	public static void main(String[] args) {
		//2.-creamos objetos scanner donde recogemos infomacion
		//de consola
		//IMPORTAMOS LA CLASE JAVA UTIL
		Scanner consola=new Scanner(System.in);
		
		//1.-creamos objeto tipo persona
		Persona individuo= new Persona();
		
		//MUESTRA VALORES con el set
		System.out.println("introduce nombre");
		individuo.setNombre(consola.next());
		
		System.out.println("primer apellido");
		individuo.setPrimerApellido(consola.next());
		
		System.out.println("segundo apellido");
		individuo.setSegundoApellido(consola.next());
		
		System.out.println("dni");
		individuo.setDni(consola.next());
		
		System.out.println("edad");
		individuo.setEdad(consola.nextInt());
		
		//muestra en consola
		System.out.println(individuo);
	}

}
