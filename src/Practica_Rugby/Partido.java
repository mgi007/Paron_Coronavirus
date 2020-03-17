package Practica_Rugby;

public class Partido {

	private int puntosLocal;
	private int puntosVisitante;
	private int bonusLocal;
	private int bonusVisitante;
	
	public Arbitro esArbitradoPor;
	
	public Equipo local;
	
	public Equipo visitante;
	
	public Estadio estadio;
	
	public Partido(int puntosLocal, int puntosVisitante, int bonusLocal, int bonusVisitante, Arbitro esArbitradoPor, Equipo local, Equipo visitante, Estadio estadio) {
		this.puntosLocal = puntosLocal;
		this.puntosVisitante = puntosVisitante;
		this.bonusLocal = bonusLocal;
		this.bonusVisitante = bonusVisitante;
		this.esArbitradoPor = esArbitradoPor;
		this.local = local;
		this.visitante = visitante;
		this.estadio = estadio;
	}
	
	public int getPuntosLocal() {
		return puntosLocal;
	}
	public void setPuntosLocal(int puntosLocal) {
		this.puntosLocal = puntosLocal;
	}
	public int getPuntosVisitante() {
		return puntosVisitante;
	}
	public void setPuntosVisitante(int puntosVisitante) {
		this.puntosVisitante = puntosVisitante;
	}
	public int getBonusLocal() {
		return bonusLocal;
	}
	public void setBonusLocal(int bonusLocal) {
		this.bonusLocal = bonusLocal;
	}
	public int getBonusVisitante() {
		return bonusVisitante;
	}
	public void setBonusVisitante(int bonusVisitante) {
		this.bonusVisitante = bonusVisitante;
	}
}
