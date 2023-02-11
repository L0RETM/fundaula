package herencia;

import ClasesaObjetos.Persona;

public class Empleado extends Persona {
	
	//3 atributos nuevos, privados
	private int antiguedad;
	private double salario;
	private String puesto;
	
	//constructor vacio
	public Empleado() {
		
	}
	//constructor copia
	//constructor parametros
	//metodo getter y setter

	public int getAntiguedad() {
		return antiguedad;
	}

	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getPuesto() {
		return puesto;
	}

	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}
	
	//metodo tostring
	@Override
	public String toString() {
		return super.toString() + "Empleado [antiguedad=" + antiguedad + ", salario=" + salario + ", puesto=" + puesto + "]";
	}
	
	//metodo actualizar salario
	public void actualizarSalario(double incremento) {
		salario = salario + incremento;
		
	}

	

}
