package primeiro;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.*;
	//lê a data de criaçao do arquivo
public class LerDataDoArquivo {
	
	public static void main(String[] args) throws IOException {
		String caminho = "C:\\users\\ronaldo\\desktop\\ron\\duvida.jpg"; 
//		for (String caminho : args) {
			PegarAtributos(caminho);
//		}
	}
	
	  static void PegarAtributos(String caminho) throws IOException {
		    Path 				temp = Paths.get(caminho);
		    BasicFileAttributes view = Files.getFileAttributeView(temp, BasicFileAttributeView.class).readAttributes();
		    System.out.println(view.creationTime()+" is the same as "+view.lastModifiedTime());
		  }
}
//segundo testesss