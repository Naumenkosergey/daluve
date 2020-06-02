package by.itlandia.daluve.controllers;

import by.itlandia.daluve.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SignInController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping("/")
    public String autorization(Model model) {
        model.addAttribute("title", "DaLuVe");
        return "signin";
    }

    @PostMapping("/")
    public String signIn(@RequestParam String login,
                         @RequestParam String password,
                         Model model) {
//        if (userRepository.findByLogin(login))

        return "redirect:/home";
    }
}
