package dao;

import domain.Categoria;

public class CategoriaDAO extends GenericDAO<Categoria>{
  
    public CategoriaDAO(String filePath) {
        super(filePath);
    }

    @Override
    protected Categoria fromString(String line) {
        return Categoria.fromString(line);
    }

    @Override
    protected String toString(Categoria categoria) {
        return categoria.toString();
    }

    @Override
    protected String getId(Categoria categoria) {
        return categoria.getId();
    }
}
