package Practica_Rugby;

import java.sql.Date;
import java.util.ArrayList;

public class Torneo {
	
	private Date anno;
	
	public java.util.Collection jornadas = new ArrayList<Jornada>();
	
	public Torneo(Date anno) {
		this.anno = anno;
	}
	
	public Date getAnno() {
		return anno;
	}

	public void setAnno(Date anno) {
		this.anno = anno;
	}
	
	public void clasificacion() {
		/** 
		 * Comprueba el bonus que se ha llevado cada equipo en todos sus partidos y muestra los equipos 
		 * por pantalla ordenados de mayor a menor ordenados por el total de bonus obtenido.
		*/
	}
	
	public void ganador() {
	/**
	 * 	Comprueba el bonus que se ha llevado cada equipo en todos sus partidos y muestra por pantalla
	 * el equipo que haya conseguido el mayor bonus total. 
	 */
	}
	
}
