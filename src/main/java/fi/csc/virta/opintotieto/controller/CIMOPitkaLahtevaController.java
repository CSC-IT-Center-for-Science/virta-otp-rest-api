package fi.csc.virta.opintotieto.controller;

import fi.csc.virta.opintotieto.entity.CIMOPitkaLahteva;
import fi.csc.virta.opintotieto.repository.CIMOPitkaLahtevaRepository;
import fi.csc.virta.opintotieto.repository.OpintotietoRepository;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("/CIMOPitkaLahteva")
public class CIMOPitkaLahtevaController extends OpintotietoController<CIMOPitkaLahteva, Long> {

    @Autowired
    private CIMOPitkaLahtevaRepository repository;

    @Override
    @ApiOperation(value = "Get all CIMOPitkaLahteva objects as JSON stream", response = CIMOPitkaLahteva.class, responseContainer = "List")
    public void streamAll(HttpServletResponse response) {
        super.streamAll(response);
    }

    @Override
    @ApiOperation(value = "Get all CIMOPitkaLahteva objects as XML stream", response = CIMOPitkaLahteva.class, responseContainer = "List")
    public void streamAllXml(HttpServletResponse response) {
        super.streamAllXml(response);
    }

    @Override
    public OpintotietoRepository<CIMOPitkaLahteva, Long> getRepository() {
        return repository;
    }
}
