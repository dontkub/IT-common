package th.ac.kmitl.Shop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class product20controller {
    @RequestMapping("/product20")
    public String getHomePage(Model model) {
        model.addAttribute("greeting", "Welcome!");
        // return product20.html
        return "product20";
    }
}
