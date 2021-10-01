package sv.edu.udb.CatedraFrameworks.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;
import sv.edu.udb.CatedraFrameworks.entities.Area;
import sv.edu.udb.CatedraFrameworks.entities.DoctoresArea;
import sv.edu.udb.CatedraFrameworks.repositoryes.DoctoresAreaRepository;

import java.util.List;

@Component(value = "supervisorAreaController")
public class SupervisorAreaController {
    @Autowired
    private DoctoresAreaRepository doctoresAreaRepository;
    private DoctoresArea doctoresArea = new DoctoresArea();

    public List<DoctoresArea> obtenerdoctoresDelArea(){
        return doctoresAreaRepository.findAll();
    }

    public DoctoresArea getDoctoresArea() {
        return doctoresArea;
    }
}
