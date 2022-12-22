import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestaListagem {
	
	public static void main(String[] args) throws SQLException {
		
		ConnectionFactory connectionFactory = new ConnectionFactory(); 
		Connection connection = connectionFactory.recuperarConexao();
				
		
		PreparedStatement stm = connection.prepareStatement("SELECT ID, NOME, DESCRICAO FROM PRODUTOS");
		
		stm.execute();
		
		ResultSet rst = stm.getResultSet();
		
		while(rst.next()) {
			Integer id = rst.getInt("ID");
			System.out.println("ID: " +id);
			String nome = rst.getString("NOME");
			System.out.println("NOME: " +nome);
			String descricao = rst.getNString("DESCRICAO");
			System.out.println("DESCRICAO: " +descricao);
			System.out.println();
			
		}
						
		System.out.println("Fechando conexão!");
		connection.close();

	}
}
