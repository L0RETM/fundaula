package claseAbstracta;

public class Cuadrado extends FiguraGeometrica {
	
	
	//constante 
	private final int NUM_LADOS_IGUALES=4;
	
	//atributo
	private double lado;
	
	//metodo getter y setter del atributo
	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}


	@Override
	public double calcularArea() {
		//creo una variable que almacena la formula
		double area = Math.pow(lado, 2);
		return area;
	}

	
	@Override
	public double calcularPerimetro() {
		// creo una variable para el calculo
		double perimetro= lado * NUM_LADOS_IGUALES;
		return perimetro;
	}

}
