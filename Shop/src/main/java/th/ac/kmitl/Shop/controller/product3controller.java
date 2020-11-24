package th.ac.kmitl.Shop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class product3controller {
    @RequestMapping("/product3")
    public String getHomePage(Model model) {
        model.addAttribute("greeting", "Welcome!");
        // return product3.html
        return "product3";
    }
}
