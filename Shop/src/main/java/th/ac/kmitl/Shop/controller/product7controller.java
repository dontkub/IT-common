package th.ac.kmitl.Shop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class product7controller {
    @RequestMapping("/product7")
    public String getHomePage(Model model) {
        model.addAttribute("greeting", "Welcome!");
        // return product7.html
        return "product7";
    }
}