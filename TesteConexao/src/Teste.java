import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Teste {

	public static void main(String[] args) throws SQLException {
		Connection connection = DriverManager
				.getConnection("jdbc:mysql://localhost/LOJA_VIRTUAL?useTimezone=true&serverTimezone=UTC","vitor","Info@1234");
		System.out.println("Fechando conexão!");
		connection.close();

	}

}
