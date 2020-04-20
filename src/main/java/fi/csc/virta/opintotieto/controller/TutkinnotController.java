package fi.csc.virta.opintotieto.controller;

import fi.csc.virta.opintotieto.entity.Tutkinnot;
import fi.csc.virta.opintotieto.repository.OpintotietoRepository;
import fi.csc.virta.opintotieto.repository.TutkinnotRepository;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("/Tutkinnot")
public class TutkinnotController extends OpintotietoController<Tutkinnot, Long> {

    @Autowired
    private TutkinnotRepository repository;

    @Override
    @ApiOperation(value = "Get all Tutkinnot objects as JSON stream", response = Tutkinnot.class, responseContainer = "List")
    public void streamAll(HttpServletResponse response) {
        super.streamAll(response);
    }

    @Override
    @ApiOperation(value = "Get all Tutkinnot objects as XML stream", response = Tutkinnot.class, responseContainer = "List")
    public void streamAllXml(HttpServletResponse response) {
        super.streamAllXml(response);
    }

    @Override
    public OpintotietoRepository<Tutkinnot, Long> getRepository() {
        return repository;
    }
}
