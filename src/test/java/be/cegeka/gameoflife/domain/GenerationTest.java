package be.cegeka.gameoflife.domain;

import org.junit.Test;

import java.util.*;

import static be.cegeka.gameoflife.testutils.GameOfLifeAssert.*;
import static be.cegeka.gameoflife.testutils.GameOfLifeTestData.aTwoDimenionalListWithAllCellValues;

public class GenerationTest {

    @Test
    public void givenTwodimenionalListWithAllCellValuesTrue_whenGenerationFromCellValues_thenAllCellsInGenerationAreAlive() {
        assertAllAlive(Generation.from(aTwoDimenionalListWithAllCellValues(true)));
    }

    @Test
    public void givenTwodimenionalListWithAllCellValuesFalse_whenGenerationFromCellValues_thenAllCellsInGenerationAreNotAlive() {
        assertAllDead(Generation.from(aTwoDimenionalListWithAllCellValues(false)));
    }
}
