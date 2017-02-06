package fi.csc.virta.opintotieto.controller;

import fi.csc.virta.opintotieto.entity.ViisViis;
import fi.csc.virta.opintotieto.repository.OpintotietoRepository;
import fi.csc.virta.opintotieto.repository.ViisViisRepository;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("/ViisViis")
public class ViisViisController extends OpintotietoController<ViisViis, Long> {

    @Autowired
    private ViisViisRepository repository;

    @Override
    @ApiOperation(value = "Get all ViisViis objects as JSON stream", response = ViisViis.class, responseContainer = "List")
    public void streamAll(HttpServletResponse response) {
        super.streamAll(response);
    }

    @Override
    @ApiOperation(value = "Get all ViisViis objects as XML stream", response = ViisViis.class, responseContainer = "List")
    public void streamAllXml(HttpServletResponse response) {
        super.streamAllXml(response);
    }

    @Override
    public OpintotietoRepository<ViisViis, Long> getRepository() {
        return repository;
    }
}
