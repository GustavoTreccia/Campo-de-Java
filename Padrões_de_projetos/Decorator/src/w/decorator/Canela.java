package w.decorator;

public class Canela extends CafeDecorator {
	public Canela(double preco) {
        super(preco);
    }
    //CHAMADA "RECURSIVA"
    public String toString() {
        return this.getProx().toString() + " C/ CANELA";
    }
    
    public double getPreco() {
        return super.getPreco() + this.getProx().getPreco() + 0.02;
    }
}
