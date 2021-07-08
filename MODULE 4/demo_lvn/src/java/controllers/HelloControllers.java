package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloControllers {
    @GetMapping("/hello")
    public String helloWord() {
        return "hello";
    }
}