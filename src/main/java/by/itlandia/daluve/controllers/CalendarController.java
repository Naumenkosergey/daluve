package by.itlandia.daluve.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CalendarController {

    @GetMapping("/calendar")
    public String getCakendar(){
        return "calendar";
    }
}
