package w.visitor;

public class ZooA implements Zoo{

	public void inspecionar(Elefante e) {
		System.out.println("Elefante inspecionado pelo ZooA");
		e.emitirSom();
	}


	public void inspecionar(Leao l) {
		System.out.println("Leao inspecionado pelo ZooA");
		l.emitirSom();
	}
}
