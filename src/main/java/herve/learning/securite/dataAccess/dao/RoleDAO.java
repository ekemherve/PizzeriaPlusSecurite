package herve.learning.securite.dataAccess.dao;

import herve.learning.securite.dataAccess.entity.RoleEntity;
import herve.learning.securite.dataAccess.repository.RoleRepository;
import herve.learning.securite.dataAccess.util.RoleProviderConverter;
import herve.learning.securite.model.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Set;
import java.util.stream.Collectors;

@Service
@Transactional
public class RoleDAO {

    @Autowired
    private RoleRepository roleRepository;

    @Autowired
    private RoleProviderConverter roleProviderConverter;

    public Set<Role> findAll() {

        Set<RoleEntity> roleEntities = roleRepository.findAll().stream().collect(Collectors.toSet());

        return roleEntities.stream().
                map(roleEntity -> roleProviderConverter.roleEntityToRole(roleEntity)).
                collect(Collectors.toSet());
    }

    public Role save(Role role) {

        RoleEntity roleEntity = roleRepository.save(roleProviderConverter.roleToRoleEntity(role));
        return roleProviderConverter.roleEntityToRole(roleEntity);
    }
}
