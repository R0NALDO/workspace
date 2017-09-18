package primeiro;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Principal8 {

	public static void main(String[] args) throws IOException {
			//criando objetos
		Scanner 	ler = new Scanner(System.in);
		String[] 	nomes = new String[5];
		double[][]	notas = new double[5][5]; 
		String 		op = "1";
		String 		turma = "";
			//menu
		while (!op.equals("0")) {
			System.out.println("\n--- Sistema de Notas ---");
			System.out.println(" - Escolha uma opção - ");
			System.out.println("1- Lançar notas");
			System.out.println("2- Ver notas");
			System.out.println("3- Ver resultados");
			System.out.println("0- Sair");			
			System.out.print("digite sua opção: "); 
			op = ler.next();
			//cadastrar
		switch (op) {
		case "1":
			int x = 0;
				//ler turma
			System.out.println("Para qual turma você deseja lançar?");
			turma = ler.next();
			//System.out.println("Qual o caminho do arquivo?");
			String 		nomeArquivo = "C:\\Users\\Ronaldo\\Desktop\\turmas\\turma_"+turma+".txt"; 
			File 		arquivo = new File(nomeArquivo);
			FileWriter 	gravador = new FileWriter(nomeArquivo,true);
				//gravar na matriz
			while (!op.equalsIgnoreCase("n")) {
				System.out.print("\nDigite o nome do aluno: ");
				nomes[x] = ler.next();
					//ler notas
				for (int i =0 ; i < notas.length - 1; i++) {
					System.out.print("Digite a " + (i + 1) + "º nota do aluno: ");
					notas[x][i] = ler.nextDouble();
				}
				x++;
				System.out.print("Deseja lançar mais um aluno? s/n : ");
				op = ler.next();
			}
				//gravar no arquivo (oculta linhas com null ou 0.0)
			for (int j = 0; j < nomes.length; j++) {
				if (nomes[j]!= null) {
					gravador.write(nomes[j] + "\t | ");
				}
				for (int i = 0; i < notas.length-1; i++) {
					if (notas[j][i]!= 0.0) {
						gravador.write(notas[j][i] + " | ");
					}
				} 
				if (nomes[j] != null) {
					gravador.write(System.lineSeparator());
				}
			}
			gravador.flush();
			gravador.close();
			break;	
			//consultar notas
		case "2":
			String[] palavras = new String[5];
			System.out.println("qual turma deseja consultar?");
			turma = ler.next();
			String nomedoarquivo = "C:\\Users\\Ronaldo\\Desktop\\turmas\\turma_"+turma+".txt";
			//nomedoarquivo.replaceAll("\\\\", "/");
			System.out.println(nomedoarquivo);
			try {
				FileReader arquivoLido = new FileReader(nomedoarquivo); // objeto que carrega o arquivo na ram
				BufferedReader leitor = new BufferedReader(arquivoLido); //objeto que manipula o arquivo
				String linha = leitor.readLine(); //lê a primeia linha do arquivo
					//imprime todas as linhas do arquivo
				while (!(linha == null)) {
					System.out.println(linha);
					linha = leitor.readLine();
				}
			} catch (Exception e) {
				System.out.println("não foi possivel encontrar o arquivo, tente novamente");
			}
			break;		
			//consultar resultado
		case "3":
			String[] resM = new String[10];
			System.out.println("qual turma deseja consultar?");
			turma = ler.next();
			String caminhoArquivo = "C:\\Users\\Ronaldo\\Desktop\\turmas\\turma_"+turma+".txt";
			try {
				FileReader arquivoLido = new FileReader(caminhoArquivo); // objeto que carrega o arquivo na ram
				BufferedReader leitor = new BufferedReader(arquivoLido); //objeto que manipula o arquivo
				String linha = leitor.readLine(); //lê a primeia linha do arquivo
				DecimalFormat df = new DecimalFormat("#.#"); 

				while (!(linha == null)) {
					resM = linha.split(" "); //separa com espaço e joga cada elemento no vetor
					double soma = 0;
					for (int i = 0; i < 9; i += 2) {
					soma += Double.parseDouble(df.format(resM[2]));
					}
					double media = soma/4;
					System.out.println(linha+"média final: "+df.format(media)+"\t resultado: "+CalculaResultado(media));
					linha = leitor.readLine();
					leitor.close();
					}
				}
					//mostra exceção caso algo dê errado
			 catch (Exception e) {				
				System.out.println("não foi possivel encontrar o arquivo, tente novamente");
			}
			break;	
		case "0":
			System.out.println("saindo...");
			break;
		default:
			System.out.println("opção inválida, tente novamente");
			break;
			}
		}
	}
		//veredito
	public static String CalculaResultado(double media) {
		if(media >= 7.0) {
			return "aprovado";
		}else if(media >= 4.0) {
			return "exame final";
		}
		return "reprovado";
	}
}
/*
DESENVOLVIMENTO DE SOFTWARE

EXERCÍCIOS DE FIXAÇÃO

Neste exercício você criará uma aplicação capaz de registrar as notas de alunos em um arquivo
de texto, permitindo sua atualização.
É importante lembrar que vetores e matrizes tem todos os elementos do mesmo tipo de
dados, então, não é possível ter uma matriz contendo os nomes dos alunos e as respectivas
notas. Para tanto, siga a seguintes instruções:
Para armazenar os nomes dos alunos: crie um vetor com 100 elementos do tipo String
Para armazenar as notas dos alunos (considere uma única disciplina), crie uma matriz com 100
linhas (uma linha para cada aluno) e 5 colunas (4 notas e uma média) do tipo Double.
Note que o vetor de alunos é “paralelo” às linhas da matriz. Ou seja, o elemento 0 (zero) vetor,
equivale à linha 0 da matriz e assim sucessivamente.
Agora, desenvolva um aplicativo com um menu de opções:
 1- Lançar notas para a turma
 2- Ver notas da turma
 3- Ver resultados
 0- Sair
	Lançar notas para a turma
Obviamente, o aplicativo deve rodar enquanto o usuário não quiser “sair”.
O lançamento de notas consiste na digitação do nome e das nota de cada aluno
(também se deve perguntar se o usuário “deseja lançar notas de mais alunos”). Utilize
o vetor de Strings e a matriz de Doubles para armazenar esses dados em memória.
	Seu aplicativo deve salvar os dados em um arquivo, representando a turma. Lembre-se
de perguntar o nome da turma para o usuário e que ele pode lançar notas de várias
turmas (em diferentes arquivos).
Se o usuário desejar, ele pode lançar mais notas de uma turma, para tanto, basta abrir
o arquivo relativo a tal turma e continuar os lançamentos.
Não esqueça de calcular a média.
	Ver notas da turma
Pergunte ao usuário qual é a turma e mostre os dados na tela
Lembre-se de que várias turmas podem estar gravadas em disco, então, permita que o
usuário informe qual turma ele deseja visualizar.
	Ver resultados da turma
Pergunte ao usuário qual é a turma e mostre os nomes dos alunos, suas médias e os
respectivos resultados, sendo que a média para aprovação é 7,0 e notas abaixo de 4,0
incorrem em reprovação imediata. Lembre-se do exame final.
*/

//nomedoarquivo.replaceAll("\\\\", "/");
//System.out.println(caminhoArquivo);

/*palavras = linha.split(" "); //separa com espaço e joga cada elemento no vetor
					for(String palavra : palavras){
						System.out.println(palavra);
					}*/

/*for (int j = 0; j < notas.length; j++) {
				System.out.print("\n"+nomes[j]+"\t ");
				for (int i = 0; i < notas.length - 1; i++) {
					System.out.print(notas[j][i]+" ");
				} 
			}*/