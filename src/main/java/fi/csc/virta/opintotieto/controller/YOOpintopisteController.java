package fi.csc.virta.opintotieto.controller;

import fi.csc.virta.opintotieto.entity.YOOpintopiste;
import fi.csc.virta.opintotieto.repository.YOOpintopisteRepository;
import fi.csc.virta.opintotieto.repository.OpintotietoRepository;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("YOOpintopiste")
public class YOOpintopisteController extends OpintotietoController<YOOpintopiste, Long> {

    @Autowired
    private YOOpintopisteRepository repository;

    @Override
    @ApiOperation(value = "Get all YOOpintopiste objects as JSON stream", response = YOOpintopiste.class, responseContainer = "List")
    public void streamAll(HttpServletResponse response) {
        super.streamAll(response);
    }

    @Override
    @ApiOperation(value = "Get all YOOpintopiste objects as XML stream", response = YOOpintopiste.class, responseContainer = "List")
    public void streamAllXml(HttpServletResponse response) {
        super.streamAllXml(response);
    }

    @Override
    public OpintotietoRepository<YOOpintopiste, Long> getRepository() {
        return repository;
    }
}
