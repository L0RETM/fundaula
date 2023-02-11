package ClasesaObjetos;

//implementamos en comparable por la edad
public class Persona implements Comparable <Persona>{
	
	//atributos
	
	private String nombre;
	private String primerApellido;
	private String segundoApellido;
	private String dni;
	private int edad;
	
	//metodos
	
	//constructor vacio
	public Persona() {
		
	}
	
	//constructor copia
	//copia se pone clase ppral y nuevo objeto p
	public Persona(Persona p) {
		this.nombre= p.nombre;
		this.primerApellido= p.primerApellido;
		this.segundoApellido= p.segundoApellido;
		this.dni= p.dni;
		this.edad= p.edad;
		
	}
	//constructor con parametros
	public Persona( String nombre, String primerApellido,String segundoApellido,String dni,int edad ) {
		this.nombre= nombre;
		this.primerApellido= primerApellido;
		this.segundoApellido= segundoApellido;
		this.dni= dni;
		this.edad= edad;
	}
	//metodo getter/setter
	//boton derecho/source/generate getter and setter-elegir

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPrimerApellido() {
		return primerApellido;
	}

	public void setPrimerApellido(String primerApellido) {
		this.primerApellido = primerApellido;
	}

	public String getSegundoApellido() {
		return segundoApellido;
	}

	public void setSegundoApellido(String segundoApellido) {
		this.segundoApellido = segundoApellido;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	//obtener datos de la persona
	
	//parte 2 :
	//metodo tostring
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", primerApellido=" + primerApellido + ", segundoApellido="
				+ segundoApellido + ", dni=" + dni + ", edad=" + edad + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dni == null) ? 0 : dni.hashCode());
		return result;
	}
	//metodo equal :solo dni
	//source/generate equal
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		if (dni == null) {
			if (other.dni != null)
				return false;
		} else if (!dni.equals(other.dni))
			return false;
		return true;
	}

	//creara metodo compareto
	@Override
	public int compareTo(Persona persona) {
		
		return this.edad-persona.edad;
	}
	
	
	
	
	
	
}
