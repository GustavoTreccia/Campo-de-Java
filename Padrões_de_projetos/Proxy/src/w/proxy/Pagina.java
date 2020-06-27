package w.proxy;

public interface Pagina {
	// USO DO PROXY EM CONEXTOS DE PERMISSAO
    // rota GET pagina.com/dashboard
    void dashboard();
    // rota GET pagina.com/painel
    void painel();
    // rota GET pagina.com/principal
    void principal();
}
