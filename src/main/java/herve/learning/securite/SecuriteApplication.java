package herve.learning.securite;

import herve.learning.securite.dataAccess.entity.PizzaEntity;
import herve.learning.securite.dataAccess.entity.RoleEntity;
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

    public static void main(String[] args) {
        SpringApplication.run(SecuriteApplication.class, args);
    }

    /*@Bean
    CommandLineRunner commandLineRunner(){

        return args -> {

//            RoleEntity user = new RoleEntity();
//            user.setRole(RoleEnum.USER);
//
//            RoleEntity admin = new RoleEntity();
//            admin.setRole(RoleEnum.ADMIN);
//
//            roleRepository.save(user);
//            roleRepository.save(admin);

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

        };
    }*/
}
