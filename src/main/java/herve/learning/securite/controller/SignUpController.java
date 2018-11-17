package herve.learning.securite.controller;

import herve.learning.securite.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import static herve.learning.securite.model.Constant.CURRENT_USER;

@Controller
@RequestMapping(value = "/signup")
@SessionAttributes({CURRENT_USER})
public class SignUpController {


    @ModelAttribute(CURRENT_USER)
    public User client(){

        return  new User();
    }


    @RequestMapping(method = RequestMethod.GET)
    public String home(Model model, @ModelAttribute(CURRENT_USER) User user) {

        if(user == null)
            model.addAttribute(CURRENT_USER, new User());

        return "integrated:inscription";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String signup(Model model, @ModelAttribute(CURRENT_USER) User user, final BindingResult errors) {

        System.out.println(user);



        if(errors.hasErrors())
            return "redirect:/signup";

        return "redirect:/";
    }

}
