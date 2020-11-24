package th.ac.kmitl.Shop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class product8controller {
    @RequestMapping("/product8")
    public String getHomePage(Model model) {
        model.addAttribute("greeting", "Welcome!");
        // return product8.html
        return "product8";
    }
}
