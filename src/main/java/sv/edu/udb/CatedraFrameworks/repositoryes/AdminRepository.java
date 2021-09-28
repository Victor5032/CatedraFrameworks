package sv.edu.udb.CatedraFrameworks.repositoryes;

import org.springframework.data.jpa.repository.JpaRepository;
import sv.edu.udb.CatedraFrameworks.entities.Administrador;

public interface AdminRepository extends JpaRepository<Administrador, Integer> {
}
