package w.proxy;

public class Admin implements Pagina {
	Admin(){}

    public void dashboard() {
        System.out.println("Dashboard com opçoes especiais");
    }

    public void painel() {
        System.out.println("Controle de registros");
    }

    public void principal() {
        System.out.println("Bem-vindo ADMIN!");
    }
}
