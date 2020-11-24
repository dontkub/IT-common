package th.ac.kmitl.Shop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class product13controller {
    @RequestMapping("/product13")
    public String getHomePage(Model model) {
        model.addAttribute("greeting", "Welcome!");
        // return product13.html
        return "product13";
    }
}
