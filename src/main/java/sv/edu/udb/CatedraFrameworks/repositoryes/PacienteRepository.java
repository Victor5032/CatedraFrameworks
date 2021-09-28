package sv.edu.udb.CatedraFrameworks.repositoryes;

import org.springframework.data.jpa.repository.JpaRepository;
import sv.edu.udb.CatedraFrameworks.entities.Paciente;

public interface PacienteRepository extends JpaRepository<Paciente, Integer> {
}
