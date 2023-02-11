package herencia;

public class Empresa {

	public static void main(String[] args) {
		//instanciamos objeto empleado
		Empleado empleado=new Empleado();
		
		//asignamos atributos
		empleado.setNombre("Rebeca");
		empleado.setPrimerApellido("velasco");
		empleado.setSegundoApellido("gonzalez");
		empleado.setDni("77798336p");
		empleado.setEdad(30);
		empleado.setAntiguedad(20);
		empleado.setPuesto("jefe");
		empleado.setSalario(1800.0);
		
		//mostramos informacion antes
		System.out.println(empleado);
		
		//actualizamos salario
		empleado.actualizarSalario(150.0);
		
		//mostramos despues
		System.out.println(empleado);

	}

}
