package fi.csc.virta.opintotieto.controller;

import fi.csc.virta.opintotieto.entity.CIMOLyhytSaapuva;
import fi.csc.virta.opintotieto.repository.CIMOLyhytSaapuvaRepository;
import fi.csc.virta.opintotieto.repository.OpintotietoRepository;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("/CIMOLyhytSaapuva")
public class CIMOLyhytSaapuvaController extends OpintotietoController<CIMOLyhytSaapuva, Long> {

    @Autowired
    private CIMOLyhytSaapuvaRepository repository;

    @Override
    @ApiOperation(value = "Get all CIMOLyhytSaapuva objects as JSON stream", response = CIMOLyhytSaapuva.class, responseContainer = "List")
    public void streamAll(HttpServletResponse response) {
        super.streamAll(response);
    }

    @Override
    @ApiOperation(value = "Get all CIMOLyhytSaapuva objects as XML stream", response = CIMOLyhytSaapuva.class, responseContainer = "List")
    public void streamAllXml(HttpServletResponse response) {
        super.streamAllXml(response);
    }

    @Override
    public OpintotietoRepository<CIMOLyhytSaapuva, Long> getRepository() {
        return repository;
    }
}
