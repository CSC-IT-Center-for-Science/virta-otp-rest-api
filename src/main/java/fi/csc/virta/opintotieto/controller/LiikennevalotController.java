package fi.csc.virta.opintotieto.controller;

import fi.csc.virta.opintotieto.entity.Liikennevalot;
import fi.csc.virta.opintotieto.repository.OpintotietoRepository;
import fi.csc.virta.opintotieto.repository.LiikennevalotRepository;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("/Liikennevalot")
public class LiikennevalotController extends OpintotietoController<Liikennevalot, Long> {

    @Autowired
    private LiikennevalotRepository repository;

    @Override
    @ApiOperation(value = "Get all Liikennevalot objects as JSON stream", response = Liikennevalot.class, responseContainer = "List")
    public void streamAll(HttpServletResponse response) {
        super.streamAll(response);
    }

    @Override
    @ApiOperation(value = "Get all Liikennevalot objects as XML stream", response = Liikennevalot.class, responseContainer = "List")
    public void streamAllXml(HttpServletResponse response) {
        super.streamAllXml(response);
    }

    @Override
    public OpintotietoRepository<Liikennevalot, Long> getRepository() {
        return repository;
    }
}
