package w.adapater;

public class PatoAdapter implements Pato {
	private Peru peru;
    
    public PatoAdapter(Peru peru) {
        this.peru = peru;
    }

    public void nadar() {
        peru.andar();
    }

    public void voar() {
        peru.pular();
    }

    public void grasnar() {
        peru.wobble();
    }
}
