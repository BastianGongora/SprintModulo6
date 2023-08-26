package Modulo_6.modulo6.repository;

import Modulo_6.modulo6.models.Usuario;
import Modulo_6.modulo6.models.Visita;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IVisitaRepository extends JpaRepository<Visita,Integer> {

    Visita findVisitaById(Integer id);

    Visita save(Visita visita);

    List<Visita> findAll();

}
