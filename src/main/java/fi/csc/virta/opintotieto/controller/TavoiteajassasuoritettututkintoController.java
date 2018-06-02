package fi.csc.virta.opintotieto.controller;

import fi.csc.virta.opintotieto.entity.Tavoiteajassasuoritettututkinto;
import fi.csc.virta.opintotieto.repository.OpintotietoRepository;
import fi.csc.virta.opintotieto.repository.TavoiteajassasuoritettututkintoRepository;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("/Tavoiteajassasuoritettututkinto")
public class TavoiteajassasuoritettututkintoController extends OpintotietoController<Tavoiteajassasuoritettututkinto, Long> {

    @Autowired
    private TavoiteajassasuoritettututkintoRepository repository;

    @Override
    @ApiOperation(value = "Get all Tavoiteajassasuoritettututkinto objects as JSON stream", response = Tavoiteajassasuoritettututkinto.class, responseContainer = "List")
    public void streamAll(HttpServletResponse response) {
        super.streamAll(response);
    }

    @Override
    @ApiOperation(value = "Get all Tavoiteajassasuoritettututkinto objects as XML stream", response = Tavoiteajassasuoritettututkinto.class, responseContainer = "List")
    public void streamAllXml(HttpServletResponse response) {
        super.streamAllXml(response);
    }

    @Override
    public OpintotietoRepository<Tavoiteajassasuoritettututkinto, Long> getRepository() {
        return repository;
    }
}
