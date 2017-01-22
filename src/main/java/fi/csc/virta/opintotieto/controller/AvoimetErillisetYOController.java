package fi.csc.virta.opintotieto.controller;

import fi.csc.virta.opintotieto.entity.AvoimetErillisetYO;
import fi.csc.virta.opintotieto.repository.OpintotietoRepository;
import fi.csc.virta.opintotieto.repository.AvoimetErillisetYORepository;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("/AvoimetErillisetYO")
public class AvoimetErillisetYOController extends OpintotietoController<AvoimetErillisetYO, Long> {

    @Autowired
    private AvoimetErillisetYORepository repository;

    @Override
    @ApiOperation(value = "Get all AvoimetErillisetYO objects as JSON stream", response = AvoimetErillisetYO.class, responseContainer = "List")
    public void streamAll(HttpServletResponse response) {
        super.streamAll(response);
    }

    @Override
    @ApiOperation(value = "Get all AvoimetErillisetYO objects as XML stream", response = AvoimetErillisetYO.class, responseContainer = "List")
    public void streamAllXml(HttpServletResponse response) {
        super.streamAllXml(response);
    }

    @Override
    public OpintotietoRepository<AvoimetErillisetYO, Long> getRepository() {
        return repository;
    }
}
