package Practica_Rugby;

import java.util.ArrayList;

enum Pais {
	 ESCOCIA,FRANCIA,GALES,INGLATERRA,IRLANDA,ITALIA;
}

public class Equipo {
	
	private Pais nombre;
	
	public Entrenador esEntrenadoPor;
	
	public java.util.Collection jugadores = new ArrayList<Jugador>();
	
	public Estadio estadio;
	
	public java.util.Collection partidos = new ArrayList<Partido>();

	public Equipo(Pais nombre, Entrenador esEntrenadoPor, Estadio estadio) {
		this.nombre = nombre;
		this.esEntrenadoPor = esEntrenadoPor;
		this.estadio = estadio;
	}

	
	public Pais getNombre() {
		return nombre;
	}

	public void setNombre(Pais nombre) {
		this.nombre = nombre;
	}

}
