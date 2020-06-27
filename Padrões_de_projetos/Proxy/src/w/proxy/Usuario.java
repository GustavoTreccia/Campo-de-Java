package w.proxy;

public class Usuario implements Pagina {
	//Controller
    Usuario(){}
    public void dashboard() {
        //Acesso ao model (M)
        //SELECT * FROM USUARIO where usuario.id = id
        //usuarioDao.listarInformacoes()
        //Acesso a view (V)
        //viewUsuario.paginaUsuario()
        System.out.println("Bem-vindo Usuario");
    }
    public void painel() {
        System.out.println("Usuario nao possui permissao - 403");
        
    }
    public void principal() {
        System.out.println("SIGA");
        System.out.println("Pagina principal com o nome do usuario");        
    }
}
