package herve.learning.securite.dataAccess.dao;

import herve.learning.securite.dataAccess.entity.UserEntity;
import herve.learning.securite.dataAccess.repository.ClientRepository;
import herve.learning.securite.dataAccess.util.UserProviderConverter;
import herve.learning.securite.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Set;
import java.util.stream.Collectors;

@Service
@Transactional
public class ClientDAO {


    @Autowired
    private UserProviderConverter userProviderConverter;

    @Autowired
    private ClientRepository clientRepository;

    @Autowired

    public Set<User> findAll() {

        Set<UserEntity> clientEntities =  clientRepository.findAll().stream().collect(Collectors.toSet());

        return clientEntities.stream().
                    map(userEntity -> userProviderConverter.userEntityToUser(userEntity)).
                    collect(Collectors.toSet());
    }

    public User save(User user) {

        UserEntity userEntity = clientRepository.save(userProviderConverter.userToUserEntity(user));

        return userProviderConverter.userEntityToUser(userEntity);
    }
}
