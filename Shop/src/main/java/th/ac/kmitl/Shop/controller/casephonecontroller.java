package th.ac.kmitl.Shop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class casephonecontroller {
    @RequestMapping("/casephone")
    public String getHomePage(Model model) {
        model.addAttribute("greeting", "Welcome!");
        // return casephone.html
        return "casephone";
    }
}
