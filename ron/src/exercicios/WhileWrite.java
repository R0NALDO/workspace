package exercicios;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class WhileWrite {

	public static void main(String[] args) {
			for (int i=0; i<=15; i++) {
			
			Path   caminho = Paths.get("C:/users/ronaldo/desktop/ron/ron4/ronaldo "+i+".txt");
			String texto = " teste de escrever em arquivo numero "+i;
			byte[] textoEmByte = texto.getBytes();
			try {
				Files.write(caminho, textoEmByte);
			} catch (Exception erro) {
				System.out.println(erro);
			}
			}
				
			}

	}



/*
lista de atalhos                   	Ctrl + Shift + L
 organizar Imports               	Ctrl + Shift + O
deletar linha inteira             	Ctrl + D
duplicar linha                      Ctrl + Alt + Up/Down
identa��o do c�digo           		Ctrl + Shift + F
refatorar vari�vel                 	Alt + Shift + R
resolver problemas             		Ctrl+1
visualizar e Localizar M�todos e Atributos de sua Classe Ctrl + O
localizar onde um m�todo est� sendo referenciado           Ctrl + G
deletar linha inteira             	Ctrl + D
*/