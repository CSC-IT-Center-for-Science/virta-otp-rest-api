package fi.csc.virta.opintotieto.controller;

import fi.csc.virta.opintotieto.entity.TKOpiskYO;
import fi.csc.virta.opintotieto.repository.OpintotietoRepository;
import fi.csc.virta.opintotieto.repository.TKOpiskYORepository;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("/TKOpiskYO")
public class TKOpiskYOController extends OpintotietoController<TKOpiskYO, Long> {

    @Autowired
    private TKOpiskYORepository repository;

    @Override
    @ApiOperation(value = "Get all TKOpiskYO objects as JSON stream", response = TKOpiskYO.class, responseContainer = "List")
    public void streamAll(HttpServletResponse response) {
        super.streamAll(response);
    }

    @Override
    @ApiOperation(value = "Get all TKOpiskYO objects as XML stream", response = TKOpiskYO.class, responseContainer = "List")
    public void streamAllXml(HttpServletResponse response) {
        super.streamAllXml(response);
    }

    @Override
    public OpintotietoRepository<TKOpiskYO, Long> getRepository() {
        return repository;
    }
}
