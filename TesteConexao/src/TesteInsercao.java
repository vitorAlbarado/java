import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
/**/
public class TesteInsercao {
	public static void main(String[] args) throws SQLException {
		
		String nome = "mouse i";
		String descricao = "Mouse sem fio";
		
		ConnectionFactory connectionFactory = new ConnectionFactory();
		Connection connection = connectionFactory.recuperarConexao();
		
		PreparedStatement stm = 
				connection.prepareStatement("INSERT INTO PRODUTOS (nome, descricao) VALUES (?, ?)", Statement.RETURN_GENERATED_KEYS);
		stm.setString(1, nome);
		stm.setString(2, descricao);
		stm.execute();
			
			ResultSet rst = stm.getGeneratedKeys();
			
			while(rst.next()) {
				Integer id = rst.getInt(1);
				System.out.println("Id criado: "+id);
			}
	}
}
