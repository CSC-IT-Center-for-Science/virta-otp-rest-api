package fi.csc.virta.opintotieto.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "yhteiskaksoistutkinnot")
@JsonPropertyOrder(alphabetic = true)
public class Yhteiskaksoistutkinnot  {
    
    @Id
    private Long id; 	
	
	private Integer ika = 0;
	private String  kansalaisuus = "";
	private String  kk = "";	
	private String  luokittelukoodi = "";	
	private String  oppilaitoskoodi = "";
	private String  opiskelijaavain = "";
	private Integer sukupuoli = 0;
	private String  tutkintokoodi = "";		 
	private Integer tutkintovuosi = 0;

    @JsonIgnore
    public Long getId() {
        return id;
    }

    @JsonIgnore
    public void setId(Long id) {
        this.id = id;
    }

	public Integer getIka() {
        return ika;
    }

    public void setIka(Integer ika) {
        this.ika = ika;
    }	

	public String getKansalaisuus() {
        return kansalaisuus;
    }		
	
    public void setKansalaisuus(String kansalaisuus) {
        this.kansalaisuus = kansalaisuus;
    }	
		
	public String getKk() {
        return kk;
    }		
	
    public void setKk(String kk) {
        this.kk = kk;
    }		
	
	public String getLuokittelukoodi() {
        return  luokittelukoodi;
    }		
	
    public void setLuokittelukoodi(String luokittelukoodi) {
        this.luokittelukoodi = luokittelukoodi;
    }	
		
	public String getOppilaitoskoodi() {
        return oppilaitoskoodi;
    }

    public void setOppilaitoskoodi(String oppilaitoskoodi) {
        this.oppilaitoskoodi = oppilaitoskoodi;
    }	
	

	public Integer getSukupuoli() {
        return sukupuoli;
    }

    public void setSukupuoli(Integer sukupuoli) {
        this.sukupuoli = sukupuoli;
    }	

	public String getOpiskelijaavain() {
        return opiskelijaavain;
    }

    public void setOpiskelijaavain(String opiskelijaavain) {
        this.opiskelijaavain = opiskelijaavain;
    }	
		
	public String getTutkintokoodi() {
        return tutkintokoodi;
    }

    public void setTutkintokoodi(String tutkintokoodi) {
        this.tutkintokoodi = tutkintokoodi;
    }	
	
	public Integer getTutkintovuosi() {
        return  tutkintovuosi;
    }

    public void setTutkintovuosi(Integer tutkintovuosi) {
        this.tutkintovuosi = tutkintovuosi;
    }	
}
