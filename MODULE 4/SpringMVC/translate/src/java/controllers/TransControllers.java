package controllers;

import models.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

@Controller
public class TransControllers {

    private Map<String, String> dictionary = new HashMap<String, String>();

    public TransControllers() {
        dictionary.put("HOUSE", "Nhà");
        dictionary.put("SCHOOL", "Trường học");
        dictionary.put("COMPANY", "Công ty");
        dictionary.put("RESTAURANT", "Nhà hàng");
    }

//    @GetMapping("/")
//    public String index(Model model, @RequestParam(value="search", required = false) String huy) {
//        String result = dictionary.get(huy.toUpperCase());
//        model.addAttribute("mess", huy);
//        if (result == null) {
//            model.addAttribute("result","Khong ton tai");
//        } else {
//            model.addAttribute("result", result);
//        }
//        return "index";
//    }

    @GetMapping("/")
    public ModelAndView index(@RequestParam(value="search", required = false) String huy, @ModelAttribute("hocsinh") Student hs) {
        ModelAndView mv = new ModelAndView("index");

//        String result = dictionary.get(huy.toUpperCase());
        // model.addAttribute("mess", huy);
        mv.addObject("mess", hs.name);
//        if (result == null) {
//            mv.addObject("result", "Khong ton tai");
//        } else {
//            mv.addObject("result", result);
//        }
        return mv;
    }

    @ModelAttribute("hocsinh")
    public Student getStudent(){
        return new Student(12, "huy");
    }

}
