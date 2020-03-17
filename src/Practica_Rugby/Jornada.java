package Practica_Rugby;

import java.sql.Date;

public class Jornada {
	
	private Date fecha;
	
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
