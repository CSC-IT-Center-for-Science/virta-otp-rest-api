package fi.csc.virta.opintotieto.controller;

import fi.csc.virta.opintotieto.entity.Yhteiskaksoistutkinnot;
import fi.csc.virta.opintotieto.repository.OpintotietoRepository;
import fi.csc.virta.opintotieto.repository.YhteiskaksoistutkinnotRepository;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("/Yhteiskaksoistutkinnot")
public class YhteiskaksoistutkinnotController extends OpintotietoController<Yhteiskaksoistutkinnot, Long> {

    @Autowired
    private YhteiskaksoistutkinnotRepository repository;

    @Override
    @ApiOperation(value = "Get all Yhteiskaksoistutkinnot objects as JSON stream", response = Yhteiskaksoistutkinnot.class, responseContainer = "List")
    public void streamAll(HttpServletResponse response) {
        super.streamAll(response);
    }

    @Override
    @ApiOperation(value = "Get all Yhteiskaksoistutkinnot objects as XML stream", response = Yhteiskaksoistutkinnot.class, responseContainer = "List")
    public void streamAllXml(HttpServletResponse response) {
        super.streamAllXml(response);
    }

    @Override
    public OpintotietoRepository<Yhteiskaksoistutkinnot, Long> getRepository() {
        return repository;
    }
}
