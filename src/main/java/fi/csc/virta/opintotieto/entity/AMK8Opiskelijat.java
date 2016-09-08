package fi.csc.virta.opintotieto.entity;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "amk8_opiskelijat")
@JsonPropertyOrder(alphabetic = true)
public class AMK8Opiskelijat extends AMKOpiskelijat {

}
