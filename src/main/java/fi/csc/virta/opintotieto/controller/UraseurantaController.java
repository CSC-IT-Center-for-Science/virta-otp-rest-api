package fi.csc.virta.opintotieto.controller;

import fi.csc.virta.opintotieto.entity.Uraseuranta;
import fi.csc.virta.opintotieto.repository.OpintotietoRepository;
import fi.csc.virta.opintotieto.repository.UraseurantaRepository;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("Uraseuranta")
public class UraseurantaController extends OpintotietoController<Uraseuranta, Long> {

    @Autowired
    private UraseurantaRepository repository;

    @Override
    @ApiOperation(value = "Get all Uraseuranta objects as JSON stream", response = Uraseuranta.class, responseContainer = "List")
    public void streamAll(HttpServletResponse response) {
        super.streamAll(response);
    }

    @Override
    @ApiOperation(value = "Get all Uraseuranta objects as XML stream", response = Uraseuranta.class, responseContainer = "List")
    public void streamAllXml(HttpServletResponse response) {
        super.streamAllXml(response);
    }

    @Override
    public OpintotietoRepository<Uraseuranta, Long> getRepository() {
        return repository;
    }
}
