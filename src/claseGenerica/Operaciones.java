package claseGenerica;


//N recibira un valor numerico
public class Operaciones <N extends Number>{
	
	//doubleValue convierte un entero en decimal
	double suma(N numero) {
		return numero.doubleValue() +2 ;
	}
	
	double resta(N numero) {
		return numero.doubleValue() -2 ;
	}
	
	double producto(N numero) {
		return numero.doubleValue() *2 ;
	}
	
	double division(N numero) {
		return numero.doubleValue() /2 ;
	}

}
