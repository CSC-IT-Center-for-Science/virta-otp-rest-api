package fi.csc.virta.opintotieto.controller;

import fi.csc.virta.opintotieto.entity.YO6AvoimetErillisetSummataulukko;
import fi.csc.virta.opintotieto.repository.OpintotietoRepository;
import fi.csc.virta.opintotieto.repository.YO6AvoimetErillisetSummataulukkoRepository;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("YO6AvoimetErillisetSummataulukko")
public class YO6AvoimetErillisetSummataulukkoController extends OpintotietoController<YO6AvoimetErillisetSummataulukko, Long> {

    @Autowired
    private YO6AvoimetErillisetSummataulukkoRepository repository;

    @Override
    @ApiOperation(value = "Get all YO6AvoimetErillisetSummataulukko objects as JSON stream", response = YO6AvoimetErillisetSummataulukko.class, responseContainer = "List")
    public void streamAll(HttpServletResponse response) {
        super.streamAll(response);
    }

    @Override
    @ApiOperation(value = "Get all YO6AvoimetErillisetSummataulukko objects as XML stream", response = YO6AvoimetErillisetSummataulukko.class, responseContainer = "List")
    public void streamAllXml(HttpServletResponse response) {
        super.streamAllXml(response);
    }

    @Override
    public OpintotietoRepository<YO6AvoimetErillisetSummataulukko, Long> getRepository() {
        return repository;
    }
}
