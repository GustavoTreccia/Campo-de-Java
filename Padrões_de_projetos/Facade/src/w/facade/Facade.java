package w.facade;

public class Facade {
	private LoginAPI login;
	private PgtoAPI pgto;
	private VooAPI voo;
	
	public Facade(LoginAPI login, PgtoAPI pgto, VooAPI voo) {
		this.login = login;
		this.pgto = pgto;
		this.voo = voo;
	}
	
	public void verVoos() {
		login.verificarUsuario();
		login.obterToken();
		voo.listarVoos();
		voo.verDisponibilidade();
	}
	
	public void reservar() {
		login.validarToken();
		voo.reservar();
		pgto.solicitarPGTO();
		pgto.pagar();
	}
}
