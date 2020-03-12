package Practica2;

import java.sql.Date;
import java.util.Collection;
import java.util.TreeSet;

public class Guionista extends Persona {
	
	public Collection peliculas = new TreeSet();
	
	public Guionista(String nombre , String apellido, Date fechaNacimiento, String nacionalidad) {
		super(nombre,apellido,fechaNacimiento,nacionalidad);
	}
}
