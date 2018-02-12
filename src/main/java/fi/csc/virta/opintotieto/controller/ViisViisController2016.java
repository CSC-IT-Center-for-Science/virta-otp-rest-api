package fi.csc.virta.opintotieto.controller;

import fi.csc.virta.opintotieto.entity.ViisViis2016;
import fi.csc.virta.opintotieto.repository.OpintotietoRepository;
import fi.csc.virta.opintotieto.repository.ViisViisRepository2016;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("/ViisViis2016")
public class ViisViisController2016 extends OpintotietoController<ViisViis2016, Long> {

    @Autowired
    private ViisViisRepository2016 repository;

    @Override
    @ApiOperation(value = "Get all ViisViis2016 objects as JSON stream", response = ViisViis2016.class, responseContainer = "List")
    public void streamAll(HttpServletResponse response) {
        super.streamAll(response);
    }

    @Override
    @ApiOperation(value = "Get all ViisViis2016 objects as XML stream", response = ViisViis2016.class, responseContainer = "List")
    public void streamAllXml(HttpServletResponse response) {
        super.streamAllXml(response);
    }

    @Override
    public OpintotietoRepository<ViisViis2016, Long> getRepository() {
        return repository;
    }
}
