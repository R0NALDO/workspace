package polimorfismo;

public class Ave extends Animal{
	private String corPena;

	@Override
	public void locomover() {
		System.out.println("voando");
	}

	@Override
	public void alimentar() {
		System.out.println("comendo fruta");
	}

	@Override
	public void emitirsom() {
		System.out.println("ave cantando");
	}

	public void fazerNinho(){
		System.out.println("Fazendo ninho");
	}
	public String getCorPena() {
		return corPena;
	}

	public void setCorPena(String corPena) {
		this.corPena = corPena;
	}
	
}
