
package java.negocio;

/**
 *
 * @author Davi Reis <davi@davi.pro.br>
 */
public class Adicao implements ICalculo{

    private float valor1, valor2;

//    public void setValor1(float valor1) { this.valor1 = valor1; }
//    public void setValor2(float valor2) { this.valor2 = valor2; }

    public Adicao(float valor1, float valor2) {
        this.valor1 = valor1;
        this.valor2 = valor2;
    }
    
    @Override
    public float calcular() {
        return valor1 + valor2; 
    }
    
}
