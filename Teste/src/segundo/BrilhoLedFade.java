package segundo;

public class BrilhoLedFade {
	public static void main(String[] args) throws InterruptedException {
		Brilho();
		
	}
	public static void IfInLine() {
		Boolean booleano = null; //Object Boolean (not boolean)
		String msgm = booleano == null ? "é nulo" : booleano ? "verdadeiro" : "falso";  
		System.out.println(msgm);
	}
	//vai aumentando e diminuindo o brilho do led
	public static void Brilho() {
		int brilho = 0;
		int taxa = 5;
		int cont = 0;
		
		while (cont<2500) {
			brilho = brilho + taxa;
			// reverse the direction of the fading at the ends of the fade:
			if (brilho <= 0 || brilho >= 255) {
				taxa = -taxa;
				cont++;
			} 
			
			System.out.println(brilho+"              "+taxa);
		}
	}
}
