package dao;

import domain.Quarto;

public class QuartoDAO extends GenericDAO<Quarto> {
    public QuartoDAO(String filePath) {
        super(filePath);
    }

    @Override
    protected Quarto fromString(String line) {
        return Quarto.fromString(line);
    }

    @Override
    protected String toString(Quarto quarto) {
        return quarto.toString();
    }

    @Override
    protected String getId(Quarto quarto) {
        return quarto.getId();
    }
}
