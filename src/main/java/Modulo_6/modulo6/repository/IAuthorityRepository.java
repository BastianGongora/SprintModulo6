package Modulo_6.modulo6.repository;

import Modulo_6.modulo6.models.Authority;
import Modulo_6.modulo6.utils.AuthorityName;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface IAuthorityRepository extends JpaRepository<Authority,Integer> {

    Optional<Authority> findByName(AuthorityName name);

}
