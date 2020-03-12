package Practica2;

import java.sql.Date;
import java.util.Collection;
import java.util.TreeSet;

public class Director extends Persona {

	public Collection peliculas = new TreeSet();
	
	public Director(String nombre , String apellido, Date fechaNacimiento, String nacionalidad) {
		super(nombre,apellido,fechaNacimiento,nacionalidad);
	}
}
