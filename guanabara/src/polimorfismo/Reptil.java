package polimorfismo;

public class Reptil extends Animal{
	private String corEscama;

	public String getCorEscama() {
		return corEscama;
	}

	public void setCorEscama(String corEscama) {
		this.corEscama = corEscama;
	}
	
	@Override
	public void locomover() {
		System.out.println("rastejando");
	}

	@Override
	public void alimentar() {
		System.out.println("comendo insetos");
		
	}

	@Override
	public void emitirsom() {
		System.out.println("som de reptil");
		
	}
}
