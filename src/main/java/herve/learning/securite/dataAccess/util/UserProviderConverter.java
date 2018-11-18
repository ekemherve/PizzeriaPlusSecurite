package herve.learning.securite.dataAccess.util;

import herve.learning.securite.dataAccess.entity.RoleEntity;
import herve.learning.securite.dataAccess.entity.UserEntity;
import herve.learning.securite.dataAccess.repository.RoleRepository;
import herve.learning.securite.model.Role;
import herve.learning.securite.model.RoleEnum;
import herve.learning.securite.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashSet;
import java.util.Set;

@Service
@Transactional
public class UserProviderConverter {

    @Autowired
    private RoleProviderConverter roleProviderConverter;

    @Autowired
    private RoleRepository roleRepository;

    public User userEntityToUser(UserEntity userEntity) {

        User user = new User(userEntity.getId(), userEntity.getUsername(), userEntity.getFirstname(),
                            userEntity.getLastname(), userEntity.getEmail(), userEntity.getPassword());

        user.setRole(roleProviderConverter.roleEntityToRole(userEntity.getRole()));

        return user;
    }

    public UserEntity userToUserEntity(User user) {

        //recherche en base de donnée le role User
        RoleEntity roleEntity = roleRepository.findByRole(RoleEnum.USER);

        UserEntity userEntity = new UserEntity(user.getUsername(), user.getFirstname(),
                user.getLastname(), user.getEmail(), user.getPassword(),roleEntity);

        return userEntity;
    }
}
