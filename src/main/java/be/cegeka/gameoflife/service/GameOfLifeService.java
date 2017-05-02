package be.cegeka.gameoflife.service;

import org.apache.commons.lang3.NotImplementedException;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;

@Named
public class GameOfLifeService {

    @Inject
    GenerationMapper generationMapper;

    public List<List<Boolean>> getNextGeneration(List<List<Boolean>> generation) {
        // GenerationMapper generationMapper = new GenerationMapper();
        //return generationMapper.toTwoDimensionalList(Generation.from(currentGeneration).getNextGeneration());
        throw new NotImplementedException("Not implemented yet");
    }
}
