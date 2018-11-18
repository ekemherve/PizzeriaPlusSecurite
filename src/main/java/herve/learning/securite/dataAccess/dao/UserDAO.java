package herve.learning.securite.dataAccess.dao;

import herve.learning.securite.dataAccess.entity.UserEntity;
import herve.learning.securite.dataAccess.repository.UserRepository;
import herve.learning.securite.dataAccess.util.UserProviderConverter;
import herve.learning.securite.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Set;
import java.util.stream.Collectors;

@Service
@Transactional
public class UserDAO implements UserDetailsService {


    @Autowired
    private UserProviderConverter userProviderConverter;

    @Autowired
    private UserRepository userRepository;

    @Autowired

    public Set<User> findAll() {

        Set<UserEntity> clientEntities =  userRepository.findAll().stream().collect(Collectors.toSet());

        return clientEntities.stream().
                    map(userEntity -> userProviderConverter.userEntityToUser(userEntity)).
                    collect(Collectors.toSet());
    }

    public User save(User user) {

        UserEntity userEntity = userRepository.save(userProviderConverter.userToUserEntity(user));

        return userProviderConverter.userEntityToUser(userEntity);
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        UserDetails user = userRepository.findByUsername(username);

        if(user != null)
            return user;

        throw  new UsernameNotFoundException("User not founded");
    }
}
