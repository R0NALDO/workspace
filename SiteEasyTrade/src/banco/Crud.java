package banco;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Crud {	
	
	public void mostrar(){
		
		String    url = "jdbc:mysql://localhost/easytrade";
			try {
			Connection        conexao   = DriverManager.getConnection(url,"root","");
			PreparedStatement pesquisa  = conexao.prepareStatement("SELECT * FROM PESSOA");
			ResultSet         resultado = pesquisa.executeQuery();
			
			while(resultado.next()){
	
		String    nome  = resultado.getString("nome");
		String    idade = resultado.getString("idade");
		String    id = resultado.getString("id");
		System.out.println("ID:"+id+"  Nome:"+nome+"       Idade:"+idade);
			}
			} catch (SQLException e) {
			e.printStackTrace();
			}
		}
	
	public void inserir(String nome, String idade){
		
		
		String url = "jdbc:mysql://localhost/easytrade";
		String sql = "INSERT INTO PESSOA(NOME,IDADE) VALUES('"+nome+"' ,"+idade+")";
		try {
			Connection        conexao   = DriverManager.getConnection(url,"root","");
			PreparedStatement atualizar = conexao.prepareStatement(sql);
			atualizar.executeUpdate();
			System.out.println("ron executado com sucesso");
		} catch (Exception e) {
			System.out.println("ron tente novamente");
		}
		
		
	}
	
	public static void atualizar(String nome, String idade){
		
		String url = "jdbc:mysql://localhost/easytrade";
		String sql = "UPDATE PESSOA SET NOME = '"+nome+"' WHERE IDADE ="+idade+""; //String sql = "UPDATE PESSOA SET NOME = 'MARCELO SZOSTAK' WHERE IDADE =23";
		try {
			Connection 			conexao   = DriverManager.getConnection(url,"root","");
			PreparedStatement 	atualizar = conexao.prepareStatement(sql);
			atualizar.executeUpdate();
		} catch (SQLException 	e) {
			e.printStackTrace();
		}
	}
	
	public static void apagar(){
		
		String url = "jdbc:mysql://localhost/easytrade";
		String sql = "DELETE FROM PESSOA WHERE NOME='JOAO'";
		try {
			Connection        conexao   = DriverManager.getConnection(url,"root","");
			PreparedStatement atualizar = conexao.prepareStatement(sql);
			atualizar.executeUpdate();
			JOptionPane.showMessageDialog(null, "executado com sucesso");
		} catch (Exception e) {
			System.out.println("ron tente novamente");
		}
		
	}
		
}
