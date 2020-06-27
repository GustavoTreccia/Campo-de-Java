package w.observador;

public class ConcreteSubject extends Subject{
	
	private Estado estado;

    public Estado getEstado() {
        return estado;
    }
    
    public void setEstado(Estado estado) {
        this.estado = estado;
        notificar();
    }
}
