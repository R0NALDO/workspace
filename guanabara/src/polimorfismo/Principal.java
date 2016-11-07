package polimorfismo; //https://www.youtube.com/watch?v=NctjqlfKC0U

public class Principal {

	public static void main(String[] args) {
		Mamifero m = new Mamifero();
		Reptil r = new Reptil();
		Peixe p = new Peixe();
		Ave a = new Ave();
		
		Canguru c = new Canguru();
		c.locomover();
		
		m.setPeso(35.3f);
		m.setCorPelo("marrom");
		m.alimentar();
		m.locomover();
		m.emitirsom();
		
	}

}
