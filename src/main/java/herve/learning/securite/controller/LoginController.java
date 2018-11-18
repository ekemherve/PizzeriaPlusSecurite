package herve.learning.securite.controller;

import herve.learning.securite.dataAccess.entity.UserEntity;
import herve.learning.securite.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import static herve.learning.securite.model.Constant.CURRENT_USER;

@Controller
@RequestMapping(value = "/login")
public class LoginController {

    @RequestMapping(method = RequestMethod.GET)
    public String home(Model model) {

        model.addAttribute("user", new User());
        return "integrated:login";
    }
}
