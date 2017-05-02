package be.cegeka.gameoflife.controller;

import be.cegeka.gameoflife.service.GameOfLifeService;
import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;
import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

@RestController
@RequestMapping(value = "/gameoflife")
public class GameOfLifeController {

    @Inject
    private GameOfLifeService gameOfLifeService;

    private static Logger logger = Logger.getLogger(GameOfLifeController.class);

    @RequestMapping(value = "/world", method = POST)
    @ResponseBody
    public List<List<Boolean>> getNextGeneration(@RequestBody List<List<Boolean>> currentGeneration){
        return gameOfLifeService.getNextGeneration(currentGeneration);
    }

}
