package herve.learning.securite.dataAccess.repository;

import herve.learning.securite.dataAccess.entity.IngredientEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface IngredientRepository extends JpaRepository<IngredientEntity, Long> {

    IngredientEntity findByName(String name);
}
