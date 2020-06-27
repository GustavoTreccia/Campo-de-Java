package w.visitor;

public class ZooB implements Zoo {

	public void inspecionar(Elefante e) {
		System.out.println("Elefante inspecionado pelo ZooB");
		e.emitirSom();
	}


	public void inspecionar(Leao l) {
		System.out.println("Leao inspecionado pelo ZooB");
		l.emitirSom();
	}
}
