package be.cegeka.gameoflife.service;

import be.cegeka.gameoflife.domain.Generation;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static be.cegeka.gameoflife.testutils.GameOfLifeAssert.assertAllElementsFalse;
import static be.cegeka.gameoflife.testutils.GameOfLifeTestData.aTwoDimenionalListWithAllCellValues;

@RunWith(MockitoJUnitRunner.class)
public class GenerationMapperTest {

    @InjectMocks
    private GenerationMapper generationMapper;

    @Test
    public void givenGeneration_whenMapToTwoDimensionalList_thenReturnTwoDimensionalList() {
        Generation generation = Generation.from(aTwoDimenionalListWithAllCellValues(false));
        List<List<Boolean>> twoDimensionalList = generationMapper.toTwoDimensionalList(generation);
        assertAllElementsFalse(twoDimensionalList);
    }
}
