
public class Class2S {
	private Class1 cl;
	public Class2S() {
        cl = new Class1();
    }
    
    public void algo(int z) throws Exception {
        System.out.println("Verificando numero: ");
        cl.foo(z);
        System.out.println("Fim...");
    }
}
