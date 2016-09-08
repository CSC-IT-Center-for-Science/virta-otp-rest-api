package fi.csc.virta.opintotieto.controller;

import fi.csc.virta.opintotieto.entity.AMKAvoimenOpintopisteetJarj;
import fi.csc.virta.opintotieto.repository.AMKAvoimenOpintopisteetJarjRepository;
import fi.csc.virta.opintotieto.repository.OpintotietoRepository;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("AMKAvoimenOpintopisteetJarj")
public class AMKAvoimenOpintopisteetJarjController extends OpintotietoController<AMKAvoimenOpintopisteetJarj, Long> {

    @Autowired
    private AMKAvoimenOpintopisteetJarjRepository repository;

    @Override
    @ApiOperation(value = "Get all AMKAvoimenOpintopisteetJarj objects as JSON stream", response = AMKAvoimenOpintopisteetJarj.class, responseContainer = "List")
    public void streamAll(HttpServletResponse response) {
        super.streamAll(response);
    }

    @Override
    @ApiOperation(value = "Get all AMKAvoimenOpintopisteetJarj objects as XML stream", response = AMKAvoimenOpintopisteetJarj.class, responseContainer = "List")
    public void streamAllXml(HttpServletResponse response) {
        super.streamAllXml(response);
    }

    @Override
    public OpintotietoRepository<AMKAvoimenOpintopisteetJarj, Long> getRepository() {
        return repository;
    }
}
