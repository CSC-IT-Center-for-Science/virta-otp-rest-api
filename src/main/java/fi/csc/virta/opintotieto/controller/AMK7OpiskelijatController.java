package fi.csc.virta.opintotieto.controller;

import fi.csc.virta.opintotieto.entity.AMK7Opiskelijat;
import fi.csc.virta.opintotieto.repository.AMK7OpiskelijatRepository;
import fi.csc.virta.opintotieto.repository.OpintotietoRepository;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("/AMK7Opiskelijat")
public class AMK7OpiskelijatController extends OpintotietoController<AMK7Opiskelijat, Long> {

    @Autowired
    private AMK7OpiskelijatRepository repository;

    @Override
    @ApiOperation(value = "Get all AMK7Opiskelijat objects as JSON stream", response = AMK7Opiskelijat.class, responseContainer = "List")
    public void streamAll(HttpServletResponse response) {
        super.streamAll(response);
    }

    @Override
    @ApiOperation(value = "Get all AMK7Opiskelijat objects as XML stream", response = AMK7Opiskelijat.class, responseContainer = "List")
    public void streamAllXml(HttpServletResponse response) {
        super.streamAllXml(response);
    }

    @Override
    public OpintotietoRepository<AMK7Opiskelijat, Long> getRepository() {
        return repository;
    }
}
