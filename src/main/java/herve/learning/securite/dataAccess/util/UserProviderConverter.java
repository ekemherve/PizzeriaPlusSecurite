package herve.learning.securite.dataAccess.util;

import herve.learning.securite.dataAccess.entity.UserEntity;
import herve.learning.securite.model.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserProviderConverter {

    public User userEntityToUser(UserEntity userEntity) {

        User user = new User(userEntity.getId(), userEntity.getUsername(), userEntity.getFirstname(),
                            userEntity.getLastname(), userEntity.getEmail(), userEntity.getPassword());

        return user;
    }

    public UserEntity userToUserEntity(User user) {

        UserEntity userEntity = new UserEntity(user.getId(), user.getUsername(), user.getFirstname(),
                user.getLastname(), user.getEmail(), user.getPassword());

        return userEntity;
    }
}
