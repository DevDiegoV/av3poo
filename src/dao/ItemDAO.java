package dao;

import domain.Item;

public class ItemDAO extends GenericDAO<Item> {
    
    public ItemDAO(String filePath) {
        super(filePath);
    }

    @Override
    protected Item fromString(String line) {
        return Item.fromString(line);
    }

    @Override
    protected String toString(Item item) {
        return item.toString();
    }
    
    @Override
    protected String getId(Item item) {
        return item.getId();
    }
}
