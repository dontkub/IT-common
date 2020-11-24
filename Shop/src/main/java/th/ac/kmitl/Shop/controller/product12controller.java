package th.ac.kmitl.Shop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class product12controller {
    @RequestMapping("/product12")
    public String getHomePage(Model model) {
        model.addAttribute("greeting", "Welcome!");
        // return product12.html
        return "product12";
    }
}
