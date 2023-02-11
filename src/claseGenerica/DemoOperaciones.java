package claseGenerica;

public class DemoOperaciones {

	public static void main(String[] args) {
		
		//intanciamos integer
		Operaciones <Integer> opI =new Operaciones <Integer>();

		//pasamos numero 5
		System.out.println("La suma es " + opI.suma(5));
		System.out.println("La resta es "+ opI.resta(5));
		System.out.println("La multiplicacion es " + opI.producto(5));
		System.out.println("La division es "+ opI.division(5));
		
		Operaciones <Double> opD =new Operaciones <Double>();
		
		//pasamos un double 12.34
		System.out.println("La suma es " + opD.suma(12.34));
		System.out.println("La resta es " + opD.resta(12.34));
		System.out.println("La multiplicacion es " + opD.producto(12.34));
		System.out.println("La division es " + opD.division(12.34));

	}

}
