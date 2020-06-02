package by.itlandia.daluve.controllers;

import by.itlandia.daluve.models.User;
import by.itlandia.daluve.repo.UserRepository;
import org.hibernate.mapping.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Collections;
import java.util.Map;

@Controller
public class RegistrController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/registr")
    public String registr() {
        return "registr";
    }

//    @PostMapping("/registr")
//    public String addUser(User user, Map<String, Object> model) {
//        User userFromDB = userRepository.findByLogin(user.getUsername());
//        if (userFromDB != null) {
//            model.put("message", "user exists");
//            return "registr";
//        }
////        user.setRoles(Collections.singleton());
//        return "redirect :/username";
//    }
}
