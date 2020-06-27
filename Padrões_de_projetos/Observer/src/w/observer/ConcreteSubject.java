package w.observer;

public class ConcreteSubject extends Subject{
	
	private Noticia noticia;

	public Noticia getNoticia() {
		return noticia;
	}

	public void setNoticia(Noticia noticia) {
		this.noticia = noticia;
		notificar();
	}
	
	

}
