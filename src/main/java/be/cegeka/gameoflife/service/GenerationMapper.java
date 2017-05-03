package be.cegeka.gameoflife.service;

import be.cegeka.gameoflife.domain.Cell;
import be.cegeka.gameoflife.domain.Generation;
import be.cegeka.gameoflife.domain.Position;
import org.apache.commons.lang3.NotImplementedException;

import javax.inject.Named;
import java.util.List;

import static be.cegeka.gameoflife.domain.Generation.aGeneration;

@Named
public class GenerationMapper {

    public Generation toGeneration (List<List<Boolean>> twoDimensionalList) {
        Generation generation = aGeneration();
        twoDimensionalList.forEach(row ->
            row.forEach(element ->
                generation.addCell(
                    findPosition(twoDimensionalList, row, element),
                    Cell.from(element)
                )));

        return generation;
    }

    private Position findPosition(List<List<Boolean>> twoDimensionalList, List<Boolean> row, Boolean element) {
        return new Position(twoDimensionalList.indexOf(row),
            row.indexOf(element));
    }

    public List<List<Boolean>> toTwoDimensionalList (Generation generation) {
        throw new NotImplementedException("not implemented");
//        List<List<Boolean>> twoDimensionalList = new ArrayList<List<Boolean>>();
    //    generation.getCells().forEach((position, cell) -> twoDimensionalList.add(cell.isAlive()));

  //      return twoDimensionalList;
    }
}
