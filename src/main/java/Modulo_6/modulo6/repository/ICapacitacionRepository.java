package Modulo_6.modulo6.repository;

import Modulo_6.modulo6.models.Capacitacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ICapacitacionRepository extends JpaRepository<Capacitacion,Integer> {
    Capacitacion findCapacitacionById(Integer id);

    Capacitacion save(Capacitacion capacitacion);

    List<Capacitacion> findAll();




}
