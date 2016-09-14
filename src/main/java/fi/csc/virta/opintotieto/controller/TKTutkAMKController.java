package fi.csc.virta.opintotieto.controller;

import fi.csc.virta.opintotieto.entity.TKTutkAMK;
import fi.csc.virta.opintotieto.repository.OpintotietoRepository;
import fi.csc.virta.opintotieto.repository.TKTutkAMKRepository;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("/TKTutkAMK")
public class TKTutkAMKController extends OpintotietoController<TKTutkAMK, Long> {

    @Autowired
    private TKTutkAMKRepository repository;

    @Override
    @ApiOperation(value = "Get all TKTutkAMK objects as JSON stream", response = TKTutkAMK.class, responseContainer = "List")
    public void streamAll(HttpServletResponse response) {
        super.streamAll(response);
    }

    @Override
    @ApiOperation(value = "Get all TKTutkAMK objects as XML stream", response = TKTutkAMK.class, responseContainer = "List")
    public void streamAllXml(HttpServletResponse response) {
        super.streamAllXml(response);
    }

    @Override
    public OpintotietoRepository<TKTutkAMK, Long> getRepository() {
        return repository;
    }
}
