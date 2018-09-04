package fi.csc.virta.opintotieto.controller;

import fi.csc.virta.opintotieto.entity.Tutkinnonsuorittaneetvaihdossapervuosi;
import fi.csc.virta.opintotieto.repository.OpintotietoRepository;
import fi.csc.virta.opintotieto.repository.TutkinnonsuorittaneetvaihdossapervuosiRepository;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("/Tutkinnonsuorittaneetvaihdossapervuosi")
public class TutkinnonsuorittaneetvaihdossapervuosiController extends OpintotietoController<Tutkinnonsuorittaneetvaihdossapervuosi, Long> {

    @Autowired
    private TutkinnonsuorittaneetvaihdossapervuosiRepository repository;

    @Override
    @ApiOperation(value = "Get all Tutkinnonsuorittaneetvaihdossapervuosi objects as JSON stream", response = Tutkinnonsuorittaneetvaihdossapervuosi.class, responseContainer = "List")
    public void streamAll(HttpServletResponse response) {
        super.streamAll(response);
    }

    @Override
    @ApiOperation(value = "Get all Tutkinnonsuorittaneetvaihdossapervuosi objects as XML stream", response = Tutkinnonsuorittaneetvaihdossapervuosi.class, responseContainer = "List")
    public void streamAllXml(HttpServletResponse response) {
        super.streamAllXml(response);
    }

    @Override
    public OpintotietoRepository<Tutkinnonsuorittaneetvaihdossapervuosi, Long> getRepository() {
        return repository;
    }
}
