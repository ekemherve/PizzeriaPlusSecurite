package herve.learning.securite.controller;


import herve.learning.securite.model.Ingredient;
import herve.learning.securite.model.User;
import herve.learning.securite.service.IngredientService;
import herve.learning.securite.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import static herve.learning.securite.model.Constant.CURRENT_USER;

@Controller
@RequestMapping(value = "/ingredient")
public class IngredientController {

    @Autowired
    private IngredientService ingredientService;


    @RequestMapping(method = RequestMethod.GET)
    public String home(Model model) {

        model.addAttribute("ingredient", new Ingredient());

        return "integrated:ingredient";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String register(Model model, @ModelAttribute("ingredient") Ingredient ingredient, final BindingResult errors) {

        Ingredient saved = ingredientService.save(ingredient);

        System.out.println(saved);

        //Ne pas oublier de gerer les erreurs liées aux validations du formulaire
        if(errors.hasErrors())
            return "redirect:/signup";

        return "redirect:/";
    }
}
