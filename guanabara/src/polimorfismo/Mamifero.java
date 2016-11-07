package polimorfismo;

public class Mamifero extends Animal{
	private String corPelo;
	
	public String getCorPelo() {
		return corPelo;
	}

	public void setCorPelo(String corPelo) {
		this.corPelo = corPelo;
	}

	@Override
	public void locomover() {
		System.out.println("correndo");
		
	}

	@Override
	public void alimentar() {
		System.out.println("mamando");
		
	}

	@Override
	public void emitirsom() {
		System.out.println("som de mamifero");
		
	}
	
}
