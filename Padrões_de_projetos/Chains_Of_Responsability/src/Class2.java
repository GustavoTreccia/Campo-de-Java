
public class Class2 {
private Class1 cl;
    
    public Class2() {
        cl = new Class1();
    }
    
    public void algo(int z) throws Exception {
        System.out.println("Verificando numero: ");
        cl.foo(z);
        System.out.println("Fim...");
    }
}
