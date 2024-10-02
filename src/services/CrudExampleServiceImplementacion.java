package services;

import java.util.List;

import dto.CrudExampleDTO;
import repositories.CrudExampleRepository;

//TODO: Aquí va toda la lógica de negocio necesaria
public class CrudExampleServiceImplementacion implements CrudExampleService {
    //Usamos la interfaz como fachada. (Buscar patron facade)
    CrudExampleRepository crudExampleRepository;

  
    public CrudExampleDTO get(int id) {
        return crudExampleRepository.get(id);
    }

    public List<CrudExampleDTO> getAll() {
        return crudExampleRepository.getAll();
    }

    public void create() {

    }

    public void update() {

    }

    public void delete() {

    }
}
