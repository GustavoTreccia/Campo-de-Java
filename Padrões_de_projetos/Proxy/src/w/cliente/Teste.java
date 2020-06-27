package w.cliente;

import w.proxy.Pagina;
import w.proxy.UsuarioProxy;
public class Teste {
	public static void main(String[] args) {
        Pagina p = new UsuarioProxy("root","root");
        p.dashboard();
        p.painel();
        p.principal();
    }
}
