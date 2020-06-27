package w.visitor;

public class Teste {

	public static void main(String[] args) {
		Zoo zb = new ZooB();
		Animal l = new Leao();
		Zoo za = new ZooA();
		Animal e = new Elefante();
		//Tempo de Compilaçao: ENXERGA A 
		//LISTA DE METODO DEFINIDOS. NESSE CASO,
		//inspecionar(Leao) e inspecionar(Elefante).
		
		//Tempo de execuçao: SABE QUAL METODO
		//CHAMAR. NESSE CASO, SE EH O inspecionar
		//DO ZooA ou do ZooB. O TIPO DO ELEMENTO CHAMADOR (this)
		//DEFINE QUAL IMPLEMENTACAO SERA
		//CHAMADA (NO NOSSO CASO ZooB).
		
		//O DISPACHO EM TEMPO DE EXECUCAO SOH OCORRE
		//NO CHAMADOR. OU SEJA, N OCORRE BASEADO
		//NOS PARAMETROS (ESTATICO, CHECADO EM TEMPO
		//DE COMPILAÇAO NO JAVA)
		
		//SINGLE DISPATCH
		
		//COMO FAZER P DEIXAR DOUBLE DISPATCH?
		//O DISPACHO DO METODO SER DEFINIDO
		//PELO CHAMADOR zb E PELO PARAMETRO l
		//zb.inspecionar(l);
		
		//LINHA QUE SIMULA O DOUBLE DISPATCH
		
		//--- OBJECT STRUCTURE ----
		ObjStructure os = new ObjStructure();
		os.addAnimal(e);
		os.addAnimal(l);
		os.addZoo(za);
		os.addZoo(zb);
		os.traverse();
		//--------------
	}

}
