package be.cegeka.gameoflife;

import org.apache.commons.lang3.NotImplementedException;

import javax.inject.Named;
import java.util.ArrayList;
import java.util.List;

public class GenerationMapper {

    Generation toGeneration (List<List<Boolean>> twoDimensionalList) {
        throw new NotImplementedException("Not implemented yet.");
    }

    List<List<Boolean>> toTwoDimensionalList (Generation generation) {
        List<List<Boolean>> twoDimensionalList = new ArrayList<List<Boolean>>();
        generation.getCellRows().forEach(cellRow -> twoDimensionalList.add(cellRow.getAsBooleans()));

        return twoDimensionalList;
    }
}
