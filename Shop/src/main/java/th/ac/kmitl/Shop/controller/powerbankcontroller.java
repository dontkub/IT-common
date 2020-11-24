package th.ac.kmitl.Shop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class powerbankcontroller {
    @RequestMapping("/powerbank")
    public String getHomePage(Model model) {
        model.addAttribute("greeting", "Welcome!");
        // return powerbank.html
        return "powerbank";
    }
}

