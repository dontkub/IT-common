package th.ac.kmitl.Shop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class product14controller {
    @RequestMapping("/product14")
    public String getHomePage(Model model) {
        model.addAttribute("greeting", "Welcome!");
        // return product14.html
        return "product14";
    }
}
