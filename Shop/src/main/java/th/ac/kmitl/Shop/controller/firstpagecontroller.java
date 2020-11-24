package th.ac.kmitl.Shop.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class firstpagecontroller {
    @RequestMapping("/firstpage")
    public String getHomePage(Model model) {
        model.addAttribute("greeting", "Welcome!");
        // return home.html
        return "firstpage";
    }
}


