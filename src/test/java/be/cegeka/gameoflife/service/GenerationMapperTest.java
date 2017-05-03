package be.cegeka.gameoflife.service;

import be.cegeka.gameoflife.domain.Generation;
import com.sun.org.apache.xpath.internal.operations.Bool;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.List;

import static be.cegeka.gameoflife.testutils.GameOfLifeAssert.assertAllAlive;
import static be.cegeka.gameoflife.testutils.GameOfLifeAssert.assertAllElementsFalse;
import static be.cegeka.gameoflife.testutils.GameOfLifeTestData.aTwoDimensionalListWithAllElements;

@RunWith(MockitoJUnitRunner.class)
public class GenerationMapperTest {

    @InjectMocks
    private GenerationMapper generationMapper;

    @Test
    public void givenGeneration_whenMapToTwoDimensionalList_thenReturnTwoDimensionalList() {
        Generation generation = Generation.from(aTwoDimensionalListWithAllElements(false));
        List<List<Boolean>> twoDimensionalList = generationMapper.toTwoDimensionalList(generation);
        assertAllElementsFalse(twoDimensionalList);
    }

    @Test
    public void givenTwoDimensionalList_whenMapToGeneration_thenReturnGeneration() {
        List<List<Boolean>> twoDimensionalList = aTwoDimensionalListWithAllElements(true);
        Generation generation = generationMapper.toGeneration(twoDimensionalList);
        assertAllAlive(generation);
    }
}
