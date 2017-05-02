package be.cegeka.gameoflife.domain;

import org.junit.Test;

import static be.cegeka.gameoflife.testutils.GameOfLifeAssert.assertAlive;
import static be.cegeka.gameoflife.testutils.GameOfLifeAssert.assertDead;
import static be.cegeka.gameoflife.testutils.GameOfLifeAssert.assertNumberOfNeighbors;

public class CellTest {

    @Test
    public void givenCellValueTrue_whenCreateCellFromCellValue_thenCellIsAlive() {
        assertAlive(Cell.from(true));
    }

    @Test
    public void givenCellValueFalse_whenCreateCellFromCellValue_thenCellIsNotAlive() {
        assertDead(Cell.from(false));
    }

    @Test
    public void givenCell_whenAddNeighbors_totalNumberOfNeighborsIncreased() {
        Cell cell = Cell.from(true);

        cell.addNeighbors(3);
        cell.addNeighbors(4);

        assertNumberOfNeighbors(cell).isEqualTo(7);
    }
}
