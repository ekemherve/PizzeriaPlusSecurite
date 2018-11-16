package herve.learning.securite.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/inscription")
public class InscriptionController {

    public String home() {

        return "integrated:inscription";
    }
}
