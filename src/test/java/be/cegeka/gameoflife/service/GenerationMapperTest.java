package be.cegeka.gameoflife.service;

import be.cegeka.gameoflife.domain.Generation;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.List;

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
}
