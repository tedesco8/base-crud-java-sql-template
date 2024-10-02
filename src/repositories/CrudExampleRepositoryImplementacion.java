package repositories;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import configuration.DatabaseConnection;
import dto.CrudExampleDTO;

//TODO: Aquí va toda interacción con la base de datos
public class CrudExampleRepositoryImplementacion implements CrudExampleRepository {
    DatabaseConnection dbConnection = new DatabaseConnection();

    public CrudExampleDTO get(int id) {
        String query = "SELECT id, name FROM usuarios WHERE id = " + id + "";
        CrudExampleDTO crudExampleDTO = new CrudExampleDTO();

        try {
            ResultSet rs = dbConnection.executeQuery(query);
            crudExampleDTO.setId(rs.getInt("id"));
            crudExampleDTO.setName(rs.getString("name"));
        } catch (SQLException e) {
            // TODO: como buena práctica manejar exepción
            e.printStackTrace();
        } finally {
            try {
                dbConnection.closeConnection();
            } catch (SQLException e) {
                // TODO: como buena práctica manejar exepción
                e.printStackTrace();
            }
        }

        return null;
    }

    public List<CrudExampleDTO> getAll() {
        String query = "SELECT * FROM crud_example";
        List<CrudExampleDTO> crudExampleDTOs = new ArrayList<>();

        try {
            ResultSet rs = dbConnection.executeQuery(query);

            while (rs.next()) {
                CrudExampleDTO crudExampleDto = new CrudExampleDTO(rs.getInt("id"), rs.getString("name"));
                crudExampleDTOs.add(crudExampleDto);
            }

            return crudExampleDTOs;
        } catch (SQLException e) {
            // TODO: como buena práctica lanzar exepción
            e.printStackTrace();
        } finally {
            try {
                dbConnection.closeConnection();
            } catch (SQLException e) {
                // TODO: como buena práctica lanzar exepción
                e.printStackTrace();
            }
        }

        return crudExampleDTOs;
    }

    public void create() {

    }

    public void update() {

    }

    public void delete() {

    }
}
