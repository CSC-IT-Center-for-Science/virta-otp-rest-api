package fi.csc.virta.opintotieto.controller;

import fi.csc.virta.opintotieto.entity.OpintopistePvmYO;
import fi.csc.virta.opintotieto.repository.OpintopistePvmYORepository;
import fi.csc.virta.opintotieto.repository.OpintotietoRepository;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("OpintopistePvmYO")
public class OpintopistePvmYOController extends OpintotietoController<OpintopistePvmYO, Long> {

    @Autowired
    private OpintopistePvmYORepository repository;

    @Override
    @ApiOperation(value = "Get all OpintopistePvmYO objects as JSON stream", response = OpintopistePvmYO.class, responseContainer = "List")
    public void streamAll(HttpServletResponse response) {
        super.streamAll(response);
    }

    @Override
    @ApiOperation(value = "Get all OpintopistePvmYO objects as XML stream", response = OpintopistePvmYO.class, responseContainer = "List")
    public void streamAllXml(HttpServletResponse response) {
        super.streamAllXml(response);
    }

    @Override
    public OpintotietoRepository<OpintopistePvmYO, Long> getRepository() {
        return repository;
    }
}
