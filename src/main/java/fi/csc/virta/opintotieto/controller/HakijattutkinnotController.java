package fi.csc.virta.opintotieto.controller;

import fi.csc.virta.opintotieto.entity.Hakijattutkinnot;
import fi.csc.virta.opintotieto.repository.OpintotietoRepository;
import fi.csc.virta.opintotieto.repository.HakijattutkinnotRepository;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("/Hakijattutkinnot")
public class HakijattutkinnotController extends OpintotietoController<Hakijattutkinnot, Long> {

    @Autowired
    private HakijattutkinnotRepository repository;

    @Override
    @ApiOperation(value = "Get all Hakijattutkinnot objects as JSON stream", response = Hakijattutkinnot.class, responseContainer = "List")
    public void streamAll(HttpServletResponse response) {
        super.streamAll(response);
    }

    @Override
    @ApiOperation(value = "Get all Hakijattutkinnot objects as XML stream", response = Hakijattutkinnot.class, responseContainer = "List")
    public void streamAllXml(HttpServletResponse response) {
        super.streamAllXml(response);
    }

    @Override
    public OpintotietoRepository<Hakijattutkinnot, Long> getRepository() {
        return repository;
    }
}
