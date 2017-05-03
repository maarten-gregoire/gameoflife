package be.cegeka.gameoflife.service;

import be.cegeka.gameoflife.domain.Generation;
import com.sun.org.apache.xpath.internal.operations.Bool;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.List;

import static be.cegeka.gameoflife.testutils.GameOfLifeAssert.*;
import static be.cegeka.gameoflife.testutils.GameOfLifeTestData.aTwoDimensionalListWithAllElements;

@RunWith(MockitoJUnitRunner.class)
public class GenerationMapperTest {

    @InjectMocks
    private GenerationMapper generationMapper;

    @Test
    public void givenGenerationAllDead_whenMapToTwoDimensionalList_thenReturnTwoDimensionalList() {
        Generation generation = Generation.from(aTwoDimensionalListWithAllElements(false));
        List<List<Boolean>> twoDimensionalList = generationMapper.toTwoDimensionalList(generation);
        assertAllElementsFalse(twoDimensionalList);
    }

    @Test
    public void givenGenerationAllAlive_whenMapToTwoDimensionalList_thenReturnTwoDimensionalList() {
        Generation generation = Generation.from(aTwoDimensionalListWithAllElements(true));
        List<List<Boolean>> twoDimensionalList = generationMapper.toTwoDimensionalList(generation);
        assertAllElementsTrue(twoDimensionalList);
    }

    @Test
    public void givenTwoDimensionalListAllTrue_whenMapToGeneration_thenReturnGenerationAllCellsAlive() {
        List<List<Boolean>> twoDimensionalList = aTwoDimensionalListWithAllElements(true);
        Generation generation = generationMapper.toGeneration(twoDimensionalList);
        assertAllAlive(generation);
    }

    @Test
    public void givenTwoDimensionalListAllFalse_whenMapToGeneration_thenReturnGenerationAllCellsDead() {
        List<List<Boolean>> twoDimensionalList = aTwoDimensionalListWithAllElements(false);
        Generation generation = generationMapper.toGeneration(twoDimensionalList);
        assertAllDead(generation);
    }
}
