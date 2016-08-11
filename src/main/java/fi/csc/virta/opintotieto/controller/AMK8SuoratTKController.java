package fi.csc.virta.opintotieto.controller;

import fi.csc.virta.opintotieto.entity.AMK8SuoratTK;
import fi.csc.virta.opintotieto.entity.AMKSuoratTKId;
import fi.csc.virta.opintotieto.repository.AMK8SuoratTKRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/AMK8SuoratTK")
public class AMK8SuoratTKController extends OpintotietoController<AMK8SuoratTK, AMKSuoratTKId> {

    @Autowired
    private AMK8SuoratTKRepository repository;

    @Override
    public AMK8SuoratTKRepository getRepository() {
        return repository;
    }
}
