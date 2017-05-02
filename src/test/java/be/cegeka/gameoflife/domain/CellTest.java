package be.cegeka.gameoflife.domain;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class CellTest {

    @Test
    public void givenCellValueTrue_whenCreateCellFromCellValue_thenCellIsAlive() {
        boolean cellValue = givenTrue();
        Cell cell = whenCreateCellFrom(cellValue);
        thenIsAlive(cell);
    }

    @Test
    public void givenCellValueFalse_whenCreateCellFromCellValue_thenCellIsNotAlive() {
        boolean cellValue = givenFalse();
        Cell cell = whenCreateCellFrom(cellValue);
        thenIsNotAlive(cell);
    }

    private Cell whenCreateCellFrom(boolean cellValue) {
        return Cell.from(cellValue);
    }

    private boolean givenTrue() {
        return true;
    }

    private void thenIsAlive(Cell cell) {
        assertTrue(cell.isAlive());
    }

    private void thenIsNotAlive(Cell cell) {
        assertFalse(cell.isAlive());
    }

    private boolean givenFalse() {
        return false;
    }

    @Test
    public void givenCell_whenAddNeighbors_totalNumberOfNeighborsIncreased() {
        Cell cell = Cell.from(true);
        cell.addNeighbors(3);
        cell.addNeighbors(4);
        assertThat(cell.getNumberOfNeighbors()).isEqualTo(7);
    }
}
