package domain;
public class CategoriaItem {
    private Item item;
    private Categoria categoria;
    private int quantidade;

    public CategoriaItem(Item item, Categoria categoria, int quantidade) {
        this.item = item;
        this.categoria = categoria;
        this.quantidade = quantidade;
    }

    public Item getItem() { return this.item; }
    public void setItem(Item item) { this.item = item; }

    public Categoria getCategoria() { return this.categoria; }
    public void setCategoria(Categoria categoria) { this.categoria = categoria; }

    public int getQuantidade() { return this.quantidade; }
    public void setQuantidade(int quantidade) { this.quantidade = quantidade; }
}
