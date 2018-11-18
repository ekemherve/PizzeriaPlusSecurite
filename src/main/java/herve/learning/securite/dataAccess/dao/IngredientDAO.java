package herve.learning.securite.dataAccess.dao;

import herve.learning.securite.dataAccess.entity.IngredientEntity;
import herve.learning.securite.dataAccess.repository.IngredientRepository;
import herve.learning.securite.dataAccess.util.IngredientProvider;
import herve.learning.securite.model.Ingredient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Set;
import java.util.stream.Collectors;

@Service
@Transactional
public class IngredientDAO {

    @Autowired
    private IngredientProvider ingredientProvider;

    @Autowired
    private IngredientRepository ingredientRepository;

    public Ingredient save(Ingredient ingredient) {

        IngredientEntity ingredientEntity = ingredientProvider.ingredientToIngredientEntity(ingredient);

        return ingredientProvider.ingredientEntityToIngredient(ingredientRepository.save(ingredientEntity));
    }

    public Set<Ingredient> findAll() {

        Set<IngredientEntity> ingredientEntities = ingredientRepository.findAll().stream().collect(Collectors.toSet());

        return ingredientEntities.stream()
                    .map(ingredientEntity -> ingredientProvider.ingredientEntityToIngredient(ingredientEntity))
                    .collect(Collectors.toSet());
    }

    public Ingredient findByName(String name) {

        IngredientEntity ingredientEntity = ingredientRepository.findByName(name);

        return ingredientProvider.ingredientEntityToIngredient(ingredientEntity);
    }
}
