package Practica2;

import java.util.*;
import java.sql.Date;

public class Productor extends Persona{
	
	public Collection peliculas = new TreeSet();

	public Productor(String nombre , String apellido, Date fechaNacimiento, String nacionalidad) {
		super(nombre,apellido,fechaNacimiento,nacionalidad);
	}
	
}
