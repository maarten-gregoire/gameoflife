package be.cegeka.gameoflife;

import org.junit.Assert;
import org.junit.Test;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class GenerationMapperTest {

    @Test
    public void givenGeneration_whenMapToTwoDimensionalList_thenReturnTwoDimensionalList() {
        Generation generation = Generation.from(createTwodimenionalListWithAllCellValues(false));
        GenerationMapper generationMapper = new GenerationMapper();

        List<List<Boolean>> twoDimensionalList = generationMapper.toTwoDimensionalList(generation);
        thenAllFalse(twoDimensionalList);
    }

    private List<List<Boolean>> createTwodimenionalListWithAllCellValues(boolean cellValue) {
        List<List<Boolean>> listOfLists = new ArrayList<>();
        for (int i = 0; i < 10; i ++ ) {
            List<Boolean> listOfBooleans = new ArrayList<Boolean>(Arrays.asList(new Boolean[10]));
            Collections.fill(listOfBooleans, cellValue);
            listOfLists.add(listOfBooleans);
        }
        return listOfLists;
    }

    private void thenAllFalse(List<List<Boolean>> booleans) {
        booleans.forEach(list -> list.forEach(Assert::assertFalse));
    }
}
