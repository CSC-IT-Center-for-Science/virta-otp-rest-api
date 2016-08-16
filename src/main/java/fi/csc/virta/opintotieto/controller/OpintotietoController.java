package fi.csc.virta.opintotieto.controller;

import fi.csc.virta.opintotieto.repository.OpintotietoRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletResponse;
import java.io.Serializable;

public abstract class OpintotietoController<T, E extends Serializable> {

    private Logger log = LoggerFactory.getLogger(getClass());

    @Autowired
    private OpintotietoStreamResponse<T, E> otr;

    @RequestMapping(value = "", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @Transactional(readOnly = true)
    public void streamAll(HttpServletResponse response) {
        log.info("Requesting all as JSON");
        otr.streamJSON(getRepository(), response);
    }

    @RequestMapping(value = "/xml", method = RequestMethod.GET, produces = MediaType.APPLICATION_XML_VALUE)
    @Transactional(readOnly = true)
    public void streamAllXml(HttpServletResponse response) {
        log.info("Requesting all as XML");
        otr.streamXML(getRepository(), response);
    }

    public abstract OpintotietoRepository<T, E> getRepository();
}
