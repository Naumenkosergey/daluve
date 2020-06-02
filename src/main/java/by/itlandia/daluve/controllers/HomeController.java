package by.itlandia.daluve.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/home")
    public String home(Model model) {
        model.addAttribute("title", "DaLuVe");
        return "indexq"; //имя страницы (шаблона)
    }
}
