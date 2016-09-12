package fi.csc.virta.opintotieto.controller;

import fi.csc.virta.opintotieto.entity.TKOpiskAMK;
import fi.csc.virta.opintotieto.repository.OpintotietoRepository;
import fi.csc.virta.opintotieto.repository.TKOpiskAMKRepository;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("/TKOpiskAMK")
public class TKOpiskAMKController extends OpintotietoController<TKOpiskAMK, Long> {

    @Autowired
    private TKOpiskAMKRepository repository;

    @Override
    @ApiOperation(value = "Get all TKOpiskAMK objects as JSON stream", response = TKOpiskAMK.class, responseContainer = "List")
    public void streamAll(HttpServletResponse response) {
        super.streamAll(response);
    }

    @Override
    @ApiOperation(value = "Get all TKOpiskAMK objects as XML stream", response = TKOpiskAMK.class, responseContainer = "List")
    public void streamAllXml(HttpServletResponse response) {
        super.streamAllXml(response);
    }

    @Override
    public OpintotietoRepository<TKOpiskAMK, Long> getRepository() {
        return repository;
    }
}
