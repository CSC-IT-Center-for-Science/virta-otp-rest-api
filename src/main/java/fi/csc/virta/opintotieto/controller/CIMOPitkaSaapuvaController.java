package fi.csc.virta.opintotieto.controller;

import fi.csc.virta.opintotieto.entity.CIMOPitkaSaapuva;
import fi.csc.virta.opintotieto.repository.CIMOPitkaSaapuvaRepository;
import fi.csc.virta.opintotieto.repository.OpintotietoRepository;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("/CIMOPitkaSaapuva")
public class CIMOPitkaSaapuvaController extends OpintotietoController<CIMOPitkaSaapuva, Long> {

    @Autowired
    private CIMOPitkaSaapuvaRepository repository;

    @Override
    @ApiOperation(value = "Get all CIMOPitkaSaapuva objects as JSON stream", response = CIMOPitkaSaapuva.class, responseContainer = "List")
    public void streamAll(HttpServletResponse response) {
        super.streamAll(response);
    }

    @Override
    @ApiOperation(value = "Get all CIMOPitkaSaapuva objects as XML stream", response = CIMOPitkaSaapuva.class, responseContainer = "List")
    public void streamAllXml(HttpServletResponse response) {
        super.streamAllXml(response);
    }

    @Override
    public OpintotietoRepository<CIMOPitkaSaapuva, Long> getRepository() {
        return repository;
    }
}
