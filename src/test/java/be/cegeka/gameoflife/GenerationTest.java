package be.cegeka.gameoflife;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class GenerationTest {

    @Test
    public void givenTwodimenionalListWithAllCellValuesTrue_whenGenerationFromCellValues_thenAllCellsInGenerationAreAlive() {
        List<List<Boolean>> cellValues = createTwodimenionalListWithAllCellValues(true);
        Generation generation = whenGenerationFrom(cellValues);
        thenAllCellsInGenerationAreAlive(generation);
    }

    private void thenAllCellsInGenerationAreAlive(Generation generation) {
        List<CellRow> generationOfCells = generation.getCellRows();
        generationOfCells.forEach(row -> row.getCells().forEach(cell -> assertTrue(cell.isAlive())));
    }

    @Test
    public void givenTwodimenionalListWithAllCellValuesFalse_whenGenerationFromCellValues_thenAllCellsInGenerationAreNotAlive() {
        List<List<Boolean>> cellValues = createTwodimenionalListWithAllCellValues(false);
        Generation generation = whenGenerationFrom(cellValues);
        thenAllCellsInGenerationAreNotAlive(generation);
    }

    private List<List<Boolean>> createTwodimenionalListWithAllCellValues(boolean cellValue) {
        List<List<Boolean>> listOfLists = new ArrayList<>();
        for (int i = 0; i < 10; i ++ ) {
            List<Boolean> listOfBooleans = new ArrayList<Boolean>(Arrays.asList(new Boolean[10]));
            Collections.fill(listOfBooleans, cellValue);
            listOfLists.add(listOfBooleans);
        }
        return listOfLists;
    }

    private Generation whenGenerationFrom(List<List<Boolean>> cellValues) {
        return Generation.from(cellValues);
    }

    private void thenAllCellsInGenerationAreNotAlive(Generation generation) {
        List<CellRow> generationOfCells = generation.getCellRows();
        generationOfCells.forEach(row -> row.getCells().forEach(cell -> assertFalse(cell.isAlive())));
    }

}
