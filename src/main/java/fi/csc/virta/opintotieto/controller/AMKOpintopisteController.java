package fi.csc.virta.opintotieto.controller;

import fi.csc.virta.opintotieto.entity.AMKOpintopiste;
import fi.csc.virta.opintotieto.entity.AMKOpintopisteId;
import fi.csc.virta.opintotieto.repository.AMKOpintopisteRepository;
import fi.csc.virta.opintotieto.repository.OpintotietoRepository;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("AMKOpintopiste")
public class AMKOpintopisteController extends OpintotietoController<AMKOpintopiste, AMKOpintopisteId> {

    @Autowired
    private AMKOpintopisteRepository repository;

    @Override
    @ApiOperation(value = "Get all AMKOpintopiste objects as JSON stream", response = AMKOpintopiste.class, responseContainer = "List")
    public void streamAll(HttpServletResponse response) {
        super.streamAll(response);
    }

    @Override
    @ApiOperation(value = "Get all AMKOpintopiste objects as XML stream", response = AMKOpintopiste.class, responseContainer = "List")
    public void streamAllXml(HttpServletResponse response) {
        super.streamAllXml(response);
    }

    @Override
    public OpintotietoRepository<AMKOpintopiste, AMKOpintopisteId> getRepository() {
        return repository;
    }
}
