package w.observador;

public class Estado {

	private double preco;
    private int hora;
    
    public Estado(double preco, int hora) {
        this.preco = preco;
        this.hora = hora;
    }
    public double getPreco() {
        return preco;
    }
    public int getHora() {
        return hora;
    }
    public void mudarEstado(double preco, int hora) {
        if(hora > 0 && preco > 0) {
            this.hora = hora;
            this.preco = preco;
        }
            
    }
}
