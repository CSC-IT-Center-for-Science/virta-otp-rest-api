package fi.csc.virta.opintotieto.controller;

import fi.csc.virta.opintotieto.entity.AMK7SuoratTK;
import fi.csc.virta.opintotieto.entity.AMKSuoratTKId;
import fi.csc.virta.opintotieto.repository.AMK7SuoratTKRepository;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("/AMK7SuoratTK")
public class AMK7SuoratTKController extends OpintotietoController<AMK7SuoratTK, AMKSuoratTKId> {

    @Autowired
    private AMK7SuoratTKRepository repository;

    @Override
    @ApiOperation(value = "Get all AMK7SuoratTK objects as JSON stream", response = AMK7SuoratTK.class, responseContainer = "List")
    public void streamAll(HttpServletResponse response) {
        super.streamAll(response);
    }

    @Override
    @ApiOperation(value = "Get all AMK7SuoratTK objects as XML stream", response = AMK7SuoratTK.class, responseContainer = "List")
    public void streamAllXml(HttpServletResponse response) {
        super.streamAllXml(response);
    }

    @Override
    public AMK7SuoratTKRepository getRepository() {
        return repository;
    }
}
