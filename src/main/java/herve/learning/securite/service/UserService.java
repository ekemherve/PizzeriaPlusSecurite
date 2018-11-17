package herve.learning.securite.service;

import herve.learning.securite.dataAccess.dao.UserDAO;
import herve.learning.securite.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserDAO userDAO;

    public User save(User user){

        if(user != null && user.getPassword().equals(user.getPasswordConfirmed())) {
            return userDAO.save(user);
        }

        return null;
    }
}
