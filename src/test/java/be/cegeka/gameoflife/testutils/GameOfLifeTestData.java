package be.cegeka.gameoflife.testutils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class GameOfLifeTestData {

    public static List<List<Boolean>> aTwoDimenionalListWithAllElements(boolean value) {
        List<List<Boolean>> listOfLists = new ArrayList<>();
        for (int i = 0; i < 10; i ++ ) {
            List<Boolean> list = new ArrayList<>(Arrays.asList(new Boolean[10]));
            Collections.fill(list, value);
            listOfLists.add(list);
        }
        return listOfLists;
    }
}
