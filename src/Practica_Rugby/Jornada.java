package Practica_Rugby;

import java.sql.Date;
import java.util.ArrayList;

public class Jornada {
	
	private Date fecha;
	
	public java.util.Collection partidos = new ArrayList<Partido>();
	
	public Jornada(Date fecha) {
		this.fecha = fecha;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	
}
