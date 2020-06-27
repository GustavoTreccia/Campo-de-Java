package w.visitor;

public class Leao implements Animal {
	public void emitirSom() {
		System.out.println("ROAR");
	}
	
	public void atacar() {
		System.out.println("...");
	}

	public void accept(Zoo z) {
		z.inspecionar(this);
	}
}
