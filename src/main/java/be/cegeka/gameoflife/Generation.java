package be.cegeka.gameoflife;

import org.apache.commons.lang3.NotImplementedException;

import java.util.ArrayList;
import java.util.List;

public class Generation {
    private List<CellRow> cellRows = new ArrayList<>();

    public static Generation from(List<List<Boolean>> cellValues) {
        Generation generation = aGeneration();
        cellValues.forEach(row ->
                generation.cellRows.add(CellRow.from(row))
        );

        return generation;
    }

    private static Generation aGeneration() {
        return new Generation();
    }

    public List<List<Boolean>> getAsBooleans() {
        List<List<Boolean>> booleans = new ArrayList<List<Boolean>>();
        cellRows.forEach(cellRow -> booleans.add(cellRow.getAsBooleans()));

        return booleans;
    }

    public List<CellRow> getCellRows() {
        return cellRows;
    }

    public Generation getNextGeneration() {
        throw new NotImplementedException("Not implemented yet");
    }
}
