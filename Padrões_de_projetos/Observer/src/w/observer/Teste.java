package w.observer;

public class Teste {
	public static void main(String[] args) {
        Paparazzi p = new Paparazzi();
        Fa f = new Fa();
        ConcreteSubject  cs = new ConcreteSubject();
        cs.anexar(p);
        cs.anexar(f);
        cs.setNoticia(new Noticia("Noticia sobre o astro ", "É astro",13.00));
        f.update(cs);
        p.update(cs);
        //O abstract na classe Subject impede:
        //Subject ss = new Subject();
        //ss.anexar(s);
        //ss.notificar();

 

    }
}
