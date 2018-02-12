package fi.csc.virta.opintotieto.controller;

import fi.csc.virta.opintotieto.entity.Opinnaytetyot;
import fi.csc.virta.opintotieto.repository.OpintotietoRepository;
import fi.csc.virta.opintotieto.repository.OpinnaytetyotRepository;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("/Opinnaytetyot")
public class OpinnaytetyotController extends OpintotietoController<Opinnaytetyot, Long> {

    @Autowired
    private OpinnaytetyotRepository repository;

    @Override
    @ApiOperation(value = "Get all Opinnaytetyot objects as JSON stream", response = Opinnaytetyot.class, responseContainer = "List")
    public void streamAll(HttpServletResponse response) {
        super.streamAll(response);
    }

    @Override
    @ApiOperation(value = "Get all Opinnaytetyot objects as XML stream", response = Opinnaytetyot.class, responseContainer = "List")
    public void streamAllXml(HttpServletResponse response) {
        super.streamAllXml(response);
    }

    @Override
    public OpintotietoRepository<Opinnaytetyot, Long> getRepository() {
        return repository;
    }
}
