package by.itlandia.daluve.controllers;

import by.itlandia.daluve.models.UtilTable;
import by.itlandia.daluve.repo.UtilRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MedecineController {

    @Autowired
    UtilRepository utilRepository;
    @GetMapping("/hospital")
    public String mediceneMain(Model model) {
        Iterable<UtilTable> utilTables = utilRepository.findAll();
        model.addAttribute("hospitals", utilTables);
        model.addAttribute("title", "DaLuVe");
        return "hospital";
    }
    @PostMapping("/hospital")
    public String mediceneMain(@RequestParam String name,
                               @RequestParam String password,
                               Model model) {
        model.addAttribute("title", "DaLuVE");
        return "hospital";
    }
}
