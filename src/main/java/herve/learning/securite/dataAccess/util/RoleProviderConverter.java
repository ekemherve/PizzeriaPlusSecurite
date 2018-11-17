package herve.learning.securite.dataAccess.util;

import herve.learning.securite.dataAccess.entity.RoleEntity;
import herve.learning.securite.model.Role;
import org.springframework.stereotype.Service;

@Service
public class RoleProviderConverter {

    public RoleEntity RoleToRoleEntity(Role role){

        RoleEntity roleEntity = new RoleEntity();

        roleEntity.setId(role.getId());
        roleEntity.setRole(role.getRoleEnum());

        return roleEntity;
    }

    public Role RoleEntityToRole(RoleEntity roleEntity){

        Role role = new Role();
        role.setId(roleEntity.getId());
        role.setRoleEnum(roleEntity.getRole());

        return role;
    }
}
