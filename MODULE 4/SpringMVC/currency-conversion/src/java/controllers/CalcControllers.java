package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalcControllers {
    @GetMapping("/")
    public String cal() {
        return "calc";
    }

    @PostMapping("/")
    public String result(@RequestParam double number, Model model) {
        double total = number*22000;
        model.addAttribute("text","huy");
        model.addAttribute("num",number);
        model.addAttribute("rs",total);
        return "calc";
    }
}
