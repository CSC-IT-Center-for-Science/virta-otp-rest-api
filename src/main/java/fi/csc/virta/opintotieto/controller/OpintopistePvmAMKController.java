package fi.csc.virta.opintotieto.controller;

import fi.csc.virta.opintotieto.entity.OpintopistePvmAMK;
import fi.csc.virta.opintotieto.repository.OpintopistePvmAMKRepository;
import fi.csc.virta.opintotieto.repository.OpintotietoRepository;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("OpintopistePvmAMK")
public class OpintopistePvmAMKController extends OpintotietoController<OpintopistePvmAMK, Long> {

    @Autowired
    private OpintopistePvmAMKRepository repository;

    @Override
    @ApiOperation(value = "Get all OpintopistePvmAMK objects as JSON stream", response = OpintopistePvmAMK.class, responseContainer = "List")
    public void streamAll(HttpServletResponse response) {
        super.streamAll(response);
    }

    @Override
    @ApiOperation(value = "Get all OpintopistePvmAMK objects as XML stream", response = OpintopistePvmAMK.class, responseContainer = "List")
    public void streamAllXml(HttpServletResponse response) {
        super.streamAllXml(response);
    }

    @Override
    public OpintotietoRepository<OpintopistePvmAMK, Long> getRepository() {
        return repository;
    }
}
