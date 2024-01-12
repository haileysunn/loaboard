package io.sun.loaboard.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    @GetMapping("")
    public String index() {
        return "index";
    }

    @GetMapping("dashboard")
    public String dashboard() {
        return "thymeleaf/dashboard";
    }

    @GetMapping("mypage")
    public String mypage() {
        return "thymeleaf/mypage";
    }
}
