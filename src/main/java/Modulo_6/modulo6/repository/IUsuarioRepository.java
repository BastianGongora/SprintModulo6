package Modulo_6.modulo6.repository;

import Modulo_6.modulo6.models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface IUsuarioRepository extends JpaRepository<Usuario,String>{

    Usuario findUsuarioByRut(String rut);

    Usuario save(Usuario usuario);

    List<Usuario> findAll();


}
