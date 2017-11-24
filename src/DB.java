import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DB {
	public ResultSet runSQL(String query) throws SQLException {
		Connection con = getConnection();
		ResultSet rs = null;
		Statement stmt = null;
		try {
			stmt = con.createStatement();
			rs = stmt.executeQuery(query);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rs;
	}

	public Connection getConnection() {
		Connection connection = null;
		try {
			Class.forName("org.postgresql.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			return null;
		}
		try {
			connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/pagila", "postgres", "root");
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
		if (connection != null) {
			return connection;
		} else {
			return null;
		}
	}
}
