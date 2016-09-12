package fi.csc.virta.opintotieto.controller;

import fi.csc.virta.opintotieto.entity.TKEriopePatevyydet;
import fi.csc.virta.opintotieto.repository.OpintotietoRepository;
import fi.csc.virta.opintotieto.repository.TKEriopePatevyydetRepository;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("/TKEriopePatevyydet")
public class TKEriopePatevyydetController extends OpintotietoController<TKEriopePatevyydet, Long> {

    @Autowired
    private TKEriopePatevyydetRepository repository;

    @Override
    @ApiOperation(value = "Get all TKEriopePatevyydet objects as JSON stream", response = TKEriopePatevyydet.class, responseContainer = "List")
    public void streamAll(HttpServletResponse response) {
        super.streamAll(response);
    }

    @Override
    @ApiOperation(value = "Get all TKEriopePatevyydet objects as XML stream", response = TKEriopePatevyydet.class, responseContainer = "List")
    public void streamAllXml(HttpServletResponse response) {
        super.streamAllXml(response);
    }

    @Override
    public OpintotietoRepository<TKEriopePatevyydet, Long> getRepository() {
        return repository;
    }
}
