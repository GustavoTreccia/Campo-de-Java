package w.proxy;

public class UsuarioProxy implements Pagina {
	
	private Pagina pagina;
	
	public UsuarioProxy(String login, String senha) {
        //ACESSAR AO MODEL
        if(login.contentEquals("User") 
        && senha.contentEquals("12345")) {
            pagina = new Usuario();
        }else if(login.contentEquals("root") 
        && senha.contentEquals("root")) {
            pagina = new Admin();
        }else {
            pagina = new Convidado();
        }
    }

    public void dashboard() {
        pagina.dashboard();
    }

    public void painel() {
        pagina.painel();
    }

    public void principal() {
        pagina.principal();
    }
}
