package Practica2;

import java.sql.Date;
import java.util.Collection;
import java.util.TreeSet;

public class Actor extends Persona {

	public Collection peliculas = new TreeSet();
	
	public Actor(String nombre , String apellido, Date fechaNacimiento, String nacionalidad) {
		super(nombre,apellido,fechaNacimiento,nacionalidad);
	}
}
