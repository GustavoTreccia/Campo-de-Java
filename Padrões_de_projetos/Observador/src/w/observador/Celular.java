package w.observador;

public class Celular implements Observer{

	public void update(ConcreteSubject subject) {
        System.out.println("Celular informa a hora: " + subject.getEstado().getHora());
        System.out.println("Celular informa a cotaçao: " + subject.getEstado().getPreco());
    }
}
