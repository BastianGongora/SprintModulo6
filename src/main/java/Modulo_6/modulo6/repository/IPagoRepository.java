package Modulo_6.modulo6.repository;


import Modulo_6.modulo6.models.Pago;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IPagoRepository extends JpaRepository<Pago,Integer> {

    Pago findPagoById(Integer id);

    Pago save(Pago pago);

    List<Pago> findAll();

}
