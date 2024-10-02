package controller;

import java.util.List;
import java.util.Objects;

import dto.CrudExampleDTO;
import services.CrudExampleService;

//TODO: Aquí va toda la lógica de interacción con el cliente (intefraces de usuario, form, windform, etc), estas clases invocaran este controlador
public class CrudExampleController {
    CrudExampleService crudExampleService;

    @SuppressWarnings("unused") // elimino warning
    public CrudExampleDTO get(int id) throws Exception {
        // Validamos que id no sea nulo y manejamos exepción.
        if (Objects.isNull(id)) {
            throw new Exception("id must be send");
        }

        return crudExampleService.get(id);
    }

    public List<CrudExampleDTO> getAll() {
        return crudExampleService.getAll();
    }

    public void create() {

    }

    public void update() {

    }

    public void delete() {

    }
}
