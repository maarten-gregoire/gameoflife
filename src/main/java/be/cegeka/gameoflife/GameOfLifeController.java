package be.cegeka.gameoflife;

import org.apache.commons.lang3.NotImplementedException;
import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

@RestController
@RequestMapping(value = "/gameoflife")
public class GameOfLifeController {

    private static Logger logger = Logger.getLogger(GameOfLifeController.class);

    @RequestMapping(value = "/world", method = POST)
    @ResponseBody
    public List<List<Boolean>> getNextGeneration(@RequestBody List<List<Boolean>> currentGeneration){
       // GenerationMapper generationMapper = new GenerationMapper();
       //return generationMapper.toTwoDimensionalList(Generation.from(currentGeneration).getNextGeneration());
        throw new NotImplementedException("Not implemented yet");
    }

}
