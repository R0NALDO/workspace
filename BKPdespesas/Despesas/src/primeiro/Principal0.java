package primeiro;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Principal0 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		String op = "1";
		
		while (op !="0") {
			System.out.println("--- Sistema de Despesas ---");
			System.out.println("1- Nova despesa");
			System.out.println("2- Nova entrada no hist�rico");
			System.out.println("3- Totais");
			System.out.println("0- Sair");
			op = ler.next();
			
			switch (op) {
			case "1":
				System.out.println("Qual o tipo de despesa?");
				String despesa = ler.next();
				System.out.println("Qual a descricao?");
				String descricao = ler.next();
				try {
					Class.forName("com.mysql.jdbc.Driver");
					String stgCnxo = "jdbc:mysql://localhost/despesas?autoReconnect=true&useSSL=false";
					String stgCnxo2 = "jdbc:mysql://localhost/DESPESAS?autoReconnect=true&useSSL=false";
					Connection conexao = DriverManager.getConnection(stgCnxo2,"root", "");
					Statement comando = conexao.createStatement();
					String sql = "INSERT INTO TIPO_DESPESA (ID_DESPESA,DESCRICAO) VALUES ("+despesa+","+descricao+");";
					comando.execute(sql);
					//boolean rstdCmd = 
					conexao.close();
					//System.out.println(rstdCmd);
					/*while(rslojas.next()){
						System.out.println(rslojas.getInt("id_loja")+""+rslojas.getString("nome_loja"));
					}*/
					
				} catch (ClassNotFoundException e) {
					System.out.println(" ------> excess�o classe n�o encontrada");
					break;
				} catch (SQLException e) {
					System.out.println(" ------> excess�o sql");
					break;
				}
				break;
				
			case "2":
				System.out.println("a");
				break;
				
			case "0":
				System.exit(0);
				break;
				
			default:
				System.out.println("op��o inv�lida, tente novamente");
				break;
			}	
		}
	}

}
