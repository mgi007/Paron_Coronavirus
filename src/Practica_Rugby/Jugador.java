package Practica_Rugby;

import java.sql.Date;


enum Posicion {
	 PILIER,TALONADOR,SEGUNDA_LINEA,TERCERA_LINEA,MEDIO_MELE,APERTURA,CENTRO,ALA,ZAGUERO;
}


public class Jugador extends Persona {
	
	Posicion posicion;
	
	public Jugador(String nombre, Date fechaNacimiento, Posicion posicion) {
		super(nombre,fechaNacimiento);
		this.posicion = posicion;
	}

}
