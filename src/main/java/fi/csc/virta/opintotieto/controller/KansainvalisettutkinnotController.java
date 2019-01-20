package fi.csc.virta.opintotieto.controller;

import fi.csc.virta.opintotieto.entity.Kansainvalisettutkinnot;
import fi.csc.virta.opintotieto.repository.OpintotietoRepository;
import fi.csc.virta.opintotieto.repository.KansainvalisettutkinnotRepository;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("/Kansainvalisettutkinnot")
public class KansainvalisettutkinnotController extends OpintotietoController<Kansainvalisettutkinnot, Long> {

    @Autowired
    private KansainvalisettutkinnotRepository repository;

    @Override
    @ApiOperation(value = "Get all Kansainvalisettutkinnot objects as JSON stream", response = Kansainvalisettutkinnot.class, responseContainer = "List")
    public void streamAll(HttpServletResponse response) {
        super.streamAll(response);
    }

    @Override
    @ApiOperation(value = "Get all Kansainvalisettutkinnot objects as XML stream", response = Kansainvalisettutkinnot.class, responseContainer = "List")
    public void streamAllXml(HttpServletResponse response) {
        super.streamAllXml(response);
    }

    @Override
    public OpintotietoRepository<Kansainvalisettutkinnot, Long> getRepository() {
        return repository;
    }
}
