import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class TesteRemocao {
	public static void main(String[] args) throws SQLException {
		
		
		
		ConnectionFactory connectionFactory = new ConnectionFactory();
		Connection connection = connectionFactory.recuperarConexao();
		
		
		Statement stm = connection.createStatement();
		
		stm.execute("DELETE FROM PRODUTOS WHERE ID > 3");
		Integer rowsAffected = stm.getUpdateCount();
		
		System.out.println("row affecteds "+rowsAffected);
		}

}
