package w.decorator;

public class Chantily extends CafeDecorator {
	public Chantily(double preco) {
        super(preco);
    }
    //CHAMADA "RECURSIVA"
    public String toString() {
        return this.getProx().toString() + " C/ CHANTILY";
    }
    
    public double getPreco() {
        return super.getPreco() + this.getProx().getPreco() + 0.01;
    }
}
