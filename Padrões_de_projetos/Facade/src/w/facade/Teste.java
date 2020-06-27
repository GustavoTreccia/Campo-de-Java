package w.facade;

public class Teste {
	public static void main(String[] args) {
		Facade f = new Facade(new LoginAPI(),new PgtoAPI(), new VooAPI());	
		f.verVoos();
		f.reservar();
	}
}
