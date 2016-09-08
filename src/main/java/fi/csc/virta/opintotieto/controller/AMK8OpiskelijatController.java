package fi.csc.virta.opintotieto.controller;

import fi.csc.virta.opintotieto.entity.AMK8Opiskelijat;
import fi.csc.virta.opintotieto.repository.AMK8OpiskelijatRepository;
import fi.csc.virta.opintotieto.repository.OpintotietoRepository;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("/AMK8Opiskelijat")
public class AMK8OpiskelijatController extends OpintotietoController<AMK8Opiskelijat, Long> {

    @Autowired
    private AMK8OpiskelijatRepository repository;

    @Override
    @ApiOperation(value = "Get all AMK8Opiskelijat objects as JSON stream", response = AMK8Opiskelijat.class, responseContainer = "List")
    public void streamAll(HttpServletResponse response) {
        super.streamAll(response);
    }

    @Override
    @ApiOperation(value = "Get all AMK8Opiskelijat objects as XML stream", response = AMK8Opiskelijat.class, responseContainer = "List")
    public void streamAllXml(HttpServletResponse response) {
        super.streamAllXml(response);
    }

    @Override
    public OpintotietoRepository<AMK8Opiskelijat, Long> getRepository() {
        return repository;
    }
}
