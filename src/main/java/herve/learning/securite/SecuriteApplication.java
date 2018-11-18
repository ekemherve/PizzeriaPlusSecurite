package herve.learning.securite;

import herve.learning.securite.dataAccess.entity.IngredientEntity;
import herve.learning.securite.dataAccess.entity.PizzaEntity;
import herve.learning.securite.dataAccess.entity.RoleEntity;
import herve.learning.securite.dataAccess.repository.IngredientRepository;
import herve.learning.securite.dataAccess.repository.PizzaRepository;
import herve.learning.securite.dataAccess.repository.PizzaRepository;
import herve.learning.securite.dataAccess.repository.RoleRepository;
import herve.learning.securite.model.RoleEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SecuriteApplication {

    @Autowired
    private RoleRepository roleRepository;

    @Autowired
    private PizzaRepository pizzaRepository;

    @Autowired
    private IngredientRepository ingredientRepository;

    public static void main(String[] args) {
        SpringApplication.run(SecuriteApplication.class, args);
    }

    /*@Bean
    CommandLineRunner commandLineRunner(){

        return args -> {

            RoleEntity user = new RoleEntity();
            user.setRole(RoleEnum.USER);

            RoleEntity admin = new RoleEntity();
            admin.setRole(RoleEnum.ADMIN);

            roleRepository.save(user);
            roleRepository.save(admin);

            PizzaEntity quatreQromage = new PizzaEntity();
            quatreQromage.setDescription("Fromage cheddar, Fromage emmental, Fromage goudin, Fromage cammenber");
            quatreQromage.setName("Quatre formage");

            PizzaEntity hawai = new PizzaEntity();
            hawai.setDescription("Fromage emmental, Tomate, Oignon, Ananas, poulet");
            hawai.setName("Hawaî");

            PizzaEntity Bacon = new PizzaEntity();
            Bacon.setDescription("Fromage emmental, Mozzarela, Oignon, Viande de boeuf");
            Bacon.setName("Bacon");

            PizzaEntity ete = new PizzaEntity();
            ete.setDescription("Fromage cheddar, Tomate, Viande de boeuf, Oignon, Poivron, Celeri");
            ete.setName("Eté");

            PizzaEntity vege = new PizzaEntity();
            vege.setDescription("Fromage goudin, Oignon, Poivron, Celeri, Champigon");
            vege.setName("Végétarienne");

            PizzaEntity cannibale = new PizzaEntity();
            cannibale.setDescription("Fromage cammenber, Tomate, Oignon, Poivron, Champignon, Viande au boeuf, Pepperoni");
            cannibale.setName("cannibale");

            PizzaEntity forestier = new PizzaEntity();
            forestier.setDescription("Fromage emmental, Mozzarella, Jambon, Oignon, Champignon, Percil");
            forestier.setName("Forestier");

            PizzaEntity exotique = new PizzaEntity();
            exotique.setDescription("Fromage cheddar, Thon, Scampi, Oignon, Celeri, Percil, Aîl");
            exotique.setName("Exotique");

            pizzaRepository.save(Bacon);
            pizzaRepository.save(cannibale);
            pizzaRepository.save(ete);
            pizzaRepository.save(exotique);
            pizzaRepository.save(hawai);
            pizzaRepository.save(quatreQromage);
            pizzaRepository.save(vege);
            pizzaRepository.save(forestier);

            IngredientEntity cheddar = new IngredientEntity();
            cheddar.setName("Fromage cheddar");
            cheddar.setStock(200);

            IngredientEntity emmental = new IngredientEntity();
            emmental.setName("Fromage emmental");
            emmental.setStock(200);

            IngredientEntity goudin = new IngredientEntity();
            goudin.setName("Fromage goudin");
            goudin.setStock(200);

            IngredientEntity cammenber = new IngredientEntity();
            cammenber.setName("Fromage cammenber");
            cammenber.setStock(200);

            IngredientEntity tomate = new IngredientEntity();
            tomate.setName("tomate");
            tomate.setStock(200);

            IngredientEntity celeri = new IngredientEntity();
            celeri.setName("celeri");
            celeri.setStock(200);

            IngredientEntity poivron = new IngredientEntity();
            poivron.setName("poivron");
            poivron.setStock(200);

            IngredientEntity oignon = new IngredientEntity();
            oignon.setName("oignon");
            oignon.setStock(200);

            IngredientEntity ail = new IngredientEntity();
            ail.setName("ail");
            ail.setStock(200);

            IngredientEntity champignon = new IngredientEntity();
            champignon.setName("champignon");
            champignon.setStock(200);

            IngredientEntity olive = new IngredientEntity();
            olive.setName("olive");
            olive.setStock(200);

            IngredientEntity scampi = new IngredientEntity();
            scampi.setName("scampi");
            scampi.setStock(200);

            IngredientEntity poulet = new IngredientEntity();
            poulet.setName("poulet");
            poulet.setStock(200);

            IngredientEntity viande = new IngredientEntity();
            viande.setName("viande");
            viande.setStock(200);

            IngredientEntity kefta = new IngredientEntity();
            kefta.setName("kefta");
            kefta.setStock(200);

            IngredientEntity jambon = new IngredientEntity();
            jambon.setName("jambon");
            jambon.setStock(200);

            IngredientEntity thon = new IngredientEntity();
            thon.setName("thon");
            thon.setStock(200);

            IngredientEntity pepperoni = new IngredientEntity();
            pepperoni.setName("pepperoni");
            pepperoni.setStock(200);

            ingredientRepository.save(ail);
            ingredientRepository.save(cammenber);
            ingredientRepository.save(celeri);
            ingredientRepository.save(champignon);
            ingredientRepository.save(cheddar);
            ingredientRepository.save(emmental);
            ingredientRepository.save(goudin);
            ingredientRepository.save(jambon);
            ingredientRepository.save(kefta);
            ingredientRepository.save(oignon);
            ingredientRepository.save(olive);
            ingredientRepository.save(pepperoni);
            ingredientRepository.save(poivron);
            ingredientRepository.save(poulet);
            ingredientRepository.save(scampi);
            ingredientRepository.save(thon);
            ingredientRepository.save(tomate);
            ingredientRepository.save(viande);

        };
    }*/
}
