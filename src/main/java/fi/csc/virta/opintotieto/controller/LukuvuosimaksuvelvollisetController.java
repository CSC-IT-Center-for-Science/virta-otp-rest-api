package fi.csc.virta.opintotieto.controller;

import fi.csc.virta.opintotieto.entity.Lukuvuosimaksuvelvolliset;
import fi.csc.virta.opintotieto.repository.OpintotietoRepository;
import fi.csc.virta.opintotieto.repository.LukuvuosimaksuvelvollisetRepository;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("/Lukuvuosimaksuvelvolliset")
public class LukuvuosimaksuvelvollisetController extends OpintotietoController<Lukuvuosimaksuvelvolliset, Long> {

    @Autowired
    private LukuvuosimaksuvelvollisetRepository repository;

    @Override
    @ApiOperation(value = "Get all Lukuvuosimaksuvelvolliset objects as JSON stream", response = Lukuvuosimaksuvelvolliset.class, responseContainer = "List")
    public void streamAll(HttpServletResponse response) {
        super.streamAll(response);
    }

    @Override
    @ApiOperation(value = "Get all Lukuvuosimaksuvelvolliset objects as XML stream", response = Lukuvuosimaksuvelvolliset.class, responseContainer = "List")
    public void streamAllXml(HttpServletResponse response) {
        super.streamAllXml(response);
    }

    @Override
    public OpintotietoRepository<Lukuvuosimaksuvelvolliset, Long> getRepository() {
        return repository;
    }
}
