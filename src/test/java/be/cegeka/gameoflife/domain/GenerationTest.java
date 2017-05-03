package be.cegeka.gameoflife.domain;

import org.junit.Ignore;
import org.junit.Test;

import static be.cegeka.gameoflife.domain.Generation.aGeneration;
import static be.cegeka.gameoflife.testutils.GameOfLifeAssert.*;
import static be.cegeka.gameoflife.testutils.GameOfLifeTestData.aTwoDimensionalListWithAllElements;

public class GenerationTest {

    @Test
    public void givenGeneration_whenAddCell_thenCellIsAdded() {
        Generation generation = aGeneration();
        Position position = new Position(1, 2);
        generation.addCell(position, Cell.from(true));
        assertAlive(generation.getCellAtPosition(position));
    }

    @Test
    public void givenGenerationWithCells_whenGetCellAtPosition_thenReturnCellAtPosition() {
        Generation generation = Generation.from(aTwoDimensionalListWithAllElements(true));
        Cell cell = generation.getCellAtPosition(new Position(0,0));
        assertAlive(cell);
    }
}
