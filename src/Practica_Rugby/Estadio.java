package Practica_Rugby;

import java.util.ArrayList;

public class Estadio {

	private String nombre;
	private int capacidad;
	private String ciudad;
	
	public Equipo equipo;
	
	public java.util.Collection partidos = new ArrayList<Partido>();
	
	public Estadio(String nombre, int capacidad, String ciudad, Equipo equipo) {
		this.nombre = nombre;
		this.capacidad = capacidad;
		this.ciudad = ciudad;
		this.equipo = equipo;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getCapacidad() {
		return capacidad;
	}
	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	
	
}
