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

@RunWith(MockitoJUnitRunner.class)
public class GenerationMapperTest {

    @InjectMocks
    private GenerationMapper generationMapper;

    @Test
    public void givenGeneration_whenMapToTwoDimensionalList_thenReturnTwoDimensionalList() {
        Generation generation = Generation.from(aTwodimenionalListWithAllCellValues(false));
        List<List<Boolean>> twoDimensionalList = generationMapper.toTwoDimensionalList(generation);
        assertAllElementsFalse(twoDimensionalList);
    }

    private List<List<Boolean>> aTwodimenionalListWithAllCellValues(boolean cellValue) {
        List<List<Boolean>> listOfLists = new ArrayList<>();
        for (int i = 0; i < 10; i ++ ) {
            List<Boolean> listOfBooleans = new ArrayList<>(Arrays.asList(new Boolean[10]));
            Collections.fill(listOfBooleans, cellValue);
            listOfLists.add(listOfBooleans);
        }
        return listOfLists;
    }

}
