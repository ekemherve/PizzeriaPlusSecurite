package herve.learning.securite.dataAccess.repository;

import herve.learning.securite.dataAccess.entity.ClientEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface ClientRepository extends JpaRepository<ClientEntity, Long> {
}
