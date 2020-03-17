package Practica_Rugby;

import java.sql.Date;

public class Entrenador extends Persona {
	
	public Equipo entrena;
	
	public Entrenador(String nombre, Date fechaNacimiento, Equipo entrena) {
		super(nombre,fechaNacimiento);
		this.entrena = entrena;
	}

}
