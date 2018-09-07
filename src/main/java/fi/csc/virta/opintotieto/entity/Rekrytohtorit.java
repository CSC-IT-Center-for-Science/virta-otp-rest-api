package fi.csc.virta.opintotieto.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "rekrytohtorit")
@JsonPropertyOrder(alphabetic = true)
public class Rekrytohtorit  {
    
    @Id
    private Long id; 
	
	private String  henkilonumero = "";	
	private String  rekrykorkeakoulu = "";	
	private Integer tilastovuosi = 0;	 	
	private String  tohtoritutkintokorkeakoulu = "";
	private Integer tohtoritutkintosuoritusvuosi = 0;

    @JsonIgnore
    public Long getId() {
        return id;
    }

    @JsonIgnore
    public void setId(Long id) {
        this.id = id;
    }
	
	public String getHenkilonumero() {
        return henkilonumero;
    }

    public void setHenkilonumero(String henkilonumero) {
        this.henkilonumero = henkilonumero;
    }
	
	public String getRekrykorkeakoulu() {
        return rekrykorkeakoulu;
    }

    public void setRekrykorkeakoulu(String rekrykorkeakoulu) {
        this.rekrykorkeakoulu = rekrykorkeakoulu;
    }
	
	
	public Integer getTilastovuosi() {
        return tilastovuosi;
    }

    public void setTilastovuosi(Integer tilastovuosi) {
        this.tilastovuosi = tilastovuosi;
    }
	
	public String getTohtoritutkintokorkeakoulu() {
        return tohtoritutkintokorkeakoulu;
    }

    public void setTohtoritutkintokorkeakoulu(String tohtoritutkintokorkeakoulu) {
        this.tohtoritutkintokorkeakoulu = tohtoritutkintokorkeakoulu;
    }
	
	public Integer getTohtoritutkintosuoritusvuosi() {
        return  tohtoritutkintosuoritusvuosi;
    }

    public void setTohtoritutkintosuoritusvuosi(Integer tohtoritutkintosuoritusvuosi) {
        this.tohtoritutkintosuoritusvuosi = tohtoritutkintosuoritusvuosi;
    }		
	
}
