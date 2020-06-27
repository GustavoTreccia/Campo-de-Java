package w.decorator;

public abstract class CafeDecorator {

	private Cafe prox;
    
    public CafeDecorator(double preco) {
        super();
    }
    protected void setProx(Cafe prox) {
        this.prox = prox;
    }

    protected Cafe getProx() {
        return prox;
    }
}
