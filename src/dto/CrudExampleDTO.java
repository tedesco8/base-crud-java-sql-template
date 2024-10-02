package dto;

public class CrudExampleDTO {
    private int id;
    private String name;
   
    public CrudExampleDTO(int id, String name) {
        this.id = id;
        this.name = name;
    }
    
    public CrudExampleDTO() {
        //TODO: permitimos crear instancias sin pasar argumentos
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "CrudExample [id=" + id + ", name=" + name + "]";
    }
}
