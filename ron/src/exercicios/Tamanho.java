package exercicios;

public class Tamanho { // mostra o tamanho da string

	public static void main(String[] args) {
		//vetor();
		String nome = "Ronaldo";
		int tamanho = nome.length();
		System.out.println(tamanho);
	}


	public static void vetor(){ //mostra quantos elementos de um vetor
		String[] nomes = {"Ana","Bob","Carla","Debora"};
		int tamanho = nomes.length;
		System.out.println(tamanho);
	}
}

//https://www.youtube.com/watch?v=7bp6VTkJ9ko&index=41&list=PLtchvIBq_CRTAwq_xmHdITro_5vbyOvVw