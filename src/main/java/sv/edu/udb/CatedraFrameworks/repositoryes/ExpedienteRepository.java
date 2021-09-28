package sv.edu.udb.CatedraFrameworks.repositoryes;

import org.springframework.data.jpa.repository.JpaRepository;
import sv.edu.udb.CatedraFrameworks.entities.Expediente;

public interface ExpedienteRepository extends JpaRepository<Expediente, Integer> {
}
