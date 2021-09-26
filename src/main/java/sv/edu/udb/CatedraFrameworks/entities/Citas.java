package sv.edu.udb.CatedraFrameworks.entities;

import javax.persistence.*;
import java.sql.Time;
import java.time.LocalTime;
import java.util.Date;

@Entity
@Table(name = "cita")
public class Citas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer citasId;

    @Column(
            name = "fecha_cita",
            nullable = false,
            columnDefinition = "DATE"
    )
    private Date fechaCita;

    @Column(
            name = "hora_cita",
            nullable = false,
            updatable = false,
            columnDefinition = "TIME"
    )
    private LocalTime horaCita;

    @Column(
            name = "extras",
            columnDefinition = "VARCHAR(100)"
    )
    private String extras;

    @ManyToOne
    @JoinColumn(
            name = "id_doctor",
            nullable = false
    )
    private Doctor idDoctor;

    @ManyToOne
    @JoinColumn(
            name = "id_paciente",
            nullable = false
    )
    private Paciente idPaciente;



}
