package exercicios;

public class Alterar { //troca um texto por outro

	public static void main(String[] args) {
		//primeiro();
		String frase 	= "Brasil vai ganhar a copa do mundo sim";
		String nova 	= frase.replace(" ","_");
		System.out.println(nova);
		
	}
	
	public static void primeiro(){ // troca so o primeiro caracter encontrado
		String frase 	= "Só a primeira ocorrencia vai ser trocada";
		String nova 	= frase.replaceFirst("S", "z");
		System.out.println(nova);
	}

}

//https://www.youtube.com/watch?v=1jtlf3OZ6z4&list=PLtchvIBq_CRTAwq_xmHdITro_5vbyOvVw&index=40