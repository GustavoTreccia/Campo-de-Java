
public class Class2SS {
	private Class1 cl;
	public Class2SS() {
        cl = new Class1();
    }
    
    public void algo(int z) throws Exception {
        System.out.println("Verificando numero: ");
        cl.foo(z);
        System.out.println("Fim...");
    }
}
