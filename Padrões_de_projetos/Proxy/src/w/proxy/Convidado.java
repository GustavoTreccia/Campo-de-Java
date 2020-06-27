package w.proxy;

public class Convidado implements Pagina {
	Convidado(){}
    public void dashboard() {
        System.out.println("Por favor realize o login");
    }
    public void painel() {
        System.out.println("Por favor realize o login como admin");
    }
    public void principal() {
        System.out.println("SIGA");
        System.out.println("Pagina principal - guest");
    }
}
