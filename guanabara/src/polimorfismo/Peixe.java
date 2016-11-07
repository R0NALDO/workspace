package polimorfismo;

public class Peixe extends Animal{
	private String corEscama;

	@Override
	public void locomover() {
		System.out.println("nadando");
	}

	@Override
	public void alimentar() {
		System.out.println("comendo ra��o");
	}

	@Override
	public void emitirsom() {
		System.out.println("peixe n�o emite som");
	}
	
	public void SoltarBolha(){
		System.out.println("soltando bolha");
	}

	public String getCorEscama() {
		return corEscama;
	}

	public void setCorEscama(String corEscama) {
		this.corEscama = corEscama;
	}
}
