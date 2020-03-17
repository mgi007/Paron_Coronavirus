package Practica_Rugby;

import java.sql.Date;

public class Torneo {
	
	private Date anno;

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
