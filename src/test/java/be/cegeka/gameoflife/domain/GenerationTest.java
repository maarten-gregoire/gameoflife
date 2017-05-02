package be.cegeka.gameoflife.domain;

import org.junit.Test;

import java.util.*;

import static be.cegeka.gameoflife.testutils.GameOfLifeAssert.*;

public class GenerationTest {

    @Test
    public void givenTwodimenionalListWithAllCellValuesTrue_whenGenerationFromCellValues_thenAllCellsInGenerationAreAlive() {
        List<List<Boolean>> cellValues = twodimenionalListWithAllCellValues(true);
        assertAllAlive(Generation.from(cellValues));
    }

    @Test
    public void givenTwodimenionalListWithAllCellValuesFalse_whenGenerationFromCellValues_thenAllCellsInGenerationAreNotAlive() {
        List<List<Boolean>> cellValues = twodimenionalListWithAllCellValues(false);
        assertAllDead(Generation.from(cellValues));
    }

    private List<List<Boolean>> twodimenionalListWithAllCellValues(boolean cellValue) {
        List<List<Boolean>> listOfLists = new ArrayList<>();
        for (int i = 0; i < 10; i ++ ) {
            List<Boolean> listOfBooleans = new ArrayList<Boolean>(Arrays.asList(new Boolean[10]));
            Collections.fill(listOfBooleans, cellValue);
            listOfLists.add(listOfBooleans);
        }
        return listOfLists;
    }
}
