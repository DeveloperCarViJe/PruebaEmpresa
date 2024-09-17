package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionDB {
    private static final String URL = "jdbc:oracle:thin:@localhost:1521:quimitrans";
    private static final String USER = "qpside";
    private static final String PASSWORD = "qpsidep";

    public static Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (ClassNotFoundException e) {
            System.err.println("Error: No se pudo cargar el driver de Oracle.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.err.println("Error: No se pudo conectar a la base de datos.");
            e.printStackTrace();
        }
        return connection;
    }

}

