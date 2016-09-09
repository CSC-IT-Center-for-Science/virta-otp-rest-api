package fi.csc.virta.opintotieto.controller;

import fi.csc.virta.opintotieto.entity.CIMOLyhytLahteva;
import fi.csc.virta.opintotieto.repository.CIMOLyhytLahtevaRepository;
import fi.csc.virta.opintotieto.repository.OpintotietoRepository;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("/CIMOLyhytLahteva")
public class CIMOLyhytLahtevaController extends OpintotietoController<CIMOLyhytLahteva, Long> {

    @Autowired
    private CIMOLyhytLahtevaRepository repository;

    @Override
    @ApiOperation(value = "Get all CIMOLyhytLahteva objects as JSON stream", response = CIMOLyhytLahteva.class, responseContainer = "List")
    public void streamAll(HttpServletResponse response) {
        super.streamAll(response);
    }

    @Override
    @ApiOperation(value = "Get all CIMOLyhytLahteva objects as XML stream", response = CIMOLyhytLahteva.class, responseContainer = "List")
    public void streamAllXml(HttpServletResponse response) {
        super.streamAllXml(response);
    }

    @Override
    public OpintotietoRepository<CIMOLyhytLahteva, Long> getRepository() {
        return repository;
    }
}
