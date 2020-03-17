package Practica_Rugby;


enum Pais {
	 ESCOCIA,FRANCIA,GALES,INGLATERRA,IRLANDA,ITALIA;
}

public class Equipo {
	
	private Pais nombre;
	

	public Equipo(Pais nombre) {
		this.nombre = nombre;
	}

	
	public Pais getNombre() {
		return nombre;
	}

	public void setNombre(Pais nombre) {
		this.nombre = nombre;
	}

}
