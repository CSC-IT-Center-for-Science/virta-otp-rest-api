package fi.csc.virta.opintotieto.controller;

import fi.csc.virta.opintotieto.entity.TKTutkYO;
import fi.csc.virta.opintotieto.repository.OpintotietoRepository;
import fi.csc.virta.opintotieto.repository.TKTutkYORepository;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("/TKTutkYO")
public class TKTutkYOController extends OpintotietoController<TKTutkYO, Long> {

    @Autowired
    private TKTutkYORepository repository;

    @Override
    @ApiOperation(value = "Get all TKTutkYO objects as JSON stream", response = TKTutkYO.class, responseContainer = "List")
    public void streamAll(HttpServletResponse response) {
        super.streamAll(response);
    }

    @Override
    @ApiOperation(value = "Get all TKTutkYO objects as XML stream", response = TKTutkYO.class, responseContainer = "List")
    public void streamAllXml(HttpServletResponse response) {
        super.streamAllXml(response);
    }

    @Override
    public OpintotietoRepository<TKTutkYO, Long> getRepository() {
        return repository;
    }
}
