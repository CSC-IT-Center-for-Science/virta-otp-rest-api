package fi.csc.virta.opintotieto.controller;

import fi.csc.virta.opintotieto.entity.AMK7SuoratTK;
import fi.csc.virta.opintotieto.entity.AMK7SuoratTKId;
import fi.csc.virta.opintotieto.repository.AMK7SuoratTKRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/AMK7SuoratTK")
public class AMK7SuoratTKController extends OpintotietoController<AMK7SuoratTK, AMK7SuoratTKId> {

    @Autowired
    private AMK7SuoratTKRepository repository;

    @Override
    public AMK7SuoratTKRepository getRepository() {
        return repository;
    }
}
