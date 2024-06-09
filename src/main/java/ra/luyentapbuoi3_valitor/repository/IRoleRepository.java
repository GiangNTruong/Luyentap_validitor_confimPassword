package ra.luyentapbuoi3_valitor.repository;

import ra.luyentapbuoi3_valitor.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRoleRepository extends JpaRepository<Role,Long> {
}
