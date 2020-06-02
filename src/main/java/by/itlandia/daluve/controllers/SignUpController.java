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
public class SignUpController {
    @Autowired
    UserRepository userRepository;

    @GetMapping("/signUp")
    public String signUp() {
        return "signup";
    }

    @PostMapping("/signUp")
    public String addUser(@RequestParam String name,
                          @RequestParam String surname,
                          @RequestParam String login,
                          @RequestParam String password,
                          @RequestParam String reppassword,
                          @RequestParam String email,
                          Model model) {
        if(name.matches("[a-zA-ZА-Яа-яЁё]+")&&
                surname.matches("[a-zA-ZА-Яа-яЁё]+")&&
                login.matches("\\w{6,}")&&
                password.matches(".{8,}")&&
                reppassword.equals(password)&&
                email.matches("\\w{4,}@\\w{3,}\\.\\w{2,4}")) {

            User user = new User(name, surname, login, password, email);
            userRepository.save(user);
            return "sign-up-succes";

        }
        else {
            return "redirect:/signUp";
        }

    }
}
