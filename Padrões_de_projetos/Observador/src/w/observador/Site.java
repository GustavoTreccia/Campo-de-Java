package w.observador;

public class Site implements Observer{
	public void update(ConcreteSubject subject) {
        System.out.println("Site informa a hora: " + subject.getEstado().getHora());
        System.out.println("Site informa a cotaçao: " + subject.getEstado().getPreco());
    }
}
