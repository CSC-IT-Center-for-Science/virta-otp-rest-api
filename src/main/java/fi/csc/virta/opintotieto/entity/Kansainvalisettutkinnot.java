package fi.csc.virta.opintotieto.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "kansainvalisettutkinnot")
@JsonPropertyOrder(alphabetic = true)
public class Kansainvalisettutkinnot  {
    
    @Id
    private Long id; 	
	
	private Integer kpl = 0;
	private String  luokittelukoodi = "";	
	private String  oppilaitos = "";
	private String  tutkintokoodi = "";		 
	private Integer vuosi = 0;

    @JsonIgnore
    public Long getId() {
        return id;
    }

    @JsonIgnore
    public void setId(Long id) {
        this.id = id;
    }

	public Integer getKpl() {
        return kpl;
    }

    public void setKpl(Integer kpl) {
        this.kpl = kpl;
    }		
	
	public String getLuokittelukoodi() {
        return  luokittelukoodi;
    }		
	
    public void setLuokittelukoodi(String luokittelukoodi) {
        this.luokittelukoodi = luokittelukoodi;
    }	
		
	public String getOppilaitos() {
        return oppilaitos;
    }

    public void setOppilaitos(String oppilaitos) {
        this.oppilaitos = oppilaitos;
    }	
	
	public String getTutkintokoodi() {
        return tutkintokoodi;
    }

    public void setTutkintokoodi(String tutkintokoodi) {
        this.tutkintokoodi = tutkintokoodi;
    }	
	
	public Integer getVuosi() {
        return  vuosi;
    }

    public void setVuosi(Integer vuosi) {
        this.vuosi = vuosi;
    }	
}
