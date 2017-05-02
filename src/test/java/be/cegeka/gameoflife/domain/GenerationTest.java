package be.cegeka.gameoflife.domain;

import org.junit.Test;

import java.util.*;

import static be.cegeka.gameoflife.testutils.GameOfLifeAssert.*;
import static be.cegeka.gameoflife.testutils.GameOfLifeTestData.aTwoDimenionalListWithAllCellValues;

public class GenerationTest {

    @Test
    public void givenTwodimenionalListWithAllCellValuesTrue_whenGenerationFromCellValues_thenAllCellsInGenerationAreAlive() {
        List<List<Boolean>> cellValues = aTwoDimenionalListWithAllCellValues(true);
        assertAllAlive(Generation.from(cellValues));
    }

    @Test
    public void givenTwodimenionalListWithAllCellValuesFalse_whenGenerationFromCellValues_thenAllCellsInGenerationAreNotAlive() {
        List<List<Boolean>> cellValues = aTwoDimenionalListWithAllCellValues(false);
        assertAllDead(Generation.from(cellValues));
    }
}
