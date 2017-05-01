package be.cegeka.gameoflife;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.toList;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


public class CellRowTest {

    private final Boolean ALIVE = true;
    private final Boolean DEAD = false;

    @Test
    public void givenCellValuesAllTrue_whenCreateCellRowFromCellValues_thenAllCellsInCellRowAreAlive() {
        List<Boolean> cellValues = givenCellValuesAllTrue();
        CellRow cellRow = whenCreateCellRowFrom(cellValues);
        thenAllCellsInCellRowAreAlive(cellRow);
    }

    private List<Boolean> givenCellValuesAllTrue() {
        return Arrays.asList(true, true, true);
    }

    private void thenAllCellsInCellRowAreAlive(CellRow cellRow) {
        cellRow.getCells().forEach(cell -> assertTrue(cell.isAlive()));
    }

    @Test
    public void givenCellValuesAllFalse_whenCreateCellRowFromCellValues_thenAllCellsInCellRowAreNotAlive() {
        List<Boolean> cellValues = givenCellValuesAllFalse();
        CellRow cellRow = whenCreateCellRowFrom(cellValues);
        thenAllCellsInCellRowAreNotAlive(cellRow);
    }

    private List<Boolean> givenCellValuesAllFalse() {
        return Arrays.asList(false, false, false);
    }

    private void thenAllCellsInCellRowAreNotAlive(CellRow cellRow) {
        cellRow.getCells().forEach(cell -> assertFalse(cell.isAlive()));
    }

    @Test
    public void givenCellValuesTrueAndFalse_whenCreateCellRowFromCellValues_thenValuesOfCellsInCellRowMatchWitchCellValues() {
        List<Boolean> cellValues = givenCellValuesTrueAndFalse();
        CellRow cellRow = whenCreateCellRowFrom(cellValues);
        thenValuesOfCellsInCellRowMatchWitchCellValues(cellRow, cellValues);
    }

    private void thenValuesOfCellsInCellRowMatchWitchCellValues(CellRow cellRow, List<Boolean> cellValues) {

        assertThat(cellRow.getCells().stream()
            .map(Cell::isAlive)
            .collect(toList()))
            .isEqualTo(cellValues);
    }

    private CellRow whenCreateCellRowFrom(List<Boolean> cellValues) {
        return CellRow.from(cellValues);
    }

    private List<Boolean> givenCellValuesTrueAndFalse() {
        return Arrays.asList(false, true, false, true, true);
    }

    @Test
    public void givenCellRowWithAllCellsAlive_whenGetAsBooleans_thenAllBooleansAreTrue() {
        CellRow cellRow = givenCellrowWithAllCellsAlive();
        List<Boolean> booleans = whenGetAsBooleans(cellRow);
        thenAllBooleansAreTrue(booleans);
    }

    private CellRow givenCellrowWithAllCellsAlive() {
        return CellRow.from(Arrays.asList(true, true, true));
    }

    private void thenAllBooleansAreTrue(List<Boolean> booleans) {
        assertThat(booleans).containsExactly(true, true, true);
    }

    @Test
    public void givenCellRowWithAllCellsDead_whenGetAsBooleans_thenAllBooleansAreFalse() {
        CellRow cellRow = givenCellrowWithAllCellsDead();
        List<Boolean> booleans = whenGetAsBooleans(cellRow);
        thenAllBooleansAreFalse(booleans);
    }

    private CellRow givenCellrowWithAllCellsDead() {
        return CellRow.from(Arrays.asList(true, true, true));
    }

    private void thenAllBooleansAreFalse(List<Boolean> booleans) {
        assertThat(booleans).containsExactly(true, true, true);
    }

    @Test
    public void givenCellRowWithCellsDeadAndAlive_whenGetAsBooleans_thenBooleansMatchWithCells() {
        CellRow cellRow = givenCellrowWithCells(ALIVE, DEAD, ALIVE);
        List<Boolean> booleans = whenGetAsBooleans(cellRow);
        thenBooleansMatch(booleans, true, false, true);
    }

    private CellRow givenCellrowWithCells(Boolean ...aliveStates) {
        return CellRow.from(Arrays.asList(aliveStates));
    }

    private List<Boolean> whenGetAsBooleans(CellRow cellRow) {
        return cellRow.getAsBooleans();
    }

    private void thenBooleansMatch(List<Boolean> booleans, Boolean ...aliveStates) {
        assertThat(booleans).containsExactly(aliveStates);
    }

}
