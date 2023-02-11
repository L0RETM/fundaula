package herencia;

public class AppEmpresa {

	public static void main(String[] args) {
		Comercial jefeZona =new Comercial();
		
		jefeZona.setNombre("lucas");
		jefeZona.setPrimerApellido("guerrero");
		jefeZona.setSegundoApellido("arjona");
		jefeZona.setDni("77798336p");
		jefeZona.setEdad(42);
		jefeZona.setAntiguedad(12);
		jefeZona.setPuesto("jefe de zona");
		jefeZona.setSalario(2400.0);
		jefeZona.setComision(100.00);
		
		jefeZona.actualizarSalario(200.00);
		System.out.println(jefeZona);
		
		
	}

}
