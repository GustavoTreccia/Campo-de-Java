package w.singleton;

public class Quarta extends Dia{
private static Quarta instancia;
    
    private Quarta() {
        super(4);
    }
    
    public static Quarta getInstancia() {
        if (instancia == null) {
            instancia = new Quarta();
            return instancia;
        }else {
            return instancia;
        }
    }
}
