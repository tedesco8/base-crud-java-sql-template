
import java.util.List;

import controller.CrudExampleController;
import dto.CrudExampleDTO;

public class App {
    public static void main(String[] args) throws Exception {
        CrudExampleController crudExampleController = new CrudExampleController();

         List<CrudExampleDTO> examples = crudExampleController.getAll();

         for(CrudExampleDTO example: examples) {
            System.out.println("ID: " + example.getId());
            System.out.println("Nombre: " + example.getId());
         }
    }
}