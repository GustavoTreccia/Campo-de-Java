package w.adapater;

public class Teste {
	public static void main(String[] args) {
        Pato p1 = new PatoVerde();
        p1.voar();
        p1.grasnar();
        p1.nadar();
        Pato p2 = new PatoBranco();
        p2.voar();
        p2.grasnar();
        p2.nadar();
        Pato pp = new PatoAdapter(new Peru());
        pp.voar();
        pp.grasnar();
        pp.nadar();
    }
}
