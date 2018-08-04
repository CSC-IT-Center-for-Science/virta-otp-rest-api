package fi.csc.virta.opintotieto.controller;

import fi.csc.virta.opintotieto.entity.Lasnaolotvuosittain;
import fi.csc.virta.opintotieto.repository.OpintotietoRepository;
import fi.csc.virta.opintotieto.repository.LasnaolotvuosittainRepository;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("/Lasnaolotvuosittain")
public class LasnaolotvuosittainController extends OpintotietoController<Lasnaolotvuosittain, Long> {

    @Autowired
    private LasnaolotvuosittainRepository repository;

    @Override
    @ApiOperation(value = "Get all Lasnaolotvuosittain objects as JSON stream", response = Lasnaolotvuosittain.class, responseContainer = "List")
    public void streamAll(HttpServletResponse response) {
        super.streamAll(response);
    }

    @Override
    @ApiOperation(value = "Get all Lasnaolotvuosittain objects as XML stream", response = Lasnaolotvuosittain.class, responseContainer = "List")
    public void streamAllXml(HttpServletResponse response) {
        super.streamAllXml(response);
    }

    @Override
    public OpintotietoRepository<Lasnaolotvuosittain, Long> getRepository() {
        return repository;
    }
}
