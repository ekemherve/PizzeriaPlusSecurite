package herve.learning.securite.controller;

import herve.learning.securite.model.Role;
import herve.learning.securite.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/roles")
public class RoleController {

    @Autowired
    private RoleService roleService;

    @RequestMapping(method = RequestMethod.GET)
    public String home(Model model) {

        return "integrated:role";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String register(Model model, @ModelAttribute("role")Role role, final BindingResult errors) {

        if(errors.hasErrors())
            return "integrated:errors";

        Role roleSaved = roleService.save(role);

        System.out.println(roleSaved);

        return "redirect:/home";
    }
}
