package be.cegeka.gameoflife.testutils;

import be.cegeka.gameoflife.domain.Cell;
import be.cegeka.gameoflife.domain.Generation;
import org.assertj.core.api.AbstractIntegerAssert;
import org.junit.Assert;

import java.util.List;

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

    public static void assertAllAlive(Generation generation) {
        generation.getCells().forEach(((position, cell) -> assertAlive(cell)));
    }

    public static void assertAllDead(Generation generation) {
        generation.getCells().forEach(((position, cell) -> assertDead(cell)));
    }

    public static AbstractIntegerAssert<?> assertNumberOfNeighbors(Cell cell) {
        return assertThat(cell.getNumberOfNeighbors());
    }

    public static void assertAllElementsFalse(List<List<Boolean>> booleans) {
        booleans.forEach(list -> list.forEach(Assert::assertFalse));
    }
}
