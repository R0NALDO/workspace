package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;
//consultar despesa
public class Read {
	public static void MostrarTotal() throws ClassNotFoundException, SQLException {
		String hora = "\n"+new SimpleDateFormat("dd/MM/yy HH:mm:ss").format(Calendar.getInstance().getTime());
		String op = "";
		Scanner ler = new Scanner(System.in);
		while (!op.equalsIgnoreCase("n")) {
			System.out.println(hora);
			System.out.println("Qual extrato você gostaria?");
			System.out.println("1- Total Diário");
			System.out.println("2- Total Mensal");
			System.out.println("3- Total Consolidado");
			System.out.println("0- Voltar");
			op = ler.next();
			//chamadas
			switch (op) {
			case "1":
				ExtratoDiario();//mostra o total diário
				break;
			
			case "2":
				ExtratoMensal();//mostra o mes atual
				break;
				
			case "3":
				ExtratoConsolidado(); //mostra o periodo escolhido
				break;
				
			case "0":
				op = "n";
				break;
				
			default:
				System.out.println("opção inválida, tente novamente");
				break;
			}
		}
	}

	public static void ExtratoDiario() throws ClassNotFoundException, SQLException {
		//cria conexao
		Class.forName("com.mysql.jdbc.Driver");
		String 		stgCnxo = "jdbc:mysql://localhost/despesas?autoReconnect=true&useSSL=false";
		Connection 	conexao = DriverManager.getConnection(stgCnxo,"root", "");
		Statement 	comando = conexao.createStatement();
		Scanner 	ler = new Scanner(System.in);
		String 		sql = "SELECT * FROM TIPO_DESPESA";
		String 		op = "";
		ResultSet 	rstSt = comando.executeQuery(sql);
		//lê as linhas
		System.out.println("Exibindo id e descrição das despesas");
			while (rstSt.next()){
				int 	idDpsa  = rstSt.getInt("ID_DESPESA");
				String 	dcco = rstSt.getString("DESCRICAO");
				System.out.format("\t %s, %s\n", idDpsa, dcco);
			}
		rstSt.close();			
		conexao.close();
		}	
	
	private static void ExtratoMensal() throws ClassNotFoundException, SQLException {
		//cria conexao
		Class.forName("com.mysql.jdbc.Driver");
		String 		stgCnxo = "jdbc:mysql://localhost/despesas?autoReconnect=true&useSSL=false";
		Connection 	conexao = DriverManager.getConnection(stgCnxo,"root", "");
		Statement 	comando = conexao.createStatement();
		Scanner 	ler = new Scanner(System.in);
		String 		sql = "SELECT * FROM TIPO_DESPESA";
		String 		op = "";
		ResultSet 	rstSt = comando.executeQuery(sql);
		//lê as linhas
		System.out.println("Exibindo id e descrição das despesas");
			while (rstSt.next()){
				int 	idDpsa  = rstSt.getInt("ID_DESPESA");
				String 	dcco = rstSt.getString("DESCRICAO");
				System.out.format("\t %s, %s\n", idDpsa, dcco);
			}
		rstSt.close();			
		conexao.close();
		}
	
	private static void ExtratoConsolidado() throws ClassNotFoundException, SQLException {
		//cria conexao
		Class.forName("com.mysql.jdbc.Driver");
		String 		stgCnxo = "jdbc:mysql://localhost/despesas?autoReconnect=true&useSSL=false";
		Connection 	conexao = DriverManager.getConnection(stgCnxo,"root", "");
		Statement 	comando = conexao.createStatement();
		Scanner 	ler = new Scanner(System.in);
		String 		sql = "SELECT * FROM TIPO_DESPESA";
		String 		op = "";
		ResultSet 	rstSt = comando.executeQuery(sql);
		//lê as linhas
		System.out.println("Exibindo id e descrição das despesas");
			while (rstSt.next()){
				int 	idDpsa  = rstSt.getInt("ID_DESPESA");
				String 	dcco = rstSt.getString("DESCRICAO");
				System.out.format("\t %s, %s\n", idDpsa, dcco);
			}
		rstSt.close();			
		conexao.close();
		}
	}


