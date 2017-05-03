package be.cegeka.gameoflife.domain;

import be.cegeka.gameoflife.service.GenerationMapper;
import org.apache.commons.lang3.NotImplementedException;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Generation {

    private Map<Position, Cell> cells = new HashMap<>();

    public static Generation from(List<List<Boolean>> twoDimensionalList) {
        GenerationMapper generationMapper = new GenerationMapper();
        return generationMapper.toGeneration(twoDimensionalList);
    }

    public static Generation aGeneration() {
        return new Generation();
    }

    public Map<Position, Cell> getCells() {
        return cells;
    }

    public Cell getCellAtPosition(Position position) {
        return cells.get(position);
    }

    public Generation getNextGeneration() {
        throw new NotImplementedException("Not implemented yet");
    }

    public void addCell(Position position, Cell cell) {
        this.cells.put(position, cell);
    }
}
