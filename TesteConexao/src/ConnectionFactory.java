import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	
	public Connection recuperarConexao() throws SQLException{
		return DriverManager
				.getConnection("jdbc:mysql://localhost/LOJA_VIRTUAL?useTimezone=true&serverTimezone=UTC","vitor","Info@1234");
	}

}
