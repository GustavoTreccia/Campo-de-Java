package w.observer;

public class Fa implements Observer {
	public void update(ConcreteSubject subject) {
		System.out.println("Rockstar informa aos Fãs sobre o astro: " + subject.getNoticia().getAstro());
        System.out.println(subject.getNoticia().getEvento());
        System.out.println("Notica atualizada ás: " + subject.getNoticia().getHora() + " horas.");
    }
}
