package fi.csc.virta.opintotieto.controller;

import fi.csc.virta.opintotieto.entity.YOAvoimenOpintopisteetJarj;
import fi.csc.virta.opintotieto.repository.YOAvoimenOpintopisteetJarjRepository;
import fi.csc.virta.opintotieto.repository.OpintotietoRepository;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("YOAvoimenOpintopisteetJarj")
public class YOAvoimenOpintopisteetJarjController extends OpintotietoController<YOAvoimenOpintopisteetJarj, Long> {

    @Autowired
    private YOAvoimenOpintopisteetJarjRepository repository;

    @Override
    @ApiOperation(value = "Get all YOAvoimenOpintopisteetJarj objects as JSON stream", response = YOAvoimenOpintopisteetJarj.class, responseContainer = "List")
    public void streamAll(HttpServletResponse response) {
        super.streamAll(response);
    }

    @Override
    @ApiOperation(value = "Get all YOAvoimenOpintopisteetJarj objects as XML stream", response = YOAvoimenOpintopisteetJarj.class, responseContainer = "List")
    public void streamAllXml(HttpServletResponse response) {
        super.streamAllXml(response);
    }

    @Override
    public OpintotietoRepository<YOAvoimenOpintopisteetJarj, Long> getRepository() {
        return repository;
    }
}
