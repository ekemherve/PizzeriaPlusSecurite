package herve.learning.securite.dataAccess.util;

import herve.learning.securite.dataAccess.entity.RoleEntity;
import herve.learning.securite.dataAccess.entity.UserEntity;
import herve.learning.securite.dataAccess.repository.RoleRepository;
import herve.learning.securite.model.Role;
import herve.learning.securite.model.RoleEnum;
import herve.learning.securite.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashSet;
import java.util.Set;

@Service
@Transactional
public class UserProviderConverter {


    @Bean
    public PasswordEncoder passwordEncoder(){

        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        return encoder;
    }

    @Autowired
    private PasswordEncoder encoder;

    @Autowired
    private RoleProviderConverter roleProviderConverter;

    @Autowired
    private RoleRepository roleRepository;

    public User userEntityToUser(UserEntity userEntity) {

        User user = new User(userEntity.getId(), userEntity.getUsername(), userEntity.getFirstname(),
                            userEntity.getLastname(), userEntity.getEmail(), userEntity.getPassword(), null);

        user.setRole(roleProviderConverter.roleEntityToRole(userEntity.getRole()));

        return user;
    }

    public UserEntity userToUserEntity(User user) {

        //recherche en base de donnée le role User
        /*RoleEntity roleEntity = roleRepository.findByRole(RoleEnum.USER);

        UserEntity userEntity = new UserEntity(user.getUsername(), user.getFirstname(),
                user.getLastname(), user.getEmail(), user.getPassword(),roleEntity);*/

        initUser(user);

        UserEntity userEntity = getInitializedUserEntity(user);

        return userEntity;
    }

    private void initUser(User user) {

        //RoleEntity roleEntity = roleRepository.findByRole(RoleEnum.USER);
        //user.setRole(roleProviderConverter.roleEntityToRole(roleEntity));
        user.setPassword(encoder.encode(user.getPassword()));
        user.setPassword(encoder.encode(user.getPasswordConfirmed()));
        user.setAccountNonLocked(true);
        user.setCredentialsNonExpired(true);
        user.setAccountNonExpired(true);
        user.setEnabled(true);
    }

    private UserEntity getInitializedUserEntity(User user) {

        RoleEntity roleEntity = roleRepository.findByRole(RoleEnum.USER);

        UserEntity userEntity = new UserEntity(user.getUsername(), user.getFirstname(),
                user.getLastname(), user.getEmail(), user.getPassword(),roleEntity);

        userEntity.setAuthority(roleEntity.getRole().getName());
        userEntity.setAccountNonLocked(true);
        userEntity.setCredentialsNonExpired(true);
        userEntity.setAccountNonExpired(true);
        userEntity.setEnabled(true);

        return userEntity;
    }
}
