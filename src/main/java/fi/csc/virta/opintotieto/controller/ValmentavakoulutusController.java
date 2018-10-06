package fi.csc.virta.opintotieto.controller;

import fi.csc.virta.opintotieto.entity.Valmentavakoulutus;
import fi.csc.virta.opintotieto.repository.OpintotietoRepository;
import fi.csc.virta.opintotieto.repository.ValmentavakoulutusRepository;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("/Valmentavakoulutus")
public class ValmentavakoulutusController extends OpintotietoController<Valmentavakoulutus, Long> {

    @Autowired
    private ValmentavakoulutusRepository repository;

    @Override
    @ApiOperation(value = "Get all Valmentavakoulutus objects as JSON stream", response = Valmentavakoulutus.class, responseContainer = "List")
    public void streamAll(HttpServletResponse response) {
        super.streamAll(response);
    }

    @Override
    @ApiOperation(value = "Get all Valmentavakoulutus objects as XML stream", response = Valmentavakoulutus.class, responseContainer = "List")
    public void streamAllXml(HttpServletResponse response) {
        super.streamAllXml(response);
    }

    @Override
    public OpintotietoRepository<Valmentavakoulutus, Long> getRepository() {
        return repository;
    }
}
