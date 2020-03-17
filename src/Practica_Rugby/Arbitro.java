package Practica_Rugby;

import java.sql.Date;

public class Arbitro extends Persona {
	
	public Partido arbitra;
	
	public Arbitro(String nombre, Date fechaNacimiento, Partido arbitra) {
		super(nombre,fechaNacimiento);
		this.arbitra = arbitra;
	}

}
