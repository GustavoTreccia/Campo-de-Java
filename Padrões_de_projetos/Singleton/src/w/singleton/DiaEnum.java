package w.singleton;

public enum DiaEnum {
	 	DOMINGO(1), 
	    SEGUNDA(2), 
	    TERCA(3), 
	    QUARTA(4), 
	    QUINTA(5), 
	    SEXTA(6), 
	    SABADO(7);
	    
	    private int numero;
	    private DiaEnum(int numero) {
	        this.numero = numero;
	    }
	    
	    public int getNumero() {
	        return numero;
	    }
}
