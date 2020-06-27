
public class Class3 {
	private Class2 cl;
	   
    public Class3() {
        cl = new Class2();
    }
   
    public void outraCoisa(int y) {
        try {
            cl.algo(y);
            System.out.println("SOH EXECUTA SE A PRIMEIRA N DER ERRO");
            System.out.println("ISSO É, SE O NÚMERO FOR DIFERENTE DE ZERO");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Deu erro mesmo");
        }
    }
}
