package domain;
public class CategoriaItem {
    private String id;
    private Item item;
    private Categoria categoria;
    private int quantidade;

    public CategoriaItem(String id, Item item, Categoria categoria, int quantidade) {
        this.id = id;
        this.item = item;
        this.categoria = categoria;
        this.quantidade = quantidade;
    }

    public String getId() { return this.id; }
    public void setId(String id) { this.id = id; }

    public Item getItem() { return this.item; }
    public void setItem(Item item) { this.item = item; }

    public Categoria getCategoria() { return this.categoria; }
    public void setCategoria(Categoria categoria) { this.categoria = categoria; }

    public int getQuantidade() { return this.quantidade; }
    public void setQuantidade(int quantidade) { this.quantidade = quantidade; }

    @Override
    public String toString() {
        return id + "," + item + "," + categoria + "," + quantidade;
    }

    public static CategoriaItem fromString(String str) {
        String[] parts = str.split(",");
        String id = parts[0];
        Item item = new Item(parts[1]);
        Categoria categoria = new Categoria(parts[2]);
        int quantidade = Integer.parseInt(parts[3]);
        return new CategoriaItem(id, item, categoria, quantidade);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        CategoriaItem categoriaItem = (CategoriaItem) obj;
        return id.equals(categoriaItem.id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }
}
