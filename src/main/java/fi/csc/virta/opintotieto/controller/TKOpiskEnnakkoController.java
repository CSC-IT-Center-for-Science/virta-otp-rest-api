package fi.csc.virta.opintotieto.controller;

import fi.csc.virta.opintotieto.entity.TKOpiskEnnakko;
import fi.csc.virta.opintotieto.repository.OpintotietoRepository;
import fi.csc.virta.opintotieto.repository.TKOpiskEnnakkoRepository;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("/TKOpiskEnnakko")
public class TKOpiskEnnakkoController extends OpintotietoController<TKOpiskEnnakko, Long> {

    @Autowired
    private TKOpiskEnnakkoRepository repository;

    @Override
    @ApiOperation(value = "Get all TKOpiskEnnakko objects as JSON stream", response = TKOpiskEnnakko.class, responseContainer = "List")
    public void streamAll(HttpServletResponse response) {
        super.streamAll(response);
    }

    @Override
    @ApiOperation(value = "Get all TKOpiskEnnakko objects as XML stream", response = TKOpiskEnnakko.class, responseContainer = "List")
    public void streamAllXml(HttpServletResponse response) {
        super.streamAllXml(response);
    }

    @Override
    public OpintotietoRepository<TKOpiskEnnakko, Long> getRepository() {
        return repository;
    }
}
