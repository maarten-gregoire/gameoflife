package be.cegeka.gameoflife;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.toList;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


public class CellRowTest {

    @Test
    public void givenCellValuesAllTrue_whenCreateCellRowFromCellValues_thenAllCellsInCellRowAreAlive() {
        List<Boolean> cellValues = givenCellValuesAllTrue();
        CellRow cellRow = whenCreateCellRowFrom(cellValues);
        thenAllCellsInCellRowAreAlive(cellRow);
    }

    @Test
    public void givenCellValuesAllFalse_whenCreateCellRowFromCellValues_thenAllCellsInCellRowAreNotAlive() {
        List<Boolean> cellValues = givenCellValuesAllFalse();
        CellRow cellRow = whenCreateCellRowFrom(cellValues);
        thenAllCellsInCellRowAreNotAlive(cellRow);
    }

    @Test
    public void givenCellValuesTrueAndFalse_whenCreateCellRowFromCellValues_thenValuesOfCellsInCellRowMatchWitchCellValues() {
        List<Boolean> cellValues = givenCellValuesTrueAndFalse();
        CellRow cellRow = whenCreateCellRowFrom(cellValues);
        thenValuesOfCellsInCellRowMatchWitchCellValues(cellRow, cellValues);
    }

    private void thenAllCellsInCellRowAreAlive(CellRow cellRow) {
        cellRow.getCells().forEach(cell -> assertTrue(cell.isAlive()));
    }

    private CellRow whenCreateCellRowFrom(List<Boolean> cellValues) {
        return CellRow.from(cellValues);
    }

    private List<Boolean> givenCellValuesAllTrue() {
        return Arrays.asList(true, true, true);
    }

    private void thenAllCellsInCellRowAreNotAlive(CellRow cellRow) {
        cellRow.getCells().forEach(cell -> assertFalse(cell.isAlive()));
    }

    private List<Boolean> givenCellValuesAllFalse() {
        return Arrays.asList(false, false, false);
    }

    private void thenValuesOfCellsInCellRowMatchWitchCellValues(CellRow cellRow, List<Boolean> cellValues) {

        assertThat(cellRow.getCells().stream()
            .map(Cell::isAlive)
            .collect(toList()))
            .isEqualTo(cellValues);
    }

    private List<Boolean> givenCellValuesTrueAndFalse() {
        return Arrays.asList(false, true, false, true, true);
    }
}
