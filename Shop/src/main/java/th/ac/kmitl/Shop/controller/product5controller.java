package th.ac.kmitl.Shop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class product5controller {
    @RequestMapping("/product5")
    public String getHomePage(Model model) {
        model.addAttribute("greeting", "Welcome!");
        // return product5.html
        return "product5";
    }
}
