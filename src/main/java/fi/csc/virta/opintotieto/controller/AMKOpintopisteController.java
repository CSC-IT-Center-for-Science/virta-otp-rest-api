package fi.csc.virta.opintotieto.controller;

import fi.csc.virta.opintotieto.entity.AMKOpintopiste;
import fi.csc.virta.opintotieto.entity.AMKOpintopisteId;
import fi.csc.virta.opintotieto.repository.AMKOpintopisteRepository;
import fi.csc.virta.opintotieto.repository.OpintotietoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("AMKOpintopiste")
public class AMKOpintopisteController extends OpintotietoController<AMKOpintopiste, AMKOpintopisteId> {

    @Autowired
    private AMKOpintopisteRepository repository;

    @Override
    public OpintotietoRepository<AMKOpintopiste, AMKOpintopisteId> getRepository() {
        return repository;
    }
}
