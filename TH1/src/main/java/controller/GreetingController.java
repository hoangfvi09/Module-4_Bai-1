package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {
    @GetMapping("/")
    public String age() {
//        model.addAttribute("name", name);
//        int age = (Integer) model.getAttribute("age");
        return "age";
    }

    @GetMapping("/total")
    public String showTinhTong() {
//        model.addAttribute("name", name);
//        int age = (Integer) model.getAttribute("age");
        return "total";
    }

    //    @GetMapping("/showAge")
//    public String showAge(@RequestParam int age, Model model) {
//        model.addAttribute("age1", age);
//        return "index";
//    }
    @PostMapping("/")
    public String showAge(@RequestParam int age, String name, Model model) {
        model.addAttribute("age1", age);
        model.addAttribute("name1", name);
        return "index";
    }

    @GetMapping("/tinhtong")
    public String sum(Model model, @RequestParam int a, int b) {
        model.addAttribute("sum", a + b);
        return "sum";

    }


}