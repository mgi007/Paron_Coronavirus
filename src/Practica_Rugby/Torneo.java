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
	
}
