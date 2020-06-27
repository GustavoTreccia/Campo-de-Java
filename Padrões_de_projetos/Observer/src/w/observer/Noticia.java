package w.observer;

public class Noticia {
	private String evento;
	private String astro;
	private double hora;
	
	public Noticia(String evento, String astro, double hora) {
		this.evento = evento;
		this.astro = astro;
		this.hora = hora;
	}

	public String getEvento() {
		return evento;
	}
	
	public String getAstro() {
		return astro;
	}

	public double getHora() {
		return hora;
	}
	
	public void mudarNoticia(String evento, String astro,  double hora) {
		if(hora > 0 && evento != "") {
			this.hora = hora;
			this.astro = astro;
			this.evento = evento;
		}
	}
}
