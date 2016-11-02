package exercicios;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class EscreverEmArquivo {

	public static void main(String[] args) {

		Path   caminho = Paths.get("C:/users/ronaldo/desktop/ronaldo.txt");
		String texto = "primeiro teste de escrever em arquivo";
		byte[] textoEmByte = texto.getBytes();
		try {
			Files.write(caminho, textoEmByte);
		} catch (Exception erro) {
			// TODO: handle exception
		}
	}

}

//https://www.youtube.com/watch?v=Kj5ibAHhv3M&list=PLtchvIBq_CRTAwq_xmHdITro_5vbyOvVw&index=65