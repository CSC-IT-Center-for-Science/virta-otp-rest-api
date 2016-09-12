package fi.csc.virta.opintotieto.controller;

import fi.csc.virta.opintotieto.entity.OKMAloittaneetOpintopisteetYO;
import fi.csc.virta.opintotieto.repository.OKMAloittaneetOpintopisteetYORepository;
import fi.csc.virta.opintotieto.repository.OpintotietoRepository;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("/OKMAloittaneetOpintopisteetYO")
public class OKMAloittaneetOpintopisteetYOController extends OpintotietoController<OKMAloittaneetOpintopisteetYO, Long> {

    @Autowired
    private OKMAloittaneetOpintopisteetYORepository repository;

    @Override
    @ApiOperation(value = "Get all OKMAloittaneetOpintopisteetYO objects as JSON stream", response = OKMAloittaneetOpintopisteetYO.class, responseContainer = "List")
    public void streamAll(HttpServletResponse response) {
        super.streamAll(response);
    }

    @Override
    @ApiOperation(value = "Get all OKMAloittaneetOpintopisteetYO objects as XML stream", response = OKMAloittaneetOpintopisteetYO.class, responseContainer = "List")
    public void streamAllXml(HttpServletResponse response) {
        super.streamAllXml(response);
    }

    @Override
    public OpintotietoRepository<OKMAloittaneetOpintopisteetYO, Long> getRepository() {
        return repository;
    }
}
