package be.cegeka.gameoflife.domain;

import org.apache.commons.lang3.NotImplementedException;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Generation {
    private Map<Position, Cell> cells = new HashMap<>();

    public static Generation from(List<List<Boolean>> twoDimensionalList) {
        Generation generation = aGeneration();

        twoDimensionalList.forEach(row ->
            row.forEach(element ->
                    generation.cells.put(
                        new Position(twoDimensionalList.indexOf(row),
                            row.indexOf(element)),
                        Cell.from(element)
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
