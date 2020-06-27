package w.singleton;

public class Teste {
	public static void main (String[] args) {
        Quarta q1 = Quarta.getInstancia();
        Quarta q2 = Quarta.getInstancia();
        System.out.println(q1.getNumero());
        System.out.println(q2.getNumero());
        System.out.println(q1);
        System.out.println(q2);
        System.out.println(DiaEnum.QUARTA);
        System.out.println(DiaEnum.QUARTA.getNumero());
    }
}
