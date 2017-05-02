package be.cegeka.gameoflife.domain;

import org.junit.Test;

import static be.cegeka.gameoflife.testutils.GameOfLifeAssert.*;
import static be.cegeka.gameoflife.testutils.GameOfLifeTestData.aTwoDimensionalListWithAllElements;

public class GenerationTest {

    @Test
    public void givenTwodimenionalListWithAllCellValuesTrue_whenGenerationFromCellValues_thenAllCellsInGenerationAreAlive() {
        assertAllAlive(Generation.from(aTwoDimensionalListWithAllElements(true)));
    }

    @Test
    public void givenTwodimenionalListWithAllCellValuesFalse_whenGenerationFromCellValues_thenAllCellsInGenerationAreNotAlive() {
        assertAllDead(Generation.from(aTwoDimensionalListWithAllElements(false)));
    }
}
