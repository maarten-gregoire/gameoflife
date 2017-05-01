package be.cegeka.status;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/status")
public class StatusController {

    @RequestMapping(value = "/name")
    @ResponseBody
    public String getApplicationName(){
        return "{\"name\": \"Game of Life\"}";
    }

}
