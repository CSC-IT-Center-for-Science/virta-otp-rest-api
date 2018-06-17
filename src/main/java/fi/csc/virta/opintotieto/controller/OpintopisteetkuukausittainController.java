package fi.csc.virta.opintotieto.controller;

import fi.csc.virta.opintotieto.entity.Opintopisteetkuukausittain;
import fi.csc.virta.opintotieto.repository.OpintotietoRepository;
import fi.csc.virta.opintotieto.repository.OpintopisteetkuukausittainRepository;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("/Opintopisteetkuukausittain")
public class OpintopisteetkuukausittainController extends OpintotietoController<Opintopisteetkuukausittain, Long> {

    @Autowired
    private OpintopisteetkuukausittainRepository repository;

    @Override
    @ApiOperation(value = "Get all Opintopisteetkuukausittain objects as JSON stream", response = Opintopisteetkuukausittain.class, responseContainer = "List")
    public void streamAll(HttpServletResponse response) {
        super.streamAll(response);
    }

    @Override
    @ApiOperation(value = "Get all Opintopisteetkuukausittain objects as XML stream", response = Opintopisteetkuukausittain.class, responseContainer = "List")
    public void streamAllXml(HttpServletResponse response) {
        super.streamAllXml(response);
    }

    @Override
    public OpintotietoRepository<Opintopisteetkuukausittain, Long> getRepository() {
        return repository;
    }
}
