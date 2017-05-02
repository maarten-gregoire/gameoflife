package be.cegeka.gameoflife.testutils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class GameOfLifeTestData {

    public static List<List<Boolean>> aTwoDimenionalListWithAllCellValues(boolean cellValue) {
        List<List<Boolean>> listOfLists = new ArrayList<>();
        for (int i = 0; i < 10; i ++ ) {
            List<Boolean> listOfBooleans = new ArrayList<>(Arrays.asList(new Boolean[10]));
            Collections.fill(listOfBooleans, cellValue);
            listOfLists.add(listOfBooleans);
        }
        return listOfLists;
    }
}
