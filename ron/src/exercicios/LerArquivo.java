package exercicios;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import javax.swing.JOptionPane;

public class LerArquivo {

	public static void main(String[] args) {
		Path caminho = Paths.get("C:/users/ronaldo/desktop/ron/ron2/ronaldo 3.txt");
		try {
			byte[] texto = Files.readAllBytes(caminho);
			String leitura = new String(texto);
			JOptionPane.showMessageDialog(null, leitura);
			
		} catch (Exception erro) {
			// https://www.youtube.com/watch?v=60C_LhXtrMU&index=64&list=PLtchvIBq_CRTAwq_xmHdITro_5vbyOvVw
		}
	}

}
