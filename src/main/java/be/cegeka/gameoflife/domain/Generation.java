package be.cegeka.gameoflife.domain;

import org.apache.commons.lang3.NotImplementedException;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Generation {
    private Map<Position, Cell> cells = new HashMap<>();

    public static Generation from(List<List<Boolean>> cellValues) {
        Generation generation = aGeneration();

        cellValues.forEach(row ->
            row.forEach(cellValue ->
                    generation.cells.put(
                        new Position(cellValues.indexOf(row),
                            row.indexOf(cellValue)),
                        Cell.from(cellValue)
                    )));

        return generation;
    }

    private static Generation aGeneration() {
        return new Generation();
    }

    public Map<Position, Cell> getCells() {
        return cells;
    }

    public Cell getCellAtPosition(Position position) {
        // return cells.get(position);
        throw new NotImplementedException("Not implemented yet");
    }

    public Generation getNextGeneration() {
        throw new NotImplementedException("Not implemented yet");
    }

}
