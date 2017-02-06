package fi.csc.virta.opintotieto.controller;

import fi.csc.virta.opintotieto.entity.TKTutkintoEnnakko;
import fi.csc.virta.opintotieto.repository.OpintotietoRepository;
import fi.csc.virta.opintotieto.repository.TKTutkintoEnnakkoRepository;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("/TKTutkintoEnnakko")
public class TKTutkintoEnnakkoController extends OpintotietoController<TKTutkintoEnnakko, Long> {

    @Autowired
    private TKTutkintoEnnakkoRepository repository;

    @Override
    @ApiOperation(value = "Get all TKTutkintoEnnakko objects as JSON stream", response = TKTutkintoEnnakko.class, responseContainer = "List")
    public void streamAll(HttpServletResponse response) {
        super.streamAll(response);
    }

    @Override
    @ApiOperation(value = "Get all TKTutkintoEnnakko objects as XML stream", response = TKTutkintoEnnakko.class, responseContainer = "List")
    public void streamAllXml(HttpServletResponse response) {
        super.streamAllXml(response);
    }

    @Override
    public OpintotietoRepository<TKTutkintoEnnakko, Long> getRepository() {
        return repository;
    }
}
