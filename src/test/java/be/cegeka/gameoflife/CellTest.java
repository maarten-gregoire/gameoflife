package be.cegeka.gameoflife;

import org.junit.Test;

import static org.junit.Assert.*;

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
}
