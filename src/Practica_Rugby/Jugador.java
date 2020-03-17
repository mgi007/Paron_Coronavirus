package Practica_Rugby;

import java.sql.Date;


enum Posicion {
	 PILIER,TALONADOR,SEGUNDA_LINEA,TERCERA_LINEA,MEDIO_MELE,APERTURA,CENTRO,ALA,ZAGUERO;
}


public class Jugador extends Persona {
	
	private Posicion posicion;

	private boolean capitan;
	
	public Equipo equipo;
	

	public Jugador(String nombre, Date fechaNacimiento, Posicion posicion, Equipo equipo) {
		super(nombre,fechaNacimiento);
		this.posicion = posicion;
		this.equipo = equipo;
	}	
	
	public Posicion getPosicion() {
		return posicion;
	}

	public void setPosicion(Posicion posicion) {
		this.posicion = posicion;
	}

	public boolean isCapitan() {
		return capitan;
	}

	public void setCapitan(boolean capitan) {
		this.capitan = capitan;
	}

}
