package Practica1;

import java.time.Year;
import java.util.Collection;
import java.util.ArrayList;
import java.net.URI;
import java.net.URISyntaxException;
import java.sql.Time;

enum Genero {
	 DRAMA, ROMANCE,OMEDIO,ACCION, TERROR,AVENTURA,SCI_FI;
}

public class Pelicula {
	private String titulo;
	private Year agno;
	private String sinopsis;
	private Genero genero;
	private String pais;
	public Trailer trailer;
	public Collection actor = new ArrayList<Persona>();
	public Collection director = new ArrayList<Persona>();
	public Collection productor = new ArrayList<Persona>();
	public Collection guionista = new ArrayList<Persona>();
	
	public Pelicula(String titulo, Year agno, String sinopsis,Genero genero, String pais) throws URISyntaxException {
		this.titulo = titulo;
		this.agno = agno;
		this.sinopsis = sinopsis;
		this.genero = genero;
		this.pais = pais;
		trailer = new Trailer(new URI("www.google.com"), new Time(5));
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Year getAgno() {
		return agno;
	}

	public void setAgno(Year agno) {
		this.agno = agno;
	}

	public String getSinopsis() {
		return sinopsis;
	}

	public void setSinopsis(String sinopsis) {
		this.sinopsis = sinopsis;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

}