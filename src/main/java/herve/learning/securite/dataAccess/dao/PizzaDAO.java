package herve.learning.securite.dataAccess.dao;

import herve.learning.securite.dataAccess.entity.PizzaEntity;
import herve.learning.securite.dataAccess.repository.PizzaRepository;
import herve.learning.securite.dataAccess.util.PizzaProvider;
import herve.learning.securite.model.Pizza;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Set;
import java.util.stream.Collectors;

@Service
@Transactional
public class PizzaDAO {

    @Autowired
    private PizzaProvider pizzaProvider;

    @Autowired
    private PizzaRepository pizzaRepository;

    public Set<Pizza> findAll() {

        return pizzaRepository.findAll()
                .stream()
                .map(pizzaEntity -> pizzaProvider.pizzaEntityToPizza(pizzaEntity))
                .collect(Collectors.toSet());
    }

    public Pizza save(Pizza pizza) {

        PizzaEntity pizzaEntity = pizzaProvider.pizzaToPizzaEntity(pizza);

        return pizzaProvider.pizzaEntityToPizza(pizzaRepository.save(pizzaEntity));
    }
}
