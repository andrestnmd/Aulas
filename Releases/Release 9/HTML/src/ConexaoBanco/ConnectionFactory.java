package ConexaoBanco;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	
	private static final ThreadLocal<Connection> conn = new ThreadLocal<>();
	
	
	
	static {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			throw new RuntimeException(e);
		}
	}
	
	// Obtém conexão com o banco de dados
	public static Connection getConnection() throws SQLException {
		return DriverManager
				.getConnection("jdbc:mysql://localhost/vendas?user=root&password=dnyws4nx&useSSL=false");
	}
	
	
	public static void fecharConexao() throws SQLException {
		if(conn.get() != null){
			conn.get().close();
			conn.set(null);
		}
	}

}
