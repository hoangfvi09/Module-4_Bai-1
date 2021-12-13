package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
public class MoneyConverter {

    @GetMapping("/convert")
    public String convert(Model model, @RequestParam int usd) {
        model.addAttribute("vnd", usd*23000);
        return "index";
    }
    @GetMapping("/")
    public String convert() {
        return "index";
    }
}
