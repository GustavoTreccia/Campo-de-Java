package w.visitor;
import java.util.ArrayList;
public class ObjStructure {
	private ArrayList<Animal> anis;
	private ArrayList<Zoo> zoos;
	
	public ObjStructure() {
		anis = new ArrayList<Animal>();
		zoos = new ArrayList<Zoo>();
	}
	
	public void addAnimal(Animal a) {
		anis.add(a);
	}
	
	public void addZoo(Zoo z) {
		zoos.add(z);
	}
	
	public void traverse() {
		//ESSE METODO SOH POSSIVEL COM 
		//O DD.
		for(Animal a : anis) {
			for(Zoo z: zoos) {
				a.accept(z);
			}
		}
	}
	
}
