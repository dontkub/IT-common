package th.ac.kmitl.Shop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class chargheadcontroller {
    @RequestMapping("/charghead")
    public String getHomePage(Model model) {
        model.addAttribute("greeting", "Welcome!");
        // return charghead.html
        return "charghead";
    }
}