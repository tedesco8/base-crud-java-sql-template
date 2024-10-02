package repositories;

import java.util.List;

import dto.CrudExampleDTO;

//TODO: Contrato que deberán cumplir las clases que implementen esta interfaz. (Deberan implementar los métodos get, getAll, create, etc).
public interface CrudExampleRepository {
    public CrudExampleDTO get(int id);
    public List<CrudExampleDTO> getAll();
    public void create();
    public void update();
    public void delete();
}
