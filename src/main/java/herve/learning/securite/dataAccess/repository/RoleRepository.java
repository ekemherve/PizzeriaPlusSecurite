package herve.learning.securite.dataAccess.repository;

import herve.learning.securite.dataAccess.entity.RoleEntity;
import herve.learning.securite.model.RoleEnum;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface RoleRepository extends JpaRepository<RoleEntity, Long> {

    RoleEntity findByRole(RoleEnum role);
}
