package banco;

public class BancoDeDados {

	public static void main(String[] args) {
		
		Crud c = new Crud();
//		c.atualizar("MARIAZINHA", "99");
		c.mostrar();
//		c.mostrar();
//		apagar();
//		mostrar();
 		
		
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*public static void mostrar(){
		
					String    url = "jdbc:mysql://localhost/easytrade";
		try {
			Connection        conexao   = DriverManager.getConnection(url,"root","");
			PreparedStatement pesquisa  = conexao.prepareStatement("SELECT * FROM PESSOA");
			ResultSet         resultado = pesquisa.executeQuery();
			
			while(resultado.next()){
				
					String    nome  = resultado.getString("nome");
					String    idade = resultado.getString("idade");
					System.out.println("Nome:"+nome+" Idade:"+idade);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void inserir(){
	
		String url = "jdbc:mysql://localhost/easytrade";
		String sql = "INSERT INTO PESSOA(NOME,IDADE) VALUES('PAULA TEJANO' ,30)";
		try {
			Connection 		  conexao = DriverManager.getConnection(url,"root","");
			PreparedStatement atualizar = conexao.prepareStatement(sql);
			atualizar.executeUpdate();
			JOptionPane.showMessageDialog(null, "executado com sucesso");
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

	public static void atualizar(){
	
	String url = "jdbc:mysql://localhost/easytrade";
	String sql = "UPDATE PESSOA SET NOME = 'MARCELO SZOSTAK',IDADE = 40 WHERE IDADE =23"; //String sql = "UPDATE PESSOA SET NOME = 'MARCELO SZOSTAK' WHERE IDADE =23";
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
	String sql = "DELETE FROM PESSOA WHERE NOME='joao'";
	try {
		Connection conexao = DriverManager.getConnection(url,"root","");
		PreparedStatement atualizar = conexao.prepareStatement(sql);
		atualizar.executeUpdate();
		JOptionPane.showMessageDialog(null, "executado com sucesso");
	} catch (Exception e) {
		// TODO: handle exception
	}	
  }*/

 }
