package by.itlandia.daluve.controllers;

import by.itlandia.daluve.models.User;
import by.itlandia.daluve.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
//@RequestMapping(path = "/adminka")
public class AdminController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping("/adminka")
    public String adminGet(Model model) {
        Iterable<User> users = userRepository.findAll();
        model.addAttribute("users", users);
        model.addAttribute("title", "Админка. Список пользователей");
        return "adminka";
    }

    @GetMapping("/adminka/add")
    public String adminAdd(Model model) {
        model.addAttribute("title", "Админка. Добавление пользователей");
        return "adminka-add";
    }

    @PostMapping("/adminka/add")
    public String adminAdd(@RequestParam String name,
                           @RequestParam String surname,
                           @RequestParam String login,
                           @RequestParam String password,
                           @RequestParam String email,
                           Model model) {
        User user = new User(name, surname, login, password, email);
        userRepository.save(user);
        return "adminka-add";
    }
}
