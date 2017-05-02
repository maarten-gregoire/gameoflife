package be.cegeka.gameoflife.domain;

import org.junit.Test;

import static be.cegeka.gameoflife.testutils.GameOfLifeAssert.*;
import static be.cegeka.gameoflife.testutils.GameOfLifeTestData.aTwoDimenionalListWithAllElements;

public class GenerationTest {

    @Test
    public void givenTwodimenionalListWithAllCellValuesTrue_whenGenerationFromCellValues_thenAllCellsInGenerationAreAlive() {
        assertAllAlive(Generation.from(aTwoDimenionalListWithAllElements(true)));
    }

    @Test
    public void givenTwodimenionalListWithAllCellValuesFalse_whenGenerationFromCellValues_thenAllCellsInGenerationAreNotAlive() {
        assertAllDead(Generation.from(aTwoDimenionalListWithAllElements(false)));
    }
}
