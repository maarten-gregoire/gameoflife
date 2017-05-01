package be.cegeka.gameoflife;


import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class WorldTest {

    @Test
    public void givenTwodimenionalListWithAllCellValuesTrue_whenWorldFromCellValues_thenAllCellsInWorldAreAlive() {
        List<List<Boolean>> cellValues = givenTwodimenionalListWithAllCellValues(true);
        World world = whenWorldFrom(cellValues);
        thenAllCellsInWorldAreAlive(world);
    }

    @Test
    public void givenTwodimenionalListWithAllCellValuesFalse_whenWorldFromCellValues_thenAllCellsInWorldAreNotAlive() {
        List<List<Boolean>> cellValues = givenTwodimenionalListWithAllCellValues(false);
        World world = whenWorldFrom(cellValues);
        thenAllCellsInWorldAreNotAlive(world);
    }

    private void thenAllCellsInWorldAreAlive(World world) {
        List<CellRow> worldOfCells = world.getCellRows();
        worldOfCells.forEach(row -> row.getCells().forEach(cell -> assertTrue(cell.isAlive())));
    }

    private World whenWorldFrom(List<List<Boolean>> cellValues) {
        return World.from(cellValues);
    }

    private List<List<Boolean>> givenTwodimenionalListWithAllCellValues(boolean cellValue) {
        List<List<Boolean>> listOfLists = new ArrayList<>();
        for (int i = 0; i < 10; i ++ ) {
            List<Boolean> listOfBooleans = new ArrayList<Boolean>(Arrays.asList(new Boolean[10]));
            Collections.fill(listOfBooleans, cellValue);
            listOfLists.add(listOfBooleans);
        }
        return listOfLists;
    }

    private void thenAllCellsInWorldAreNotAlive(World world) {
        List<CellRow> worldOfCells = world.getCellRows();
        worldOfCells.forEach(row -> row.getCells().forEach(cell -> assertFalse(cell.isAlive())));
    }
}
