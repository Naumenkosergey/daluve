package by.itlandia.daluve.controllers;

import by.itlandia.daluve.models.UtilTable;
import by.itlandia.daluve.repo.UtilRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DoctorsController {

    @Autowired
    UtilRepository utilRepository;

    @GetMapping("/doctor")
    public String doctorsView(Model model){
        Iterable<UtilTable>  utilTables = utilRepository.findAll();
        model.addAttribute("doctors",utilTables);
        model.addAttribute("title","DaLuVe");
        return "doctor";
    }
}
