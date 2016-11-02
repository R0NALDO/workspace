package exercicios;

public class Separar { // separa string em pedacos

	public static void main(String[] args) {
		maisPedacos();
		String nome = "Ronaldo Robes Pereira";
		String[] nomes = nome.split(" "); // quando encontra espaco separa e joga no vetor
		System.out.println(nomes[2]);
	}
	
	public static void maisPedacos (){
		String nome = "Ronaldo Robes Pereira mora em campo largo";
		String[] nomes = nome.split(" ",2); // a partir do segundo pedaco nao separa, joga tudo em uma posicao so
		System.out.println(nomes[1]);
		
	}

}

//https://www.youtube.com/watch?v=q7yaYC0NdGc&list=PLtchvIBq_CRTAwq_xmHdITro_5vbyOvVw&index=39