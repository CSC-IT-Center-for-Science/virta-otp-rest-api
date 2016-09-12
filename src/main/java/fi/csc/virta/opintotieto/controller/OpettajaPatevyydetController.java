package fi.csc.virta.opintotieto.controller;

import fi.csc.virta.opintotieto.entity.OpettajaPatevyydet;
import fi.csc.virta.opintotieto.repository.OpettajaPatevyydetRepository;
import fi.csc.virta.opintotieto.repository.OpintotietoRepository;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("/OpettajaPatevyydet")
public class OpettajaPatevyydetController extends OpintotietoController<OpettajaPatevyydet, Long> {

    @Autowired
    private OpettajaPatevyydetRepository repository;

    @Override
    @ApiOperation(value = "Get all OpettajaPatevyydet objects as JSON stream", response = OpettajaPatevyydet.class, responseContainer = "List")
    public void streamAll(HttpServletResponse response) {
        super.streamAll(response);
    }

    @Override
    @ApiOperation(value = "Get all OpettajaPatevyydet objects as XML stream", response = OpettajaPatevyydet.class, responseContainer = "List")
    public void streamAllXml(HttpServletResponse response) {
        super.streamAllXml(response);
    }

    @Override
    public OpintotietoRepository<OpettajaPatevyydet, Long> getRepository() {
        return repository;
    }
}
