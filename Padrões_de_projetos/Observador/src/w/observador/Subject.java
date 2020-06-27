package w.observador;

import java.util.ArrayList;
public class Subject {

private ArrayList<Observer> observadores;
    
    public Subject() {
        observadores = new ArrayList<Observer>();
    }
    
    public void anexar(Observer o) {
        observadores.add(o);
    }
    
    public void desanexar(Observer o) {
        observadores.remove(o);
    }
    
    public void notificar() {
        for (Observer observer : observadores) {
        	observer.update((ConcreteSubject) this);
        }
    }
}
