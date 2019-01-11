package org.pk.recruitportalserver.repo;

import java.util.List;
import org.pk.recruitportalserver.entities.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface UserRepository extends CrudRepository<User, Long> {
	


}
