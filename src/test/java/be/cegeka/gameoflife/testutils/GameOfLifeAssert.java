package be.cegeka.gameoflife.testutils;

import be.cegeka.gameoflife.domain.Cell;
import org.assertj.core.api.AbstractIntegerAssert;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class GameOfLifeAssert{

    public static void assertAlive(Cell cell) {
        assertTrue(cell.isAlive());
    }

    public static void assertDead(Cell cell) {
        assertFalse(cell.isAlive());
    }

    public static AbstractIntegerAssert<?> assertNumberOfNeighbors(Cell cell) {
        return assertThat(cell.getNumberOfNeighbors());
    }
}
