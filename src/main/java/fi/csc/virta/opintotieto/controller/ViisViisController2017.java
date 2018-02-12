package fi.csc.virta.opintotieto.controller;

import fi.csc.virta.opintotieto.entity.ViisViis2017;
import fi.csc.virta.opintotieto.repository.OpintotietoRepository;
import fi.csc.virta.opintotieto.repository.ViisViisRepository2017;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("/ViisViis2017")
public class ViisViisController2017 extends OpintotietoController<ViisViis2017, Long> {

    @Autowired
    private ViisViisRepository2017 repository;

    @Override
    @ApiOperation(value = "Get all ViisViis2017 objects as JSON stream", response = ViisViis2017.class, responseContainer = "List")
    public void streamAll(HttpServletResponse response) {
        super.streamAll(response);
    }

    @Override
    @ApiOperation(value = "Get all ViisViis2017 objects as XML stream", response = ViisViis2017.class, responseContainer = "List")
    public void streamAllXml(HttpServletResponse response) {
        super.streamAllXml(response);
    }

    @Override
    public OpintotietoRepository<ViisViis2017, Long> getRepository() {
        return repository;
    }
}
