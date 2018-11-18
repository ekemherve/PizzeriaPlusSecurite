package herve.learning.securite.service;


import herve.learning.securite.dataAccess.dao.PizzaDAO;
import herve.learning.securite.model.Pizza;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PizzaService {

    @Autowired
    private PizzaDAO pizzaDAO;

    public Pizza save(Pizza pizza) {

        if(pizza != null)
            return pizzaDAO.save(pizza);
        return null;
    }
}
