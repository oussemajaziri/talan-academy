import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager {
	private static final String DRIVER_NAME = "org.postgresql.Driver";
	private static final String HOST = "127.0.0.1";
	private static final int PORT = 5432;
	private static final String DB_NAME = "vintud";
	private static final String USERNAME = "postgres";
	private static final String PASSWORD = "Data_Talan_2022";
	private Connection con;
	private static volatile ConnectionManager connectionManager;

	private ConnectionManager() {
	}

	public static ConnectionManager getInstance() {
		ConnectionManager instance = connectionManager;
		if (instance == null) {
			synchronized (ConnectionManager.class) {
				instance = connectionManager;
				if (instance == null) {
					connectionManager = instance = new ConnectionManager();
				}
			}
		}
		return instance;
	}

	public Connection getConnection() {
		try {
			Class.forName(DRIVER_NAME);
			try {
				con = DriverManager.getConnection(String.format("jdbc:postgresql://%s:%d/%s", HOST, PORT, DB_NAME),
						USERNAME, PASSWORD);
			} catch (SQLException ex) {
				// log an exception. fro example:
				System.out.println("Failed to create the database connection.");
			}
		} catch (ClassNotFoundException ex) {
			// log an exception. for example:
			System.out.println("Driver not found.");
		}
		return con;
	}
}