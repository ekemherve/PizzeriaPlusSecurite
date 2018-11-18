package herve.learning.securite.service;

import herve.learning.securite.dataAccess.dao.IngredientDAO;
import herve.learning.securite.model.Ingredient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class IngredientService {


    @Autowired
    private IngredientDAO ingredientDAO;

    public Ingredient save(Ingredient ingredient) {

        if(ingredient != null)
            return ingredientDAO.save(ingredient);
        return null;
    }

    public Set<Ingredient> findAll() {

        return ingredientDAO.findAll();
    }
}
