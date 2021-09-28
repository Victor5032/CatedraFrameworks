package sv.edu.udb.CatedraFrameworks.repositoryes;

import org.springframework.data.jpa.repository.JpaRepository;
import sv.edu.udb.CatedraFrameworks.entities.Doctor;

public interface DoctorRepository extends JpaRepository <Doctor, Integer> {
}
