package polimorfismo;

public class Canguru extends Mamifero {

	@Override
	public void locomover() {
		System.out.println("saltando");
	}

	public void UsarBolsa() {
		System.out.println("usando bolsa");
	}
}
