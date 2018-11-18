package herve.learning.securite.dataAccess.util;


import herve.learning.securite.dataAccess.entity.IngredientEntity;
import herve.learning.securite.model.Ingredient;
import org.springframework.stereotype.Service;

@Service
public class IngredientProvider {

    public Ingredient ingredientEntityToIngredient(IngredientEntity ingredientEntity) {

        Ingredient ingredient = new Ingredient();
        if(ingredient.getId() != null)
            ingredient.setId(ingredientEntity.getId());
        ingredient.setName(ingredientEntity.getName());
        ingredient.setStock(ingredientEntity.getStock());

        return ingredient;
    }

    public IngredientEntity ingredientToIngredientEntity(Ingredient ingredient) {

        IngredientEntity ingredientEntity = new IngredientEntity();
        ingredientEntity.setName(ingredient.getName());
        ingredientEntity.setStock(ingredient.getStock());
        if(ingredient.getId() != null)
            ingredientEntity.setId(ingredient.getId());
        return ingredientEntity;
    }
}
