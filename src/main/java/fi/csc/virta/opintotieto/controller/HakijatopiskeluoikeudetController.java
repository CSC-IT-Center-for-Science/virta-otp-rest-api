package fi.csc.virta.opintotieto.controller;

import fi.csc.virta.opintotieto.entity.Hakijatopiskeluoikeudet;
import fi.csc.virta.opintotieto.repository.OpintotietoRepository;
import fi.csc.virta.opintotieto.repository.HakijatopiskeluoikeudetRepository;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("/Hakijatopiskeluoikeudet")
public class HakijatopiskeluoikeudetController extends OpintotietoController<Hakijatopiskeluoikeudet, Long> {

    @Autowired
    private HakijatopiskeluoikeudetRepository repository;

    @Override
    @ApiOperation(value = "Get all Hakijatopiskeluoikeudet objects as JSON stream", response = Hakijatopiskeluoikeudet.class, responseContainer = "List")
    public void streamAll(HttpServletResponse response) {
        super.streamAll(response);
    }

    @Override
    @ApiOperation(value = "Get all Hakijatopiskeluoikeudet objects as XML stream", response = Hakijatopiskeluoikeudet.class, responseContainer = "List")
    public void streamAllXml(HttpServletResponse response) {
        super.streamAllXml(response);
    }

    @Override
    public OpintotietoRepository<Hakijatopiskeluoikeudet, Long> getRepository() {
        return repository;
    }
}
