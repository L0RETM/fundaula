package herencia;

public class Comercial extends Empleado {
	
	private double comision;
	
	//constuctor vacio
	public Comercial() {
		
	}
	
	//constructor copia
	//constructor parametros
	//metodos getter-setter

	public double getComision() {
		return comision;
	}

	public void setComision(double comision) {
		this.comision = comision;
	}
	
	
	
	//sobrecarga
	public void calcularComision(double incremento) {
		comision= comision+incremento;
	}
	
	public void calcularComision(double incremento, double plus) {
		comision= comision+incremento + plus;
	}
	//sobreescritura
	@Override
	public void actualizarSalario(double incremento) {
		
		//creamos una variable que recoja el salario actual
		double salarioActual = this.getSalario();
		
		//generamos un if donde presuntamos por esa antiguedad
		
		if(this.getAntiguedad()<=5) {
			calcularComision(25.0);
			
		}else {
			calcularComision(25.0 + 100.0);
		}
		
		//creamos una variable para recuperar la nueva comision
		double nuevaComision=comision;
		
		//actualizamos el salario
		this.setSalario(salarioActual+incremento+nuevaComision);
		
		
	}
	//metodo tostring
	
	@Override
	public String toString() {
		return super.toString() + "Comercial [comision=" + comision + "]";
	}
	
	
	
	
	
	
	

}
