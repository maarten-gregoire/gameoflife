package be.cegeka.gameoflife.service;

import be.cegeka.gameoflife.domain.Generation;
import org.apache.commons.lang3.NotImplementedException;

import javax.inject.Named;
import java.util.ArrayList;
import java.util.List;

@Named
public class GenerationMapper {

    Generation toGeneration (List<List<Boolean>> twoDimensionalList) {
        throw new NotImplementedException("Not implemented yet.");
    }

    List<List<Boolean>> toTwoDimensionalList (Generation generation) {
        List<List<Boolean>> twoDimensionalList = new ArrayList<List<Boolean>>();
    //    generation.getCells().forEach((position, cell) -> twoDimensionalList.add(cell.isAlive()));

        return twoDimensionalList;
    }
}
