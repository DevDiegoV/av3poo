package dao;

import domain.CategoriaItem;

public class CategoriaItemDAO extends GenericDAO<CategoriaItem> {
    public CategoriaItemDAO(String filePath) {
        super(filePath);
    }

    @Override
    protected CategoriaItem fromString(String line) {
        return CategoriaItem.fromString(line);
    }

    @Override
    protected String toString(CategoriaItem categoriaItem) {
        return categoriaItem.toString();
    }
    
    @Override
    protected String getId(CategoriaItem categoriaItem) {
        return categoriaItem.getId();
    }
}
