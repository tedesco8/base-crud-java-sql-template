package services;

import java.util.List;

import dto.CrudExampleDTO;

public interface CrudExampleService {
    public CrudExampleDTO get(int id);
    public List<CrudExampleDTO> getAll();
    public void create();
    public void update();
    public void delete();
}
