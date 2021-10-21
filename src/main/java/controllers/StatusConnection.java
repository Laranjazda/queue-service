package controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StatusConnection {
    @GetMapping(path = "/api/status")
    public String checkStatus(){
        return "H.S.O.B." + "\nHorny son of a bitch ONLINE";
    }
}
