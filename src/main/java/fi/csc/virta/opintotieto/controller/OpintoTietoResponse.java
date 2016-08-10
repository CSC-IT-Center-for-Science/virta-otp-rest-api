package fi.csc.virta.opintotieto.controller;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator;
import fi.csc.virta.opintotieto.repository.OpintotietoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.servlet.http.HttpServletResponse;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.stream.Stream;

@Component
public class OpintotietoResponse<T, E extends Serializable> {

    @Autowired
    private ObjectMapper om;

    @Autowired
    private EntityManager entityManager;

    public void streamJSON(OpintotietoRepository<T, E> repository, HttpServletResponse response) {
        response.setContentType(MediaType.APPLICATION_JSON_UTF8_VALUE);
        try (Stream<T> entityStream = repository.streamAll()) {
            OutputStream out = response.getOutputStream();
            JsonGenerator jsonGenerator = om.getFactory().createGenerator(out);
            jsonGenerator.writeStartArray();
            entityStream.forEach(entity -> {
                try {
                    om.writeValue(jsonGenerator, entity);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                entityManager.detach(entity);
            });
            jsonGenerator.writeEndArray();
            jsonGenerator.flush();
        } catch (IOException e) {
            throw new RuntimeException("Exception occurred while exporting results", e);
        }
    }

    public void streamXML(OpintotietoRepository<T, E> repository, HttpServletResponse response) {
        response.setContentType(MediaType.APPLICATION_XML_VALUE);
        try (Stream<T> entityStream = repository.streamAll()) {
            OutputStream out = response.getOutputStream();
            XmlMapper xmlMapper = Jackson2ObjectMapperBuilder.xml().build();
            ToXmlGenerator xmlGenerator = xmlMapper.getFactory().createGenerator(out);
            XMLStreamWriter writer = xmlGenerator.getStaxWriter();
            writer.writeStartDocument();
            writer.writeStartElement("Result");
            entityStream.forEach(entity -> {
                try {
                    xmlMapper.writeValue(writer, entity);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                entityManager.detach(entity);
            });
            writer.writeEndElement();
            writer.writeEndDocument();
        } catch (IOException | XMLStreamException e) {
            throw new RuntimeException("Exception occurred while exporting results", e);
        }
    }
}
