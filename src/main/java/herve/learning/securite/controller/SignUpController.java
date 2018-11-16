package herve.learning.securite.controller;

import herve.learning.securite.model.Client;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/signup")
public class SignUpController {

    @RequestMapping(method = RequestMethod.GET)
    public String home(Model model, @ModelAttribute("currentUser")Client client) {


        return "integrated:inscription";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String signup(Model model, @ModelAttribute("currentUser")Client client, final BindingResult errors) {

        if(errors.hasErrors())
            return "redirect:/signup";

        return "redirect:/home";
    }

}
