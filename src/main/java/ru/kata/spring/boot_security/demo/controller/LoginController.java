package ru.kata.spring.boot_security.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
@RequestMapping("/")
public class LoginController {

    @GetMapping("/")
    public String login() {
        return "login";
    }

    @GetMapping("/login")
    public RedirectView redirect() {
        return new RedirectView("/");
    }
}