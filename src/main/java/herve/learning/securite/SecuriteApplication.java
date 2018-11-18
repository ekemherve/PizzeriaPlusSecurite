package herve.learning.securite;

import herve.learning.securite.dataAccess.entity.IngredientEntity;
import herve.learning.securite.dataAccess.entity.RoleEntity;
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


        };
    }*/
}
