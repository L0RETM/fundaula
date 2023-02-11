package claseAbstracta;

public class Calculo {
	
	//creamos una constante 
	private final static double LADOS_CUADRADO=2.0;

	public static void main(String[] args) {
		//instanciamos un cuadrado
		Cuadrado cuadrado=new Cuadrado();
		
		//metodo set damos valor al atributo
		cuadrado.setLado(LADOS_CUADRADO);
		
		//calculamos y mostramos  el area y el perimetro
		System.out.println("el area de  cuadrado es "+ cuadrado.calcularArea());
		System.out.println("el perimetro del cuadrado es "+ cuadrado.calcularPerimetro());
	}

}
