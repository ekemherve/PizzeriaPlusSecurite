package herve.learning.securite;

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

    @Bean
    CommandLineRunner commandLineRunner(){

        return args -> {

            RoleEntity user = new RoleEntity();
            user.setRole(RoleEnum.USER);

            RoleEntity admin = new RoleEntity();
            admin.setRole(RoleEnum.ADMIN);

            roleRepository.save(user);
            roleRepository.save(admin);
        };
    }
}
