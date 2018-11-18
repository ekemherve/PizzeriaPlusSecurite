package herve.learning.securite.dataAccess.util;


import herve.learning.securite.dataAccess.entity.PizzaEntity;
import herve.learning.securite.model.Pizza;
import org.springframework.stereotype.Service;

@Service
public class PizzaProvider {

    public Pizza pizzaEntityToPizza(PizzaEntity pizzaEntity){

        Pizza pizza = new Pizza();
        pizza.setName(pizzaEntity.getName());
        pizza.setDescription(pizzaEntity.getDescription());
        if(pizzaEntity.getId() != null)
            pizza.setId(pizzaEntity.getId());

        return pizza;
    }

    public PizzaEntity pizzaToPizzaEntity(Pizza pizza){

        PizzaEntity pizzaEntity = new PizzaEntity();

        pizzaEntity.setName(pizza.getName());
        pizzaEntity.setDescription(pizza.getDescription());
        if(pizza.getId() != null)
            pizzaEntity.setId(pizza.getId());

        return pizzaEntity;
    }
}
