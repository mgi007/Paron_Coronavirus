package Practica2;
import java.net.URI;
import java.sql.Time;
import java.util.Collection;
import java.util.TreeSet;

public class Trailer {
	private URI url;
	private Time duracion;
	public Collection editor = new TreeSet();
	
	public Trailer(URI url, Time duracion) {
		this.url = url;
		this.duracion = duracion;
	}
	
	public URI getUrl() {
		return url;
	}
	public void setUrl(URI url) {
		this.url = url;
	}
	public Time getDuracion() {
		return duracion;
	}
	public void setDuracion(Time duracion) {
		this.duracion = duracion;
	}
	public Collection getEditor() {
		return editor;
	}
	public void setEditor(Collection editor) {
		this.editor = editor;
	}
	
}
