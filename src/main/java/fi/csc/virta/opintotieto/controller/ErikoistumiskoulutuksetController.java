package fi.csc.virta.opintotieto.controller;

import fi.csc.virta.opintotieto.entity.Erikoistumiskoulutukset;
import fi.csc.virta.opintotieto.repository.OpintotietoRepository;
import fi.csc.virta.opintotieto.repository.ErikoistumiskoulutuksetRepository;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("/Erikoistumiskoulutukset")
public class ErikoistumiskoulutuksetController extends OpintotietoController<Erikoistumiskoulutukset, Long> {

    @Autowired
    private ErikoistumiskoulutuksetRepository repository;

    @Override
    @ApiOperation(value = "Get all Erikoistumiskoulutukset objects as JSON stream", response = Erikoistumiskoulutukset.class, responseContainer = "List")
    public void streamAll(HttpServletResponse response) {
        super.streamAll(response);
    }

    @Override
    @ApiOperation(value = "Get all Erikoistumiskoulutukset objects as XML stream", response = Erikoistumiskoulutukset.class, responseContainer = "List")
    public void streamAllXml(HttpServletResponse response) {
        super.streamAllXml(response);
    }

    @Override
    public OpintotietoRepository<Erikoistumiskoulutukset, Long> getRepository() {
        return repository;
    }
}
