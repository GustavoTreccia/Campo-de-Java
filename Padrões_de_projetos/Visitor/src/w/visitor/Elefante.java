package w.visitor;

public class Elefante implements Animal {
	@Override
	public void emitirSom() {
		System.out.println("FUUUUUUU");
	}
	
	public void quebrar() {
		System.out.println("Quebrou..");
	}

	@Override
	public void accept(Zoo z) {
		z.inspecionar(this);
	}

}
