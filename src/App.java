import java.sql.ResultSet;
import java.sql.SQLException;

import configuration.DatabaseConnection;

public class App {
    public static void main(String[] args) throws Exception {
        DatabaseConnection dbConnection = new DatabaseConnection();

        try {
            // Ejemplo de lectura
            ResultSet rs = dbConnection.executeQuery("SELECT * FROM tu_tabla");
            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id") + ", Nombre: " + rs.getString("nombre"));
            }

            // Ejemplo de escritura
            int rowsAffected = dbConnection.executeUpdate("INSERT INTO tu_tabla (nombre) VALUES ('Nuevo Nombre')");
            System.out.println("Filas afectadas: " + rowsAffected);

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                dbConnection.closeConnection();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}