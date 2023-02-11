package ClasesaObjetos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class listadoPersonas {

	public static void main(String[] args) {
		
		//instanciamos lista de personas
		Persona alex = new Persona("Alex","Muñoz","Velasco","12.345.678-L",25);
		Persona ana = new Persona("Ana","Gil","Gil","12.345.678-L",55);
		Persona erik = new Persona("Erik","Muñoz","Velasco","12.345.678-L",34);
		Persona sara = new Persona("Sara","Sanz","Perez","12.345.678-L",48);

		//creamos una lista personas,importamos java util=arrayslis y list
		List<Persona> listadoPersonas = new ArrayList<Persona>();
		listadoPersonas.add(alex);
		listadoPersonas.add(ana);
		listadoPersonas.add(erik);
		listadoPersonas.add(sara);

		//muestra la lista persona ,foreach
		//lista sin ordenar
		
		for (Persona persona : listadoPersonas) {
			System.out.println(persona);
			}
			
		//ordena la coleccion con metodo comparable
		
		Collections.sort(listadoPersonas);
		for (Persona persona : listadoPersonas) {
			System.out.println(persona);
			}
		}
	}


