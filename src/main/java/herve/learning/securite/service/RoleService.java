package herve.learning.securite.service;

import herve.learning.securite.dataAccess.dao.RoleDAO;
import herve.learning.securite.dataAccess.repository.RoleRepository;
import herve.learning.securite.model.Role;
import herve.learning.securite.model.RoleEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class RoleService {

    @Autowired
    private RoleDAO roleDAO;

    public Set<Role> roles = new HashSet<>();

    public RoleService() {
        Role user = new Role();
        user.setRoleEnum(RoleEnum.USER);

        Role admin = new Role();
        admin.setRoleEnum(RoleEnum.ADMIN);

        this.roles.add(user);
        this.roles.add(admin);
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }

    public Role save(Role role){

        if(role != null)
            return roleDAO.save(role);

        return null;
    }
}
