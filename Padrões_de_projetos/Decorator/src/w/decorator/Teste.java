package w.decorator;

public class Teste {
	public static void main(String[] args) {
        CafeExpresso c = new CafeExpresso(5);
        Chantily k = new Chantily(0.10);
        Canela q = new Canela(0.30);
        
        //CANELA -> CHANTILY -> CAFE
        //RODEM NO DEBUG
        q.setProx(k);
        k.setProx(c);
        
        System.out.println(q);
        System.out.printf("%.2f\n",q.getPreco());
        
        System.out.println(k);
        System.out.printf("%.2f\n",k.getPreco());
        
        System.out.println(c);
        System.out.println(c.getPreco());
    }
}	
