package w.observador;

public class Teste {
	public static void main(String[] args) {
		Site s = new Site();
		Celular c = new Celular();
		ConcreteSubject cs = new ConcreteSubject();
		cs.anexar(s);
		cs.anexar(c);
		cs.setEstado(new Estado(5.8,12));
		cs.setEstado(new Estado(5.84,13));
		
	}
}
