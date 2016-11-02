package exercicios;

import java.awt.Desktop;
import java.net.URI;

public class AbrirLink {

	public static void main(String[] args) {
		try {
			URI link = new URI("https://www.youtube.com/watch?v=7WneN331KSs&index=67&list=PLtchvIBq_CRTAwq_xmHdITro_5vbyOvVw");
			Desktop.getDesktop().browse(link);
		} catch (Exception erro) {
			System.out.println("ron erro");
		}

	}

}

//https://www.youtube.com/watch?v=7WneN331KSs&index=67&list=PLtchvIBq_CRTAwq_xmHdITro_5vbyOvVw