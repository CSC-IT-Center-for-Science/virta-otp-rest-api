package fi.csc.virta.opintotieto.controller;

import fi.csc.virta.opintotieto.entity.AMK8SuoratTK;
import fi.csc.virta.opintotieto.entity.AMKSuoratTKId;
import fi.csc.virta.opintotieto.repository.AMK8SuoratTKRepository;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("/AMK8SuoratTK")
public class AMK8SuoratTKController extends OpintotietoController<AMK8SuoratTK, AMKSuoratTKId> {

    @Autowired
    private AMK8SuoratTKRepository repository;

    @Override
    @ApiOperation(value = "Get all AMK8SuoratTK objects as JSON stream", response = AMK8SuoratTK.class, responseContainer = "List")
    public void streamAll(HttpServletResponse response) {
        super.streamAll(response);
    }

    @Override
    @ApiOperation(value = "Get all AMK8SuoratTK objects as JSON stream", response = AMK8SuoratTK.class, responseContainer = "List")
    public void streamAllXml(HttpServletResponse response) {
        super.streamAllXml(response);
    }

    @Override
    public AMK8SuoratTKRepository getRepository() {
        return repository;
    }
}
