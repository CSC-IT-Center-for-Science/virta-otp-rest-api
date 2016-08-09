package fi.csc.virta.opintotieto.controller;

import fi.csc.virta.opintotieto.repository.OpintotietoRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.persistence.EntityManager;
import javax.servlet.http.HttpServletResponse;
import java.io.Serializable;

public abstract class OpintotietoController<T, E extends Serializable> {

    private Logger log = LoggerFactory.getLogger(getClass());

    @Autowired
    private EntityManager entityManager;

    @RequestMapping(value = "")
    @Transactional(readOnly = true)
    public void streamAll(HttpServletResponse response) {
        log.info("Requesting all as JSON");
        getResponse().streamJSON(getRepository(), response);
    }

    @RequestMapping(value = "/xml")
    @Transactional(readOnly = true)
    public void streamAllXml(HttpServletResponse response) {
        log.info("Requesting all as XML");
        getResponse().streamXML(getRepository(), response);
    }

    public abstract OpintotietoRepository<T, E> getRepository();

    private OpintoTietoResponse<T, E> getResponse() {
        return new OpintoTietoResponse<>(entityManager);
    }
}
