package fi.csc.virta.opintotieto.controller;

import fi.csc.virta.opintotieto.entity.Rekrytohtorit;
import fi.csc.virta.opintotieto.repository.OpintotietoRepository;
import fi.csc.virta.opintotieto.repository.RekrytohtoritRepository;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("/Rekrytohtorit")
public class RekrytohtoritController extends OpintotietoController<Rekrytohtorit, Long> {

    @Autowired
    private RekrytohtoritRepository repository;

    @Override
    @ApiOperation(value = "Get all Rekrytohtorit objects as JSON stream", response = Rekrytohtorit.class, responseContainer = "List")
    public void streamAll(HttpServletResponse response) {
        super.streamAll(response);
    }

    @Override
    @ApiOperation(value = "Get all Rekrytohtorit objects as XML stream", response = Rekrytohtorit.class, responseContainer = "List")
    public void streamAllXml(HttpServletResponse response) {
        super.streamAllXml(response);
    }

    @Override
    public OpintotietoRepository<Rekrytohtorit, Long> getRepository() {
        return repository;
    }
}
